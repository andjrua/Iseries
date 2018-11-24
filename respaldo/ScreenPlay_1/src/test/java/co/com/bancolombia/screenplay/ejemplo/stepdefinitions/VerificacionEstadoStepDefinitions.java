package co.com.bancolombia.screenplay.ejemplo.stepdefinitions;

import static co.com.bancolombia.screenplay.ejemplo.model.builder.UsuarioBuilder.usuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;

import co.com.bancolombia.screenplay.ejemplo.questions.Comparacion;
import co.com.bancolombia.screenplay.ejemplo.tasks.Autenticar;
import co.com.bancolombia.screenplay.ejemplo.tasks.CargarLibreriasTasks;
import co.com.bancolombia.screenplay.ejemplo.tasks.Consultar;
import co.com.bancolombia.screenplay.ejemplo.tasks.Umenu;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class VerificacionEstadoStepDefinitions {

	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Dado("^que me autentico con usuario (.*) y contraseña (.*)$")
	public void que_me_autentico_con_(String usuario, String contrasena) throws Exception {
		theActorCalled("Cesar").wasAbleTo(
	    		Autenticar.al(usuario(usuario).conContrasena(contrasena))
	    		);    
	}


	@Cuando("^realizo una consulta en SQL para el miembro (.*)$")
	public void realizo_una_consulta_en_SQL_para_el_miembro_st(String miembro) throws Exception {
		theActorCalled("Cesar").wasAbleTo(
	    		CargarLibreriasTasks.al(),
				Umenu.al(),
	    		Consultar.el(miembro)
	    		);    
	}

	@Entonces("^deberia ver el estado del miembro igual a (.*)$")
	public void deberia_ver_el_estado_del_miembro_igual_a(String resultado) throws Exception {
		theActorCalled("Cesar").should(seeThat(Comparacion.is(),equalTo(resultado)));
				
						
	}

	
	
	
	
}
