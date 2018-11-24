package co.com.bancolombia.certificacion.googlesuit.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuit.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.runners.GoogleTranslateRunner;

public class GoTo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	public static GoTo theApp() {
		return instrumented(GoTo.class);
	}

}
