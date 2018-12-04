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
	private final String ini;
	private final String lon;
	private final String dig;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static ChgDta al(String dta, String lib, String ini, String lon, String dig) {
		return instrumented(ChgDta.class, dta, lib, ini, lon, dig);
				}
	
	
	public ChgDta(String dta, String lib, String ini, String lon, String dig) {
		this.dta = dta;
		this.lib = lib;
		this.dig = dig;
		this.ini = ini;
		this.lon = lon;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("7").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue("CHGDTAARA " + dta).into(MANDATO_SBM),
				Hit.theKey("<PF4>"),
				Enter.theValue(lib).into(LIB_DAT),
				Enter.theValue(ini).into(INI_SUB),
				Hit.theKey("<DELETE>"),
				Hit.theKey("<DELETE>"),
				Hit.theKey("<DELETE>"),
				Enter.theValue(lon).into(LONG_SUB),
				Enter.theValue("'" + dig + "'").into(VAL_SUB),
				Hit.theKey("<ENTER>"),
				Enter.theValue(dta.substring(0, 3)+"CHDT").into(NOMBREJOB_SBM),
				Enter.theValue(dta.substring(0, 3)+"JOBD").into(DESCRIPCIONJOB_SBM),
				Enter.theValue(dta.substring(0, 3)+"LIBRAMD").into(BIBLIOTECA_SBM),
				Hit.theKey("<PF10>"),
				Hit.theKey("<ROLLUP>"),
				Enter.theValue("*JOBD   ").into(USUARIO_SBM),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>")
				);

		}
}
