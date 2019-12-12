package presentacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;





public class Guia {
	private String Nombre;
	private String DNI;
	private String Edad ;
	private String Sexo;
	public Guia(String nombre, String dNI, String edad, String sexo) {
		super();
		Nombre = nombre;
		DNI = dNI;
		Edad = edad;
		Sexo = sexo;
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
	
	public static ArrayList<Guia> generarGuia() {
		ArrayList<Guia> Guias= new ArrayList<Guia>();
		  String fichero = "src/presentacion/Guias.txt";
		  try {
		      FileReader fr = new FileReader(fichero);
		      BufferedReader br = new BufferedReader(fr);
		      int m =0 ; 
		      String[][]guias = new String[m][4];
		      String linea;
		      while((linea = br.readLine()) != null) {
		    	  m++;
		    	 String[] tokens= linea.split(",");
		    	 Guias.add(new Guia(tokens[0],tokens[1],tokens[2],tokens[3]));
		       }
		 
		      fr.close();
		    }
		    
		    catch(Exception e) {
		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
		     }
		    
		  
			return Guias;
		}
	}

