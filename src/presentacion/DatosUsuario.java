package presentacion;


import javax.print.DocFlavor.URL;
import java.util.ArrayList;


public class DatosUsuario {

	private String usuario;
	private String pass;
	private String Conexion;
	private URL foto; //ruta con la foto, imporar antes
	public DatosUsuario(String usuario, String pass, String conexion) {
		this.usuario = usuario;
		this.pass = pass;
		Conexion = conexion;
		
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getConexion() {
		return Conexion;
	}
	public void setConexion(String conexion) {
		Conexion = conexion;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	public static ArrayList<DatosUsuario> generarEmpleado() {
		ArrayList<DatosUsuario> usuarios=new ArrayList<DatosUsuario>();
		usuarios.add(new DatosUsuario("Jesus Gamero Tello","1234a","04/12/18 20:02"));
		usuarios.add(new DatosUsuario("Pedro Millan Alvarez","1234a","07/01/19 19:45"));
		
		return usuarios;
	}

	
	

}
