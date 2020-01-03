package presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.print.DocFlavor.URL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

	public Usuario UsuarioConectado(String nombre) {
		
		if (nombre.equals("jesus")) {

			return new Usuario("Jesus Gamero Tello",VentanaPagina.class.getResource("/presentacion/jesus.jpg"));

		} else {
			return new Usuario("Pedro Millan Alvarez",VentanaPagina.class.getResource("/presentacion/pedro.jpg"));
		}

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario2(String usuario) {
		this.usuario = usuario;
	}

	
	

}
