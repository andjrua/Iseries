package co.com.bancolombia.screenplay.ejemplo.userinterfaces;

import com.bancolombia.myextra.objects.TargetMyExtra;

public class LlamarPrograma {

	public static final TargetMyExtra PROGRAMA_CALL = TargetMyExtra.the("Programa Nombre").locatedBy(5, 37, 10);
	public static final TargetMyExtra BIBLIOTECA_CALL = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(6, 39, 10);
	public static final TargetMyExtra PARAMETROS_CALL = TargetMyExtra.the("Parametros").locatedBy(7, 37, 50);	
	public static final TargetMyExtra PPARAMETROS_CALL = TargetMyExtra.the("Mas Parametros").locatedBy(9, 37, 50);
	
}
