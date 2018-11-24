package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.UmenuUserInterfaces.AIP;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.VentanaMenuSubmenuUserInterfaces.POSICION1;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.MenuAIP.POSICION1003;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Umenu implements Task {
	
	public static Umenu al() {
		return instrumented(Umenu.class);
				}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue("1").into(AIP),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1003),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>")
				);
		
	}
	

}
