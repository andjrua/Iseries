package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.LlamarPrograma.PROGRAMA_CALL;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;



public class MakeCall implements Task {

	private static MyExtra myExtra;
	private final String programa;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static MakeCall al(String programa) {
		return instrumented(MakeCall.class, programa);
				}
	
	
	public MakeCall(String programa) {
		this.programa = programa;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("1").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue(programa).into(PROGRAMA_CALL),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<LEFT>")
				);

		}
}
