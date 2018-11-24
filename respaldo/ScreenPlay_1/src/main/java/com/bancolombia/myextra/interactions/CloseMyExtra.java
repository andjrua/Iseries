package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class CloseMyExtra implements Interaction{
	
	@Step("{0} close MyExtra")
	public <T extends Actor> void performAs(T actor) {	
		MyExtra.sesion().cerrarMyExtra();
	}
	
	public static CloseMyExtra now() {
		return Tasks.instrumented(CloseMyExtra.class);
	}

}
