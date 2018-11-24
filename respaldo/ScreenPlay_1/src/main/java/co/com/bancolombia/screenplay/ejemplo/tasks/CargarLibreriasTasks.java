package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.CargarLibreriasUserInterfaces.CARGARLIBRERIAS;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.MenuAIP.POSICION1001;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.UmenuUserInterfaces.AIP;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.VentanaMenuSubmenuUserInterfaces.POSICION1;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CargarLibreriasTasks implements Task{

	private static MyExtra myExtra;

	
	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static CargarLibreriasTasks al() {
		return instrumented(CargarLibreriasTasks.class);
				}

	@Override
	public <T extends Actor> void performAs(T actor) {
	String librerias = "CIBLIBRAMD\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
			"STILIBRP\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"WEBLIBRP\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"WEBLIBRAMD\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"BVDLIBRP\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"BVDLIBRAMD\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"RDILIBPA\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + 
			"RDILIBRAMD";
	

		
		actor.attemptsTo(
				Enter.theValue("1").into(AIP),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1001),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ROLLUP>"),
				Enter.theValue(librerias).into(CARGARLIBRERIAS),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<PF12>"),
				Hit.theKey("<PF12>")
				);
		
	
	
		}
}
