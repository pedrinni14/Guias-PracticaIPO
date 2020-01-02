package presentacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Guias {
	private String Nombre;
	// private String int long telefono 
	private String Apellidos;
	private String DNI;
	private String Edad ;
	private String Sexo;
	// private Icon Imagen ;
	
	public Guias(String nombre, String apellidos, String dNI, String edad, String sexo) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
		Edad = edad;
		Sexo = sexo;
	}


	
	
	public String getApellidos() {
		return Apellidos;
	}




	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}




	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	
	public static ArrayList<Guias> generarGuia() {
		
		ArrayList<Guias> Guias= new ArrayList<Guias>();
		// Borrar todo lo de leer 
		// Añadir a mano los Guias que serian 
		// Guias.add(new Guias(Pedro,Millan,89989898,8979798D,23,varon,imagen);
		URL fichero = Guias.class.getResource("/presentacion/Guias.txt");
		  try {
		      InputStreamReader fr =  new InputStreamReader(fichero.openStream());
		      BufferedReader br = new BufferedReader(fr);
		      int m =0 ; 
		      String[][]guias = new String[m][5];
		      String linea;
		      while((linea = br.readLine()) != null) {
		    	  m++;
		    	 String[] tokens= linea.split(",");
		    	 Guias.add(new Guias(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]));
		       }
		 
		      fr.close();
		    }
		    
		    catch(Exception e) {
		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
		     }
		    
		  
			return Guias;
		}


	@Override
	public String toString() {
		return "Este guia se llama " + Nombre + ", con el DNI " + DNI + ", tiene " + Edad + " años y es " + Sexo + " ";
	}

}
