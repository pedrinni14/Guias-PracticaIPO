package presentacion;

import java.net.URL;

public class Usuario {
	
	private String usuario;
	private String Conexion;
	private URL foto; //ruta con la foto, imporar antes
	public Usuario(String usuario,  URL foto) {
		this.usuario = usuario;
		this.foto = foto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}

}
