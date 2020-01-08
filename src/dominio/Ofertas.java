package dominio;

import java.net.URL;
import java.util.ArrayList;

public class Ofertas {
  private String nombre;
  private String descripcion;
  private URL imagen;
  

public Ofertas(String nombre, String descripcion, URL imagen) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.imagen = imagen;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

  public URL getImagen() {
	return imagen;
}
public void setImagen(URL imagen) {
	this.imagen = imagen;
}
public static ArrayList<Ofertas> generarOfertas(){
	  ArrayList<Ofertas> Ofertas= new ArrayList<Ofertas>();
	  
	    Ofertas.add(new Ofertas("2x1 Tapas", "Por cada dos tapas quee pidas la segunda te sale gratis "
	    		+ "en todos los bares de nuestra ruta",
	    		Ofertas.getClass().getResource("/presentacion/2x1.jpg")));
	    Ofertas.add(new Ofertas("Niños gratis", "Los niños menores de 14 años podrán pasar gratis a todos los momumentos de la ruta",
	    		Ofertas.getClass().getResource("/presentacion/niños_gratis.jpg")));
	  
	  
	  return Ofertas;
	  
  }
  public static ArrayList<Ofertas> generarPromociones(){
	  ArrayList<Ofertas> Promocion= new ArrayList<Ofertas>();
	  
	    Promocion.add(new Ofertas("Ruta Gratis", "Si reserva en menos de 5 dias de recibir "
	    		+ "este correo recibira una ruta a la mitad de precio",
	    		Promocion.getClass().getResource("/presentacion/rutagratis.jpg")));
	    Promocion.add(new Ofertas("Grupo de 20 personas", "Si se trae a 20 personas y a la suegra le dejamos la mitad de precio la ruta por persona",
	    		Promocion.getClass().getResource("/presentacion/grupopersonas.jpg")));
	  
	  
	  return Promocion;
	  
  }



}
