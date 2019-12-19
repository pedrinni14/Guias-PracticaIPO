package presentacion;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.print.DocFlavor.URL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class DatosUsuario {

	
	public String usuario ="Pedro";
	
	public int  Existe(String nombre, String Contraseña) {
		
		if(nombre.equals("jesus") || nombre.equals("pedro")) {
			if (Contraseña.equals("1234a")) {
				return 1;
			}else 
				return -1;
		}else return 0 ;
	
	}
	public void UsuarioConectado(String nombre) {
		{
			
			FileWriter fichero =null;
			PrintWriter pw=null;
	        try
	        {
	        	//URL URL=DatosUsuario.class.getResource("/presentacion/Usuario.txt");
	            fichero = new FileWriter("src/presentacion/Usuario.txt");
	            pw = new PrintWriter(fichero);

	            if(nombre.equals("jesus") ) {
	            	 pw.println("Jesús Gamero Tello");
	            }
	            if ( nombre.equals("pedro")) {
	            	 pw.println("Pedro Millán Álvarez");
	            }
	               

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
	    }
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario2(String usuario) {
		this.usuario = usuario;
	}

	
	

}
