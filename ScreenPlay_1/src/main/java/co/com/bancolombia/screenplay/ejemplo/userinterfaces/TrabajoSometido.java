package co.com.bancolombia.screenplay.ejemplo.userinterfaces;

import com.bancolombia.myextra.objects.TargetMyExtra;

public class TrabajoSometido {

	public static final TargetMyExtra USER_JOB = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(5, 37, 10);
	public static final TargetMyExtra SALIDA_JOB = TargetMyExtra.the("*, PRINT").locatedBy(6, 37, 6);
	
}
