package co.com.bancolombia.certificacion.googlesuit.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuit.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task {

	@Override
	@Step("{0} Open the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
	}

}
