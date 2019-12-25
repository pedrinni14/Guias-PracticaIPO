package presentacion;

import java.util.ArrayList;

public class Ruta {
	public ArrayList<Monumento> M;
	public ArrayList<Restaurante> R;
	public ArrayList<Tienda> T;
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
	public Ruta(ArrayList<Monumento> m, ArrayList<Restaurante> r, ArrayList<Tienda> t) {
		super();
		M = m;
		R = r;
		T = t;
	}
	
	public ArrayList<Ruta> generarRutas() {
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
	
		return rutas ;
	}

}
