package com.bancolombia.myextra.interactions;


import com.bancolombia.myextra.controller.MyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Hit implements Interaction{

	private String key;
	private long wait=0;
	
	public Hit(String key) {
		this.key=key;
	}
	
	@Step("{0} sendkey #key")
	public <T extends Actor> void performAs(T actor) {
		MyExtra.sesion().EnviarTeclas(key, wait);
	}
	
	public static Hit theKey(String key) {
		return Tasks.instrumented(Hit.class, key);
	}

	public Hit andWait(Long wait) {
		this.wait=wait;
		return this;
	}
}
