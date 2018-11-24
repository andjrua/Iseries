package co.com.bancolombia.screenplay.ejemplo.util;

public enum Edp {
	CALIDAD("C:\\Users\\UserQV\\Desktop\\CALIDAD.EDP");

	private String ruta;
	
	Edp(String ruta){
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}
		
}
