package co.com.bancolombia.certificacion.googlesuit.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language option button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language option button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//div[@id=\"gt-sl-gms-menu\"]/table/tbody/tr/td//div[contains(text(), 'ngl�s')]");
	public static final Target TARGET_LANGUAGE = Target.the("Target language").locatedBy("//div[@id=\"gt-tl-gms-menu\"]/table/tbody/tr/td//div[contains(text(), 'espa�ol')]");
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source language text area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result").located(By.id("gt-res-content"));
	public static final Target TRASLATE_BUTTON = Target.the("Button to translate").located(By.id("gt-submit"));
}