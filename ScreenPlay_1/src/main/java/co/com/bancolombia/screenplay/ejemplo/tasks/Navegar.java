package co.com.bancolombia.screenplay.ejemplo.tasks;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SubMenu.*;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.TVPMenuPruebas.OPCION;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.UmenuUserInterfaces.*;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.GeneralStaticPage.OPCION_Static;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.VentanaMenuSubmenuUserInterfaces.POSICION1;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@SuppressWarnings("unused")
public class Navegar implements Task {

	private static MyExtra myExtra;
	private final TargetMyExtra seleccion;
	private final String option1, option2;

	public static MyExtra sesion() {
		return myExtra;
	}
	
	public static Navegar al(TargetMyExtra seleccion, String option1, String option2) {
		return instrumented(Navegar.class, seleccion, option1, option2);
				}
	
	
	public Navegar(TargetMyExtra seleccion, String option1, String option2) {
		this.seleccion = seleccion;
		this.option1 = option1;
		this.option2 = option2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("1").into(seleccion),
				Hit.theKey("<ENTER>"),
				Enter.theValue("1").into(POSICION1),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<ROLLUP>"),
				Hit.theKey("<ROLLUP>"),
				Enter.theValue("1").into(POSICION1003),
				Hit.theKey("<ENTER>"),
				Enter.theValue(option1).into(OPCION_Static),
				Hit.theKey("<ENTER>"),
				Enter.theValue(option2).into(OPCION_Static),
				Hit.theKey("<ENTER>"),
				Hit.theKey("<LEFT>")
				);
		}

}
