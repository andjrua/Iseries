package co.com.bancolombia.certificacion.googlesuit.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google apps component").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google translate Option").located(By.id("gb51"));

}
