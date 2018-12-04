package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

//import co.com.bancolombia.screenplay.ejemplo.model.SQL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Consultar implements Task {

	//private SQL query;
	public String sql = "SELECT ROW_NUMBER() OVER() ID, COUNT(CDGTRN) CONT,CDGTRN"
			+ " FROM MATLIBRAMD.MATFFGENPL"
			+ " GROUP BY CDGTRN ORDER BY CDGTRN";
	
	public Consultar (/*SQL query*/) {
		//this.query = query;
	}
	
	
	public static Performable el(/*SQL query*/) {
		return instrumented(Consultar.class/*, query*/);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("11").into(OPCION),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ROLLUP>"),
				Hit.theKey("<ROLLUP>"),
				Hit.theKey("<ROLLUP>"),
				Hit.theKey(sql),
				Hit.theKey("<ENTER>")
				);
			
	}

}
