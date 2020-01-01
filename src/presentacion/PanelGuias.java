package presentacion;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;

import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.event.ListSelectionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PanelGuias extends JPanel {
	private static ArrayList<Guias> listaGuias = Guias.generarGuia();;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textEdad;
	private JTextField textSexo;
	private JLabel lblNombre;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JList listGuias;
	DefaultListModel modelo = new DefaultListModel();
	public int pos;
	private JLabel lblListaGuias;
	private JLabel lblFotoGuia;
	private JLabel lblApellidos;
	private JTextField textApellidos;
	private JLabel lblDatosDeLos;

	/**
	 * Create the panel.
	 */
	public PanelGuias() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 49, 90, 78, 59, 0, 72, 57, 83, 46, 102, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 68, 47, 71, 64, 63, 73, 0, 51, 25, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		listGuias = new JList();
		listGuias.addListSelectionListener(new ListGuiasListSelectionListener());

		lblListaGuias = new JLabel("Lista de Guias");
		lblListaGuias.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblListaGuias = new GridBagConstraints();
		gbc_lblListaGuias.gridwidth = 2;
		gbc_lblListaGuias.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaGuias.gridx = 1;
		gbc_lblListaGuias.gridy = 0;
		add(lblListaGuias, gbc_lblListaGuias);
		GridBagConstraints gbc_listGuias = new GridBagConstraints();
		gbc_listGuias.gridwidth = 3;
		gbc_listGuias.fill = GridBagConstraints.BOTH;
		gbc_listGuias.insets = new Insets(0, 0, 5, 5);
		gbc_listGuias.gridheight = 6;
		gbc_listGuias.gridx = 1;
		gbc_listGuias.gridy = 1;
		add(listGuias, gbc_listGuias);
		crearLista();

		btnNewButton_1 = new JButton("Agregar ");
		btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());

		lblDatosDeLos = new JLabel("Datos de los Guias");
		lblDatosDeLos.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblDatosDeLos = new GridBagConstraints();
		gbc_lblDatosDeLos.gridwidth = 2;
		gbc_lblDatosDeLos.insets = new Insets(0, 0, 5, 5);
		gbc_lblDatosDeLos.gridx = 6;
		gbc_lblDatosDeLos.gridy = 1;
		add(lblDatosDeLos, gbc_lblDatosDeLos);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 5;
		gbc_lblNombre.gridy = 2;
		add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
