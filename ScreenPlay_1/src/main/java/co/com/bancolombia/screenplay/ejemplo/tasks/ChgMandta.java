package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.LlamarPrograma.PROGRAMA_CALL;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ChgMandta implements Task {

	private static MyExtra myExtra;
	private final String dta;
	private final String lib;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static ChgMandta la(String dta, String lib) {
		return instrumented(ChgMandta.class, dta, lib);
				}
	
	
	public ChgMandta(String dta, String lib) {
		this.dta = dta;
		this.lib = lib;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("1").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue("TDCOMANDTA").into(PROGRAMA_CALL),
				Hit.theKey("<ENTER>"),
				Enter.theValue(dta).into(TargetMyExtra.the("Numero de Opcion").locatedBy(5, 48, 10)),
				Enter.theValue(lib).into(TargetMyExtra.the("Numero de Opcion").locatedBy(5, 17, 10)),
				Enter.theValue("1").into(TargetMyExtra.the("Numero de Opcion").locatedBy(7, 9, 1))
				//Hit.theKey("<ENTER>")
				);

		}
}
