package presentacion;

public class DatosUsuario {

	// Clase para manejar datos de el Login, por ahora es un basico ejemplo 
	
	public int  Existe(String nombre, String Contraseña) {
		
		if(nombre.equals("jesus") || nombre.equals("pedro")) {
			if (Contraseña.equals("1234a")) {
				return 1;
			}else 
				return -1;
		}else return 0 ;
	
	}

}
