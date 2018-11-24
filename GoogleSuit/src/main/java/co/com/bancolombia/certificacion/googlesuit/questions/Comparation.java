package co.com.bancolombia.certificacion.googlesuit.questions;

import co.com.bancolombia.certificacion.googlesuit.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Comparation implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
	return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();
	}

	public static Comparation is ()  {
		return new Comparation();
	}	
}
