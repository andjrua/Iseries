package co.com.bancolombia.screenplay.ejemplo.userinterfaces;

import com.bancolombia.myextra.objects.TargetMyExtra;

public class SometerTrabajo {
	
	public static final TargetMyExtra MANDATO_SBM = TargetMyExtra.the("Mandato a ejecutar").locatedBy(5, 37, 10);
	public static final TargetMyExtra NOMBREJOB_SBM = TargetMyExtra.the("Nombre, *JOBD").locatedBy(12, 37, 10);
	public static final TargetMyExtra DESCRIPCIONJOB_SBM = TargetMyExtra.the("Nombre, *USRPRF").locatedBy(13, 37, 10);
	public static final TargetMyExtra BIBLIOTECA_SBM = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(14, 39, 10);	
	public static final TargetMyExtra COLAJOB_SBM = TargetMyExtra.the("Nombre, *JOBD").locatedBy(15, 37, 10);
	public static final TargetMyExtra BIBLIOTECAJOB_SBM = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(16, 39, 10);
	public static final TargetMyExtra PRIORIDADJOB_SBM = TargetMyExtra.the("1-9, *JOBD").locatedBy(17, 37, 10);	
	public static final TargetMyExtra PRIORIDADOUT_SBM = TargetMyExtra.the("1-9, *JOBD").locatedBy(18, 37, 10);
	public static final TargetMyExtra IMPRESION_SBM = TargetMyExtra.the("Nombre, *CURRENT, *USRPRF").locatedBy(19, 37, 10);
	public static final TargetMyExtra COLAOUT_SBM = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(5, 37, 10);	
	public static final TargetMyExtra BIBLIOTECAOUT_SBM = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(6, 39, 10);
	public static final TargetMyExtra USUARIO_SBM = TargetMyExtra.the("Biblioteca Nombre *LIBL, *CURLIB").locatedBy(10, 37, 10);
	public static final TargetMyExtra CODIGO_SBM = TargetMyExtra.the("1-9, *JOBD").locatedBy(11, 37, 17);	
	public static final TargetMyExtra TEXTOIMP_SBM = TargetMyExtra.the("1-9, *JOBD").locatedBy(12, 37, 32);
	public static final TargetMyExtra DATOSDIR_SBM = TargetMyExtra.the("Nombre, *CURRENT, *USRPRF").locatedBy(13, 37, 50);
	public static final TargetMyExtra AREA_DAT = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(6, 37, 10);
	public static final TargetMyExtra LIB_DAT = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(7, 39, 10);
	public static final TargetMyExtra INI_SUB = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(9, 37, 10);
	public static final TargetMyExtra LONG_SUB = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(10, 37, 10);
	public static final TargetMyExtra VAL_SUB = TargetMyExtra.the("*USER, *WRKSTN, *JOB").locatedBy(11, 37, 30);
	//falta completar
	
}
