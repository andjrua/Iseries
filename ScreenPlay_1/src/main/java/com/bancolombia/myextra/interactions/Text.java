package com.bancolombia.myextra.interactions;

import com.bancolombia.myextra.controller.MyExtra;
import com.bancolombia.myextra.objects.TargetMyExtra;

public class Text {

	@SuppressWarnings("unused")
	private static String name;
	private static int row,col,lenght;
	
	public static String of(TargetMyExtra targetMyExtra) {
		name=targetMyExtra.getName();
		row=targetMyExtra.getRow();
		col=targetMyExtra.getCol();
		lenght=targetMyExtra.getLenght();
		return MyExtra.sesion().LeerTexto(row, col, lenght);
	}

}
