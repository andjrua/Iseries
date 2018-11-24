package co.com.bancolombia.certificacion.googlesuit.tasks;

import co.com.bancolombia.certificacion.googlesuit.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {

	
	private String sword ;
	
	public Translate(String sword) {
		this.sword = sword;
	}
	
	
	@Override
	public <T extends Actor> void performAs (T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
			Click.on(GoogleTranslatePage.SOURCE_LANGUAGE), 
			Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
			Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
			Enter.theValue(sword).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA),
			Click.on(GoogleTranslatePage.TRASLATE_BUTTON));
		
	}

	public static Translate the(String sword) {
		return Tasks.instrumented(Translate.class, sword);
		
				
	}


		
	}
	