//		textNombre.addActionListener(new textNombreActionListener());
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridwidth = 3;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 6;
		gbc_textNombre.gridy = 2;
		add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		lblFotoGuia = new JLabel("");
		lblFotoGuia.setIcon(new ImageIcon(PanelGuias.class.getResource("/presentacion/user-2.png")));
		GridBagConstraints gbc_lblFotoGuia = new GridBagConstraints();
		gbc_lblFotoGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoGuia.gridx = 10;
		gbc_lblFotoGuia.gridy = 2;
		add(lblFotoGuia, gbc_lblFotoGuia);

		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 5;
		gbc_lblApellidos.gridy = 3;
		add(lblApellidos, gbc_lblApellidos);

		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 3;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 6;
		gbc_textApellidos.gridy = 3;
		add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);

		lblNewLabel = new JLabel("DNI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);

		textDNI = new JTextField();
		textDNI.setColumns(10);
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.gridwidth = 3;
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.gridx = 6;
		gbc_textDNI.gridy = 4;
		add(textDNI, gbc_textDNI);

		lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		textEdad = new JTextField();
		textEdad.setColumns(10);
		GridBagConstraints gbc_textEdad = new GridBagConstraints();
		gbc_textEdad.gridwidth = 3;
		gbc_textEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEdad.insets = new Insets(0, 0, 5, 5);
		gbc_textEdad.gridx = 6;
		gbc_textEdad.gridy = 5;
		add(textEdad, gbc_textEdad);

		lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 6;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		textSexo = new JTextField();
		textSexo.setColumns(10);
		GridBagConstraints gbc_textSexo = new GridBagConstraints();
		gbc_textSexo.gridwidth = 3;
		gbc_textSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSexo.insets = new Insets(0, 0, 5, 5);
		gbc_textSexo.gridx = 6;
		gbc_textSexo.gridy = 6;
		add(textSexo, gbc_textSexo);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 7;
		add(btnNewButton_1, gbc_btnNewButton_1);

		btnNewButton = new JButton("Eliminar ");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 7;
		add(btnNewButton, gbc_btnNewButton);

		btnNewButton_2 = new JButton("Modificar ");
		btnNewButton_2.addActionListener(new BtnNewButton_2ActionListener());
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 7;
		add(btnNewButton_2, gbc_btnNewButton_2);

		lblNewLabel_1 = new JLabel("DESCRIPCION ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;

	}

	public void crearLista() {

		for (int i = 0; i <= listaGuias.size() - 1; i++) {
			modelo.addElement(listaGuias.get(i).getNombre());
		}
		listGuias.setModel(modelo);
	}

	public void añadir(Guias g) {

		DefaultListModel modelo = new DefaultListModel();
		listaGuias.add(g);
		for (int i = 0; i <= listaGuias.size() - 1; i++) {
			modelo.addElement(listaGuias.get(i).getNombre());
		}
		listGuias.setModel(modelo);
	}

	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Guias g = new Guias(textNombre.getText(), textApellidos.getText(), textDNI.getText(),
						textEdad.getText(), textSexo.getText());

				if (textNombre.getText().equals("") || textDNI.getText().equals("") || textEdad.getText().equals("")
						|| textSexo.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "CAMPOS VACIOS");

				} else if (soloLetras(textNombre.getText())) {
					JOptionPane.showMessageDialog(null, "El nombre contiene caracteres invalidos");
					limpiarCampos();
				} else if (soloLetras(textApellidos.getText())) {
					JOptionPane.showMessageDialog(null, "El apellido contiene caracteres invalidos");
					limpiarCampos();
				} else if (comprobarDNI()) {
					JOptionPane.showMessageDialog(null, "El DNI introducido no es correcto");
					limpiarCampos();
				} else if (soloLetras(textEdad.getText())==false || textEdad.getText().length()>2) {
					JOptionPane.showMessageDialog(null, "La edad introducida no es correcta");
					limpiarCampos();
				}else if(comprobarSexo(textSexo.getText())) {
					JOptionPane.showMessageDialog(null, "El sexo introducido es incorrecto, pruebe con Varon/Mujer");
					limpiarCampos();
				}

				else {

					añadir(g);
					limpiarCampos();
				}

			} catch (ArrayIndexOutOfBoundsException ex) {

			}
		}

	}

	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				listaGuias.remove(listGuias.getSelectedIndex());
				System.out.print(listaGuias.size());
				DefaultListModel modelo2 = new DefaultListModel();
				for (int i = 0; i <= listaGuias.size() - 1; i++) {

					modelo2.addElement(listaGuias.get(i).getNombre());

				}
				listGuias.setModel(modelo2);
			} catch (ArrayIndexOutOfBoundsException p) {

			}
		}
	}

	private class BtnNewButton_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Guias g = listaGuias.get(listGuias.getSelectedIndex());
			g.setNombre(textNombre.getText());
			g.setApellidos(textApellidos.getText());
			g.setDNI(textDNI.getText());
			g.setEdad(textEdad.getText());
			g.setSexo(textSexo.getText());

		}
	}

	private class ListGuiasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			textNombre.setText(listaGuias.get(listGuias.getSelectedIndex()).getNombre());
			textApellidos.setText(listaGuias.get(listGuias.getSelectedIndex()).getApellidos());
			textDNI.setText(listaGuias.get(listGuias.getSelectedIndex()).getDNI());
			textEdad.setText(listaGuias.get(listGuias.getSelectedIndex()).getEdad());
			textSexo.setText(listaGuias.get(listGuias.getSelectedIndex()).getSexo());

		}
	}

	private class textNombreActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < textNombre.getText().length(); i++)

			{
				System.out.println(textNombre.getText());

				char caracter = textNombre.getText().toUpperCase().charAt(i);

				int valorASCII = (int) caracter;

				if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
					JOptionPane.showMessageDialog(null, "Valores Incorrectos");
				}
			}

		}

	}


	public boolean soloLetras(String letra) {
		for (int i = 0; i < letra.length(); i++)

		{

			char caracter = letra.toUpperCase().charAt(i);

			int valorASCII = (int) caracter;

			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
				return true;
			}

		}
		return false;
	}

	public boolean comprobarDNI() {

		String letraMayuscula = "";

		if (textDNI.getText().length() != 9 || Character.isLetter(textDNI.getText().charAt(8)) == false) {
			return true;
		}

		letraMayuscula = (textDNI.getText().substring(8)).toUpperCase();

		if (soloNumeros() == true && letraDNI().equals(letraMayuscula)) {
			return false;
		} else {
			return true;
		}
	}

	private boolean soloNumeros() {

		int i, j = 0;
		String numero = "";
		String miDNI = "";
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < textDNI.getText().length() - 1; i++) {
			numero = textDNI.getText().substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	private String letraDNI() {

		int miDNI = Integer.parseInt(textDNI.getText().substring(0, 8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];

		return miLetra;
	}
	public boolean comprobarSexo(String sexo) {
		if(sexo.toUpperCase().equals("VARON")||sexo.toUpperCase().equals("MUJER")) {
			return false;
		}
		else return true;
	}



	public void limpiarCampos() {
		textNombre.setText("");
		textDNI.setText("");
		textEdad.setText("");
		textSexo.setText("");
		textApellidos.setText("");
	}
}
