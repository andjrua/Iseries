package co.com.bancolombia.screenplay.ejemplo.questions;

import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.MenuAIP.POSICIONBUSCARRESULTADO;
import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.MenuAIP.RESULTADO;

import com.bancolombia.myextra.interactions.Enter;
import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.interactions.Text;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Comparacion implements Question<String> {

	
	
	
	
	@Override
	public String answeredBy(Actor actor) {
	
		actor.attemptsTo(
				Enter.theValue("250").into(POSICIONBUSCARRESULTADO),
				Hit.theKey("<ENTER>")
								);
		
		return Text.of(RESULTADO);
	
		

	}

	public static Comparacion is ()  {
		return new Comparacion();
	}	
	

}
