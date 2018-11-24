package co.com.bancolombia.screenplay.ejemplo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/autenticar.feature"},
		glue = {"co.com.bancolombia.screenplay.ejemplo.stepdefinitions"}
		)
public class Autenticar {

}
