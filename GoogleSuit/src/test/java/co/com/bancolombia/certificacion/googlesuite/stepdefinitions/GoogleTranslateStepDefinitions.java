package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;


import static org.hamcrest.CoreMatchers.equalTo;
import co.com.bancolombia.certificacion.googlesuit.questions.Comparation;
import co.com.bancolombia.certificacion.googlesuit.tasks.GoTo;
import co.com.bancolombia.certificacion.googlesuit.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuit.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
   
public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	@Before
	public void setup() {
		susan.can(BrowseTheWeb.with(herBrowser));
		
	}

	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.wasAbleTo(OpenTheBrowser.on(),
			GoTo.theApp());
	}

	@When("^she transaltes the word (.*) from English to Spanish$")
	public void sheTransaltesTheWordCheeseFromEnglishToSpanish(String sword) throws Exception {
	    	//Condiciones: Traducir una palabra de inglés a español
		susan.wasAbleTo(Translate.the(sword));
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen(String tword) throws Exception {
	    susan.should(seeThat(Comparation.is(),equalTo(tword )));	
		//Postcondiciones-Consecuencias: Aparece la palabra traducida, Verificción
	}	
	
	
}
