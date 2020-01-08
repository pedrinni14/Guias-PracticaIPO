package dominio;

import java.util.ArrayList;

public class Ruta {
	public ArrayList<Monumento> M;
	public ArrayList<Restaurante> R;
	public ArrayList<Tienda> T;
	public String nombre;
	public ArrayList<Monumento> getM() {
		return M;
	}
	public void setM(ArrayList<Monumento> m) {
		M = m;
	}
	public ArrayList<Restaurante> getR() {
		return R;
	}
	public void setR(ArrayList<Restaurante> r) {
		R = r;
	}
	public ArrayList<Tienda> getT() {
		return T;
	}
	public void setT(ArrayList<Tienda> t) {
		T = t;
	}
	
	public Ruta(String nombre,ArrayList<Monumento> m, ArrayList<Restaurante> r, ArrayList<Tienda> t) {
		super();
		this.nombre=nombre;
		M = m;
		R = r;
		T = t;
	}
	public String getNombre() {return nombre;}
	
	
	public static ArrayList<Ruta> generarRutas() {
		ArrayList<Ruta> rutas= new ArrayList<Ruta>();
			
		ArrayList<Monumento> monumentos1= new ArrayList<Monumento>();
		ArrayList<Monumento> monumentos2= new ArrayList<Monumento>();
		ArrayList<Monumento> monumentos3= new ArrayList<Monumento>();
		
		ArrayList<Restaurante> restaurantes1= new ArrayList<Restaurante>();
		ArrayList<Restaurante> restaurantes2= new ArrayList<Restaurante>();
		ArrayList<Restaurante> restaurantes3= new ArrayList<Restaurante>();
		
		ArrayList<Tienda> tiendas1= new ArrayList<Tienda>();
		ArrayList<Tienda> tiendas2= new ArrayList<Tienda>();
		ArrayList<Tienda> tiendas3= new ArrayList<Tienda>();
		
		monumentos1.add(new Monumento("Alarcos",true,"10:00","20:00","30 minutos"));
		monumentos1.add(new Monumento("Catedral",true,"12:00","18:00","20 minutos"));
		monumentos2.add(new Monumento("Alcazar",false,"9:00","20:00","35 minutos"));
		monumentos3.add(new Monumento("Corral de comedias",false,"12:00","17:00","1 hora"));
		monumentos3.add(new Monumento("Convento de las Dominicas de Santagracia",true,"9:00","20:00","30 minutos"));
		monumentos3.add(new Monumento("Convento de las carmelitas",true,"9:00","20:00","30 minutos"));
		
		
		restaurantes1.add(new Restaurante("Pomodoro","Italiano"));
		restaurantes2.add(new Restaurante("La Mia Mamma","Italiano"));	
		restaurantes2.add(new Restaurante("Carmen Carmen","RestroBar"));
		restaurantes3.add(new Restaurante("El Ventero","Bar de tapas"));
		restaurantes3.add(new Restaurante("Pura Cepa","Parrilla"));
		restaurantes3.add(new Restaurante("El Portalon","Bar de tapas"));
		
		tiendas1.add(new Tienda("Sfera","Ropa"));
		tiendas1.add(new Tienda("Pull&Bear","Ropa"));
		tiendas1.add(new Tienda("La Deliciosa","Pasteleria"));
		tiendas2.add(new Tienda("Helados Moran","Heladeria"));
		tiendas3.add(new Tienda("Bershka","Ropa"));
		tiendas3.add(new Tienda("La Manchega","Pasteleria"));
		
		rutas.add(new Ruta("Ruta por Toledo",monumentos1,restaurantes1,tiendas1));
		rutas.add(new Ruta("Ruta por Cuenca",monumentos2,restaurantes2,tiendas2));
		rutas.add(new Ruta("Ruta por Ciudad Real",monumentos3,restaurantes3,tiendas3));
	
		return rutas ;
	}

}
