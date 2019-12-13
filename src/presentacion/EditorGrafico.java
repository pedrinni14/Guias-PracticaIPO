package presentacion;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class EditorGrafico extends JPanel {
	private JFrame frame;
	private JToolBar tbBarraDibujo;
	private JButton btnCargarMapa;
	private JButton btnDestino;
	private JButton btnOrigen;
	private JButton btnRectangulo;
	private JButton btnAnotacion;
	private JScrollPane scrollPane;
	//Area de dibujo personalizada (creada extendiendo de JLabel)
	private MiAreaDibujo miAreaDibujo;
	//Imagen en la que se cargará el fichero seleccionado por el usuario
	private ImageIcon imagen;
	//Variable que almacena el modo de dibujado seleccionado por el usuario
	int modo = -1;
	private final int DESTINO = 1;
	private final int ORIGEN = 2;
	private final int RECTANGULO = 3;
	private final int TEXTO = 4;
	
	//Cursores e imagenes
	
	private Image imagDestino;
	private Image imagOrigen;
	private Image imagRectangulo;
	private Image imagTexto;
	private Image imagCursorDestino;
	private Image imagCursorOrigen;
	private Cursor cursorDestino;
	private Cursor cursorOrigen;
	private Cursor cursorRectangulo;
	private Cursor cursorTexto;
	//Variables para almacenar las coordenadas actuales
	private int x, y;
	
	//Componente de entrada de texto que permitirá añadir anotaciones (dibujar texto) sobre la imagen
	private JTextField txtTexto = new JTextField();
	/**
	 * Create the panel.
	 */
	public EditorGrafico() {
		setMinimumSize(new Dimension(1366, 768));
		setLayout(new BorderLayout(0, 0));
		{
			tbBarraDibujo = new JToolBar();
			add(tbBarraDibujo, BorderLayout.NORTH);
			{
				btnCargarMapa = new JButton("");
				btnCargarMapa.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/cargarMapa.png")));
				btnCargarMapa.addActionListener(new BtnCargarMapaActionListener());

				tbBarraDibujo.add(btnCargarMapa);
			}
			{
				btnDestino = new JButton("");
				btnDestino.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/location-pin.png")));
				btnDestino.addActionListener(new BtnDestinoActionListener());
				tbBarraDibujo.add(btnDestino);
			}
			{
				btnOrigen = new JButton("");
				btnOrigen.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/capitol-building.png")));
				btnOrigen.addActionListener(new BtnOrigenActionListener());
				tbBarraDibujo.add(btnOrigen);
			}
			{
				btnRectangulo = new JButton("");
				btnRectangulo.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/restaurant.png")));
				btnRectangulo.addActionListener(new BtnRectanguloActionListener());
				tbBarraDibujo.add(btnRectangulo);
			}
			{
				btnAnotacion = new JButton("");
				btnAnotacion.setIcon(new ImageIcon(EditorGrafico.class.getResource("/presentacion/speech-bubble.png")));
				btnAnotacion.addActionListener(new BtnAnotacionActionListener());
				tbBarraDibujo.add(btnAnotacion);
			}
		}
		{
			scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
		}
		//Creación del área de dibujo personalizada
		miAreaDibujo = new MiAreaDibujo();
		miAreaDibujo.addMouseMotionListener(new MiAreaDibujoMouseMotionListener());
		miAreaDibujo.addMouseListener(new MiAreaDibujoMouseListener());
		miAreaDibujo.setIcon(null);
		scrollPane.setViewportView(miAreaDibujo);
		
		//Creación de imágenes y cursores
		imagDestino = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/location-pin.png"));
		imagOrigen = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/capitol-building.png"));
		imagRectangulo = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/restaurant.png"));
		imagTexto = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/speech-bubble.png"));
		imagCursorDestino = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/location-pin.png"));
		imagCursorOrigen = Toolkit.getDefaultToolkit().getImage(EditorGrafico.class.getResource("/presentacion/capitol-building.png"));
		// Creación de los cursores
		cursorRectangulo = Toolkit.getDefaultToolkit().createCustomCursor(imagRectangulo, new Point(0, 0), "CURSOR_RECTANGULO");
		cursorTexto = Toolkit.getDefaultToolkit().createCustomCursor(imagTexto, new Point(0, 0), "CURSOR_TEXTO");
		cursorDestino = Toolkit.getDefaultToolkit().createCustomCursor(imagCursorDestino, new Point(0, 0), "CURSOR_DESTINO");
		cursorOrigen = Toolkit.getDefaultToolkit().createCustomCursor(imagCursorOrigen, new Point(0, 0), "CURSOR_ORIGEN");
	}

	private class BtnCargarMapaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			imagen = new ImageIcon(file.getAbsolutePath());
			miAreaDibujo.setIcon(imagen);
			}

		}
	}
	private class BtnDestinoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = DESTINO;
			miAreaDibujo.setCursor(cursorDestino);
		}
	}
	private class BtnOrigenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = ORIGEN;
			miAreaDibujo.setCursor(cursorOrigen);
		}
	}
	private class BtnRectanguloActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = RECTANGULO;
			miAreaDibujo.setCursor(cursorRectangulo);
		}
	}
	private class BtnAnotacionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			modo = TEXTO;
			miAreaDibujo.setCursor(cursorTexto);
		}
	}
	
	private class MiAreaDibujoMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent arg0) {
			x = arg0.getX();
			y = arg0.getY();
			if (imagen != null)
			{
			switch (modo)
			{
			case DESTINO:
			miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagDestino));
			miAreaDibujo.repaint();
			break;
			case ORIGEN:
			miAreaDibujo.addObjetoGrafico(new ImagenGrafico(x,y,imagOrigen));
			miAreaDibujo.repaint();
			break;
			case RECTANGULO:
				miAreaDibujo.addObjetoGrafico(new RectanguloGrafico(x,y,x,y,Color.RED));
			break;

			case TEXTO:
					txtTexto.setBounds(x, y, 200, 30);
					txtTexto.setVisible(true);
					txtTexto.requestFocus();
					txtTexto.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg) {
							if (!txtTexto.getText().equals(""))
								miAreaDibujo
										.addObjetoGrafico(new TextoGrafico(x, y + 15, txtTexto.getText(), Color.BLUE));
							txtTexto.setText("");
							txtTexto.setVisible(false);
							miAreaDibujo.repaint();
						}
					});
					miAreaDibujo.add(txtTexto);
			}
			}

		}
	}
	private class MiAreaDibujoMouseMotionListener extends MouseMotionAdapter {
		@Override
		public void mouseDragged(MouseEvent arg0) {
			if (modo == RECTANGULO && imagen!=null) {
				((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setX1(arg0.getX());
				((RectanguloGrafico)miAreaDibujo.getUltimoObjetoGrafico()).setY1(arg0.getY());
				miAreaDibujo.repaint();
				}

		}
	}
	
	}