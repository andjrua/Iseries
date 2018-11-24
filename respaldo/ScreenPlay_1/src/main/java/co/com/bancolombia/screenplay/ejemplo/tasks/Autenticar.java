package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.LoginPage.CONTRASENA;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.LoginPage.USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.interactions.OpenMyExtra;

import co.com.bancolombia.screenplay.ejemplo.model.Usuario;
import co.com.bancolombia.screenplay.ejemplo.util.Edp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Autenticar implements Task {
	
	private Usuario usuario;
	
	public Autenticar(Usuario usuario) {
		this.usuario = usuario;
	}

	public static Autenticar al(Usuario usuario) {
		return instrumented(Autenticar.class, usuario);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				OpenMyExtra.withSession(Edp.CALIDAD.getRuta()),
				Enter.theValue(usuario.getUsuario()).into(USUARIO),
				Enter.theValue(usuario.getContrasena()).into(CONTRASENA),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>")
				);
	}

}
