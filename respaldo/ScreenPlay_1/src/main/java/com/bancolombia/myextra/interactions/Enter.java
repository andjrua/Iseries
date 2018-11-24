package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.objects.TargetMyExtra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Enter implements Interaction{


	private TargetMyExtra targetMyExtra;
	private String name,data;
	private int row,col;
	
	public Enter(String data) {
		this.data=data;
	}
	
	@Step("{0} enter the value #data into field #name (#row,#col)")
	public <T extends Actor> void performAs(T actor) {
		MyExtra.sesion().IngresarTexto(data, row, col);
	}
	
	public static Enter theValue(String data) {
		return Tasks.instrumented(Enter.class, data);
	}

	public Enter into(TargetMyExtra targetMyExtra) {
		this.name=targetMyExtra.getName();
		this.row=targetMyExtra.getRow();
		this.col=targetMyExtra.getCol();
		return this;
	}
}
