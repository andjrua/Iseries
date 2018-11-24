package co.com.bancolombia.screenplay.ejemplo.stepdefinitions;

import static co.com.bancolombia.screenplay.ejemplo.model.builder.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.bancolombia.screenplay.ejemplo.tasks.Autenticar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AutenticarStepDefinitions {
	
	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Cuando("^me autentico con usuario (.*) y contraseña (.*)$")
	public void meAutentico(String usuario, String contrasena) throws Exception {
	    theActorCalled("Cesar").wasAbleTo(
	    		Autenticar.al(usuario(usuario).conContrasena(contrasena))
	    		);
	}

	@Entonces("^deberia ver las opcion (.*)$")
	public void deberiaVerLaOpcion(String opcion) throws Exception {
	   
	
		
	}

}
