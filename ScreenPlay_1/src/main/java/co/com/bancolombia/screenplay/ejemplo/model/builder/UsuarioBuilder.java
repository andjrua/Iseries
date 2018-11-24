package co.com.bancolombia.screenplay.ejemplo.model.builder;

import co.com.bancolombia.screenplay.ejemplo.model.Usuario;

public class UsuarioBuilder implements Builder<Usuario> {
	
	private String usuario;
	private String contrasena;
	
	public UsuarioBuilder(String usuario) {
		this.usuario = usuario;
	}

	public static UsuarioBuilder usuario(String usuario) {
		return new UsuarioBuilder(usuario);
	}
	
	public Usuario conContrasena(String contrasena) {
		this.contrasena = contrasena;
		return build();
	}

	@Override
	public Usuario build() {
		return new Usuario(usuario, contrasena);
	}	

}
