package co.com.bancolombia.screenplay.ejemplo.util;

public enum Edp {
	CALIDAD("C:\\Users\\JORGE.JIMENEZ\\Documents\\sessions\\CALIDAD.EDP");
	//CALIDAD("C:\\Users\\JORGE.JIMENEZ\\Documents\\Attachmate\\EXTRA!\\sessions\\as400-demostracion.EDP");

	private String ruta;
	
	Edp(String ruta){
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}
		
}
