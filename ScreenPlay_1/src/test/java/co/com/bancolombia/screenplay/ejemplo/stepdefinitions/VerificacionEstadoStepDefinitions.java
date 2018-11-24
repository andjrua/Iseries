package co.com.bancolombia.screenplay.ejemplo.stepdefinitions;

import static co.com.bancolombia.screenplay.ejemplo.model.builder.UsuarioBuilder.usuario;
//import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;

import co.com.bancolombia.screenplay.ejemplo.questions.Comparacion;
import com.bancolombia.myextra.interactions.CloseMyExtra;
//import com.bancolombia.myextra.objects.TargetMyExtra;
//import com.bancolombia.myextra.interactions.Text;
//import com.bancolombia.myextra.objects.TargetMyExtra;

import co.com.bancolombia.screenplay.ejemplo.tasks.Autenticar;
import co.com.bancolombia.screenplay.ejemplo.tasks.CargarLibreriasTasks;
import co.com.bancolombia.screenplay.ejemplo.tasks.MakeCall;
import co.com.bancolombia.screenplay.ejemplo.tasks.Navegar;

//import co.com.bancolombia.screenplay.ejemplo.tasks.Consultar;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.UmenuUserInterfaces.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class VerificacionEstadoStepDefinitions {

	public String pantalla1;
	public String pantalla2;
	private String user, pass;

	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}	
	
	@Given("^que me autentico con usuario (.*) y contraseña (.*)$")
	public void que_me_autentico_con_(String usuario, String contrasena) throws Exception {
		user = usuario;
		pass = contrasena;
		theActorCalled("Jorge").wasAbleTo(Autenticar.al(usuario(user).conContrasena(pass)));    
	}
	
	@Given("^introduce a library (.*)$")
	public void introduce_a_library (String library) throws Exception {
		theActorCalled("Jorge").wasAbleTo(CargarLibreriasTasks.al(library));
	}

	@When("^I search the menu (.*) (.*) (.*)$")
	public void i_search_the_menu(String programa, String option1, String option2) throws Exception {
		theActorCalled("Jorge").wasAbleTo(MakeCall.al(programa));
		pantalla1= theActorCalled("Jorge").asksFor(Comparacion.is());
		theActorCalled("Jorge").wasAbleTo(CloseMyExtra.now());
		theActorCalled("Jorge").wasAbleTo(Autenticar.al(usuario(user).conContrasena(pass)),Navegar.al(Y, option1, option2));
		pantalla2= theActorCalled("Jorge").asksFor(Comparacion.is());
		theActorCalled("Jorge").wasAbleTo(CloseMyExtra.now());
	}

	@Then("^Verifico identidad$")
	public void verifico_identidad() throws Exception {
		System.out.println(pantalla1);
		System.out.println(pantalla2);
		assertTrue("Pantallas Diferentes", pantalla1.equals(pantalla2));	
	}
	
	
	
}
