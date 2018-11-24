package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class OpenMyExtra implements Interaction{

	private String rutaEdp;
	private Long wait=(long)4000 ;
	
	public OpenMyExtra(String rutaEdp) {
		this.rutaEdp=rutaEdp;
	}
	
	@Step("{0} open MyExtra with session #rutaEdp")
	public <T extends Actor> void performAs(T actor) {
		MyExtra.iniciarMyExtra(rutaEdp, wait);
	}
	
	public static OpenMyExtra withSession(String rutaEdp) {
		return Tasks.instrumented(OpenMyExtra.class, rutaEdp);
	}

	public OpenMyExtra andWait(Long wait) {
		this.wait=wait;
		return this;
	}
}
