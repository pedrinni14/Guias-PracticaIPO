package dominio;

public class Monumento {
	String Nombre;
	boolean Gratuito;
	String Apertura ;
	String Cierre; 
	String Duracion ;
	public Monumento(String nombre, boolean gratuito, String apertura, String cierre, String duracion) {
		super();
		Nombre = nombre;
		Gratuito = gratuito;
		Apertura = apertura;
		Cierre = cierre;
		Duracion = duracion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public boolean isGratuito() {
		return Gratuito;
	}
	public void setGratuito(boolean gratuito) {
		Gratuito = gratuito;
	}
	public String getApertura() {
		return Apertura;
	}
	public void setApertura(String apertura) {
		Apertura = apertura;
	}
	public String getCierre() {
		return Cierre;
	}
	public void setCierre(String cierre) {
		Cierre = cierre;
	}
	public String getDuracion() {
		return Duracion;
	}
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	
}
