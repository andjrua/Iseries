package co.com.bancolombia.screenplay.ejemplo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.interactions.OpenMyExtra;

import co.com.bancolombia.screenplay.ejemplo.util.Edp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Conectar implements Task {
	

	
	public Conectar() {
	}

	public static Conectar al() {
		return instrumented(Conectar.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				OpenMyExtra.withSession(Edp.CALIDAD.getRuta())
				);
	}

}
