package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SometerTrabajo.*;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ChgDta implements Task {

	private static MyExtra myExtra;
	private final String dta;
	private final String lib;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static ChgDta al(String dta, String lib) {
		return instrumented(ChgDta.class, dta, lib);
				}
	
	
	public ChgDta(String dta, String lib) {
		this.dta = dta;
		this.lib = lib;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("7").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue("CHGDTAARA " + dta).into(MANDATO_SBM),
				Hit.theKey("<PF4>"),
				Enter.theValue(lib).into(LIB_DAT),
				Enter.theValue("1   ").into(INI_SUB),
				Enter.theValue("5").into(LONG_SUB),
				Enter.theValue("'00000'").into(VAL_SUB),
				Hit.theKey("<ENTER>"),
				Enter.theValue("JJJJJJJ").into(NOMBREJOB_SBM),
				Enter.theValue("EABJOBD").into(DESCRIPCIONJOB_SBM),
				Enter.theValue(lib).into(BIBLIOTECA_SBM),
				Hit.theKey("<PF10>"),
				Hit.theKey("<ROLLUP>"),
				Enter.theValue("*JOBD   ").into(USUARIO_SBM),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>")
				);

		}
}
