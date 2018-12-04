package co.com.bancolombia.screenplay.ejemplo.stepdefinitions;

import static co.com.bancolombia.screenplay.ejemplo.model.builder.UsuarioBuilder.usuario;
//import static co.com.bancolombia.screenplay.ejemplo.model.builder.SQLBuilder.query;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

//import com.bancolombia.myextra.interactions.CloseMyExtra;

import co.com.bancolombia.screenplay.ejemplo.tasks.Autenticar;
import co.com.bancolombia.screenplay.ejemplo.tasks.ChgDta;
import co.com.bancolombia.screenplay.ejemplo.tasks.Conectar;
import co.com.bancolombia.screenplay.ejemplo.tasks.Consultar;
import co.com.bancolombia.screenplay.ejemplo.tasks.SubmitJob;
import co.com.bancolombia.screenplay.ejemplo.tasks.StarTVP;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EABFOCGAStepDefinitions {
	
	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}	

	@Given("^I authentic with (.*) (.*)$")
	public void i_authentic_with(String user, String pass) throws Exception {
		theActorCalled("Jorge").wasAbleTo(Autenticar.al(usuario(user).conContrasena(pass)),StarTVP.al());
	}

	@Given("^Update the (.*) (.*) (.*) (.*) (.*)$")
	public void update_the(String dta, String lib, String ini, String lon, String dig) throws Exception {
		theActorCalled("Jorge").wasAbleTo(ChgDta.al(dta, lib, ini, lon, dig));
	}

	@When("^I submit (.*) (.*)$")
	public void i_submit(String prog, String name) throws Exception {
		theActorCalled("Jorge").wasAbleTo(SubmitJob.al(prog, name));
		//theActorCalled("Jorge").wasAbleTo(CloseMyExtra.now());
	}
	
	@Given("^I connect with myextra$")
	public void i_connect_with_myextra() throws Exception {
		theActorCalled("Jorge").wasAbleTo(Conectar.al());
	}
	
	@When("^Make a sql$")
	public void makeASqlSELECTTDCLIBRAMDRMUFFVISA() throws Exception {
		theActorCalled("Jorge").wasAbleTo(Consultar.el());
	}
	
	@Then("^Verify the table$")
	public void verify_the_table() throws Exception {

	}
}
