package presentacion;

public class DatosUsuario {

	// Clase para manejar datos de el Login, por ahora es un basico ejemplo 
	public String usuario ="perico";
	
	public int  Existe(String nombre, String Contraseña) {
		
		if(nombre.equals("jesus") || nombre.equals("pedro")) {
			if (Contraseña.equals("1234a")) {
				return 1;
			}else 
				return -1;
		}else return 0 ;
	
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario2(String usuario) {
		this.usuario = usuario;
	}

	
	

}
