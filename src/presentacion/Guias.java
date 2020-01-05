package presentacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;

public class Guias {
	private String Nombre;
	// private String int long telefono 
	private String Apellidos;
	private String DNI;
	private String Edad ;
	private String Sexo;
	private URL Imagen ;
	






	
	
	public Guias(String nombre, String apellidos, String dNI, String edad, String sexo, URL imagen) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
		Edad = edad;
		Sexo = sexo;
		Imagen = imagen;
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
		 
		 
		Guias.add(new Guias("Pedro","Millán","05658987G","21","Varon",Guias.getClass().getResource("/presentacion/Guia1.jpg")));
		
		return Guias;
		
		}


	public URL getImagen() {
		return Imagen;
	}




	public void setImagen(URL imagen) {
		Imagen = imagen;
	}




	@Override
	public String toString() {
		return "Este guia se llama " + Nombre + ", con el DNI " + DNI + ", tiene " + Edad + " años y es " + Sexo + " ";
	}

}
