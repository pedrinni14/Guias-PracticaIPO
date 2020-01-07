package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.TextField;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;

import dominio.Ofertas;

import javax.swing.event.ListSelectionEvent;
import java.awt.ComponentOrientation;

public class PanelOfertas extends JPanel {
	private static ArrayList<Ofertas> listaOfertas = Ofertas.generarOfertas();
	private JPanel pnlOfertas;
	private JPanel pnlPromociones;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JButton btnBorrar_1;
	private JButton btnBorrar;
	private JButton btnGuardar;
	private JButton btnAñadir;
	private JButton btnEnviar;
  private static ArrayList<Ofertas> Promociones= Ofertas.generarPromociones();
  private JTextField textNombre;
  private JTextArea textDes;
  private JButton Imagen;

	/**
	 * Create the panel.
	 */
	public PanelOfertas() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		pnlOfertas = new JPanel();
		add(pnlOfertas);
		GridBagLayout gbl_pnlOfertas = new GridBagLayout();
		gbl_pnlOfertas.columnWidths = new int[]{0, 79, 79, 79, 0, 0};
		gbl_pnlOfertas.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlOfertas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlOfertas.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlOfertas.setLayout(gbl_pnlOfertas);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlOfertas.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.addListSelectionListener(new ListListSelectionListener());
		list.setBorder(new TitledBorder(null, "Ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(list);
		
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                listaOfertas.remove(list.getSelectedIndex());

	                DefaultListModel modelo2 = new DefaultListModel();
	                for (int i = 0; i <= listaOfertas.size() - 1; i++) {

	                    modelo2.addElement(listaOfertas.get(i).getNombre());

	                }
	                list.setModel(modelo2);
	            } catch (ArrayIndexOutOfBoundsException p) {

	            }
			}
			
		});
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 2;
		gbc_btnBorrar.gridy = 2;
		pnlOfertas.add(btnBorrar, gbc_btnBorrar);
		
		pnlPromociones = new JPanel();
		add(pnlPromociones);
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[]{0, 79, 79, 79, 53, 0};
		gbl_pnlPromociones.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlPromociones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPromociones.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPromociones.setLayout(gbl_pnlPromociones);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		pnlPromociones.add(scrollPane_1, gbc_scrollPane_1);
		
		list_1 = new JList();
		list_1.addListSelectionListener(new List_1ListSelectionListener());
		
		list_1.setBorder(new TitledBorder(null, "Promociones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setViewportView(list_1);
		crearListaOfertas();
		
		btnBorrar_1 = new JButton("Borrar");
		btnBorrar_1.addActionListener(new BtnBorrar_1ActionListener());
		GridBagConstraints gbc_btnBorrar_1 = new GridBagConstraints();
		gbc_btnBorrar_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar_1.gridx = 2;
		gbc_btnBorrar_1.gridy = 2;
		pnlPromociones.add(btnBorrar_1, gbc_btnBorrar_1);
		
		panel_2 = new JPanel();
		add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{68, 96, 90, 82, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		btnGuardar = new JButton("Modificar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Ofertas o = listaOfertas.get(list.getSelectedIndex());
				o.setNombre(textNombre.getText());
				o.setDescripcion(textDes.getText());
				crearListaOfertas();
			}catch(ArrayIndexOutOfBoundsException p) {
				
			}
			try {
				Ofertas o = Promociones.get(list_1.getSelectedIndex());
				o.setNombre(textNombre.getText());
				o.setDescripcion(textDes.getText());
				crearPromociones();
			}catch(ArrayIndexOutOfBoundsException y) {
				
			}
			}
		});
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 1;
		gbc_textNombre.gridy = 1;
		panel_2.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		Imagen = new JButton("");
		Imagen.setIcon(new ImageIcon(PanelOfertas.class.getResource("/presentacion/user-2.png")));
		GridBagConstraints gbc_Imagen = new GridBagConstraints();
		gbc_Imagen.insets = new Insets(0, 0, 5, 0);
		gbc_Imagen.gridx = 3;
		gbc_Imagen.gridy = 1;
		panel_2.add(Imagen, gbc_Imagen);
		
		textDes = new JTextArea();
		textDes.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textDes.setMaximumSize(new Dimension(100, 100));
		GridBagConstraints gbc_textDes = new GridBagConstraints();
		gbc_textDes.gridwidth = 3;
		gbc_textDes.insets = new Insets(0, 0, 5, 0);
		gbc_textDes.fill = GridBagConstraints.BOTH;
		gbc_textDes.gridx = 1;
		gbc_textDes.gridy = 2;
		panel_2.add(textDes, gbc_textDes);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 3;
		panel_2.add(btnGuardar, gbc_btnGuardar);
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ofertas o = new Ofertas(textNombre.getText(),textDes.getText(),PanelOfertas.class.getResource("/presentacion/user-2.png"));
				if(textNombre.getText().equals("")|| textDes.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "CAMPOS VACIOS");
				}else {
					ImageIcon icon = new ImageIcon(PanelOfertas.class.getResource("/presentacion/user-2.png"));
					String[] options = {"Promoción", "Oferta"};
					int seleccion = JOptionPane.showOptionDialog(null, "Selecciona oferta o promoción", "Elige una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
				
					
					if(seleccion==0) {
						
					Promociones.add(new Ofertas(textNombre.getText(),textDes.getText(),PanelOfertas.class.getResource("/presentacion/user-2.png")));
					DefaultListModel modelo = new DefaultListModel();
					for (int i = 0; i <= Promociones.size() - 1; i++) {
						modelo.addElement(Promociones.get(i).getNombre());
					}
					list_1.setModel(modelo);
					}else if (seleccion==1){
						
						listaOfertas.add(new Ofertas(textNombre.getText(),textDes.getText(),PanelOfertas.class.getResource("/presentacion/user-2.png")));
						DefaultListModel modelo = new DefaultListModel();
						for (int i = 0; i <= listaOfertas.size() - 1; i++) {
							modelo.addElement(listaOfertas.get(i).getNombre());
						}
						list.setModel(modelo);
					}
				}
					
				}
				
			
		});
		GridBagConstraints gbc_btnAñadir = new GridBagConstraints();
		gbc_btnAñadir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAñadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadir.gridx = 2;
		gbc_btnAñadir.gridy = 3;
		panel_2.add(btnAñadir, gbc_btnAñadir);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new BtnEnviarActionListener());
		btnEnviar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 0);
		gbc_btnEnviar.gridx = 3;
		gbc_btnEnviar.gridy = 3;
		panel_2.add(btnEnviar, gbc_btnEnviar);
		crearPromociones();

	}

	public void crearListaOfertas() {
  DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= listaOfertas.size() - 1; i++) {
			modelo.addElement(listaOfertas.get(i).getNombre());
		}
		list.setModel(modelo);
	}


	

	
	private class BtnBorrar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Promociones.remove(list_1.getSelectedIndex());
				
				DefaultListModel modelo2 = new DefaultListModel();
				for (int i = 0; i <= Promociones.size() - 1; i++) {

					modelo2.addElement(Promociones.get(i).getNombre());


				}
				list_1.setModel(modelo2);
			} catch (ArrayIndexOutOfBoundsException p) {

			}
		}
	}
	private class List_1ListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			try {
			list.clearSelection();
			textNombre.setText(Promociones.get(list_1.getSelectedIndex()).getNombre());
			textDes.setText(Promociones.get(list_1.getSelectedIndex()).getDescripcion());
			Imagen.setIcon(new ImageIcon(Promociones.get(list_1.getSelectedIndex()).getImagen()));
		}catch(ArrayIndexOutOfBoundsException p) {
			
		}
		}	
	}
	private class ListListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			try {
			list_1.clearSelection();
			textNombre.setText(listaOfertas.get(list.getSelectedIndex()).getNombre());
			textDes.setText(listaOfertas.get(list.getSelectedIndex()).getDescripcion());
			Imagen.setIcon(new ImageIcon(listaOfertas.get(list.getSelectedIndex()).getImagen()));
			}catch(ArrayIndexOutOfBoundsException p) {
				
			}
		}
	}
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(textNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "No se ha seleccionado oferta", "ERROR", JOptionPane.WARNING_MESSAGE);
			}else {
			try {
				
			String correo = JOptionPane.showInputDialog(null, "Escribe la dirección de correo " );
			if (correo.contains("@")) {
				JOptionPane.showMessageDialog(null, "Correo enviado a : "+correo);
			}else {
				JOptionPane.showMessageDialog(null, "Correo Invalido", "ERROR", JOptionPane.WARNING_MESSAGE);
			}
		}catch(Exception p ) {
			
		}
			}
			
	}
	}
	public void crearPromociones() {
		DefaultListModel modelo = new DefaultListModel();
		for (int i = 0; i <= Promociones.size() - 1; i++) {
			modelo.addElement(Promociones.get(i).getNombre());
		}
		list_1.setModel(modelo);
	}
}
