package dominio;

import java.awt.Image;

public class ImagenGrafico extends ObjetoGrafico {
	public ImagenGrafico(int x, int y, Image imagen) {
		super(x, y);
		this.imagen = imagen;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	private Image imagen;

}
