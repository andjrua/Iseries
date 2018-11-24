package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.MenuAIP.POSICIONSQL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Consultar implements Task {

	private String miembro;
	
	public Consultar (String miembro) {
		this.miembro = miembro;
	}
	
	
	public static Performable el(String miembro) {
		return instrumented(Consultar.class, miembro);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String query = "SELECT * FROM BVDLIBRAMD.BVDFFLGSTI WHERE LGMIEMBRO = '" + miembro + "'";
		System.out.println(query);
				actor.attemptsTo(
				Enter.theValue(query).into(POSICIONSQL),
				Hit.theKey("<ENTER>")
				);
			
	}

}
