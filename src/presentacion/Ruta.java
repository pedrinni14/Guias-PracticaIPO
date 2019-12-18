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

}
