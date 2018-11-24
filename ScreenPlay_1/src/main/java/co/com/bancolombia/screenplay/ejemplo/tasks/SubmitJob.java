package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.BIBLIOTECA_SBM;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.DESCRIPCIONJOB_SBM;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.MANDATO_SBM;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.NOMBREJOB_SBM;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.USUARIO_SBM;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SubmitJob implements Task {

	private static MyExtra myExtra;
	private final String programa;
	private final String name;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static SubmitJob al(String programa, String name) {
		return instrumented(SubmitJob.class, programa, name);
				}
	
	
	public SubmitJob(String programa, String name) {
		this.programa = programa;
		this.name = name;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("7").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue("CALL " + programa).into(MANDATO_SBM),
				Enter.theValue(name).into(NOMBREJOB_SBM),
				Enter.theValue(name.substring(0, 3)+"JOBD").into(DESCRIPCIONJOB_SBM),
				Enter.theValue(name.substring(0, 3)+"LIBRAMD").into(BIBLIOTECA_SBM),
				Hit.theKey("<PF10>"),
				Hit.theKey("<ROLLUP>"),
				Enter.theValue("*JOBD   ").into(USUARIO_SBM)
				//Hit.theKey("<ENTER>")
				);

		}
}
