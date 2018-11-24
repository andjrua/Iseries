package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.CargarLibreriasUserInterfaces.CARGARLIBRERIAS;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SubMenu.POSICION1001;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.UmenuUserInterfaces.TVP;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.VentanaMenuSubmenuUserInterfaces.POSICION1;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CargarLibreriasTasks implements Task{

	private static MyExtra myExtra;
	private String librerias;
	
	public static MyExtra sesion() {
		return myExtra;
	}
	
	public CargarLibreriasTasks(String librerias) {
		this.librerias = librerias;
	}
	
	public static CargarLibreriasTasks al(String librerias) {
		return instrumented(CargarLibreriasTasks.class, librerias);
				}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	

		
		actor.attemptsTo(
				Enter.theValue("1").into(TVP),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1001),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1001),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(OPCION),
				Hit.theKey("<ENTER>"),
				Enter.theValue("4").into(OPCION),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ENTER>"),
				Enter.theValue(librerias).into(CARGARLIBRERIAS),
				Hit.theKey("<ENTER>"),
				Enter.theValue("MATLIBRAMD").into(CARGARLIBRERIAS),
				Hit.theKey("<ENTER>"),
				Enter.theValue("AMBLIBRA").into(CARGARLIBRERIAS),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<PF12>")
				);
		
	
	
		}
}
