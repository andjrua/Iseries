package co.com.bancolombia.screenplay.ejemplo.questions;

//import static co.com.bancolombia.screenplay.ejemplo.userinterfaces.SubMenu.POSICION1001;
//import com.bancolombia.myextra.interactions.Enter;
//import com.bancolombia.myextra.interactions.Hit;
import com.bancolombia.myextra.interactions.Text;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Comparacion implements Question<String> {
	
	
	
	@Override
	public String answeredBy(Actor actor) {
	
		actor.attemptsTo();
		
		try{
	        Integer.parseInt(Text.of(TargetMyExtra.the("Numero de Opcion").locatedBy(2, 76, 2)));
	        return Text.of(TargetMyExtra.the("Numero de Opcion").locatedBy(1, 1, 152)) + "     " + Text.of(TargetMyExtra.the("Numero de Opcion").locatedBy(2, 78, 1683));
	    }catch(NumberFormatException e){
	        return Text.of(TargetMyExtra.the("Numero de Opcion").locatedBy(1, 1, 1840));
	    }
		
		

	}

	public static Comparacion is ()  {
		return new Comparacion();
	}	
	

}
