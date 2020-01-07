package dominio;

import java.net.URL;
import java.util.ArrayList;

public class Grupos {
	int ID;
	String nombre;
	String DNI;
	int Grupo;
	int tamaño;
	String ruta;
	String idioma;
	URL imagen;
	public Grupos(int iD, String nombre, String dNI, int grupo, int tamaño, String ruta, String idioma, URL imagen) {
		super();
		ID = iD;
		this.nombre = nombre;
		DNI = dNI;
		Grupo = grupo;
		this.tamaño = tamaño;
		this.ruta = ruta;
		this.idioma = idioma;
		this.imagen = imagen;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getGrupo() {
		return Grupo;
	}
	public void setGrupo(int grupo) {
		Grupo = grupo;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public URL getImagen() {
		return imagen;
	}
	public void setImagen(URL imagen) {
		this.imagen = imagen;
	}
public static ArrayList<Grupos> generarGrupos() {
		
		ArrayList<Grupos> gs= new ArrayList<Grupos>();
		 
		 
		gs.add(new Grupos( 1, "Pedro Gomez", "05697842K", 2, 15, "Ruta por Toledo", "Español",Grupos.class.getResource("/presentacion/GrupoToledo.jpg")));
		gs.add(new Grupos( 2, "Mathew Edwards","04558976L", 1, 8, "Ruta por Cuenca", "English",Grupos.class.getResource("/presentacion/GrupoIngles.jpg")));
		gs.add(new Grupos( 3, "Pablo Gonzalez", "04894568S", 3, 12, "Ruta por Ciudad Real", "Español",Grupos.class.getResource("/presentacion/GrupoCuenca.jpg")));
		return gs;
		
		}
}
