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
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.event.ListSelectionEvent;
import java.awt.Font;

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
	/**
	 * Create the panel.
	 */
	public PanelGuias() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{49, 90, 38, 221, 72, 57, 124, 97, 0};
		gridBagLayout.rowHeights = new int[]{68, 32, 31, 17, 0, 0, 45, 102, 0, 0, 51, 25, 103, 70, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.anchor = GridBagConstraints.SOUTH;
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.gridx = 3;
		gbc_textNombre.gridy = 1;
		add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		GridBagConstraints gbc_textEdad = new GridBagConstraints();
		gbc_textEdad.anchor = GridBagConstraints.SOUTH;
		gbc_textEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_textEdad.insets = new Insets(0, 0, 5, 5);
		gbc_textEdad.gridx = 6;
		gbc_textEdad.gridy = 1;
		add(textEdad, gbc_textEdad);
		
		lblNewLabel = new JLabel("DNI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		GridBagConstraints gbc_textDNI = new GridBagConstraints();
		gbc_textDNI.anchor = GridBagConstraints.SOUTH;
		gbc_textDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDNI.insets = new Insets(0, 0, 5, 5);
		gbc_textDNI.gridx = 3;
		gbc_textDNI.gridy = 3;
		add(textDNI, gbc_textDNI);
		
		lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textSexo = new JTextField();
		textSexo.setColumns(10);
		GridBagConstraints gbc_textSexo = new GridBagConstraints();
		gbc_textSexo.anchor = GridBagConstraints.NORTH;
		gbc_textSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSexo.insets = new Insets(0, 0, 5, 5);
		gbc_textSexo.gridx = 6;
		gbc_textSexo.gridy = 3;
		add(textSexo, gbc_textSexo);
		
		listGuias = new JList();
		listGuias.addListSelectionListener(new ListGuiasListSelectionListener());
		GridBagConstraints gbc_listGuias = new GridBagConstraints();
		gbc_listGuias.fill = GridBagConstraints.BOTH;
		gbc_listGuias.insets = new Insets(0, 0, 5, 5);
		gbc_listGuias.gridheight = 7;
		gbc_listGuias.gridx = 3;
		gbc_listGuias.gridy = 6;
		add(listGuias, gbc_listGuias);
		crearLista();
		
		btnNewButton = new JButton("Eliminar ");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		
		btnNewButton_2 = new JButton("Modificar ");
		btnNewButton_2.addActionListener(new BtnNewButton_2ActionListener());
		
		btnNewButton_1 = new JButton("Agregar ");
		btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.gridx = 5;
		gbc_btnNewButton_1.gridy = 7;
		add(btnNewButton_1, gbc_btnNewButton_1);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 7;
		gbc_btnNewButton_2.gridy = 8;
		add(btnNewButton_2, gbc_btnNewButton_2);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 9;
		add(btnNewButton, gbc_btnNewButton);
		
		
		lblNewLabel_1 = new JLabel("DESCRIPCION ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		
		
		
		

	}
	public 	void crearLista() {
	
			
			for(int i = 0; i<=listaGuias.size()-1; i++){
			        modelo.addElement(listaGuias.get(i).getNombre());
			}
			listGuias.setModel(modelo);
		}
	public 	void añadir (Guias g ) {
		
		DefaultListModel modelo = new DefaultListModel();
	    listaGuias.add(g);
		for(int i = 0; i<=listaGuias.size()-1; i++){
		        modelo.addElement(listaGuias.get(i).getNombre());
		}
		listGuias.setModel(modelo);
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	try {
			Guias g =new Guias(textNombre.getText(),textDNI.getText(),textEdad.getText(),textSexo.getText());
			
			if (textNombre.getText().equals("") || textDNI.getText().equals("")|| textEdad.getText().equals("")|| textSexo.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "CAMPOS VACIOS");
			
			}else {
			
				añadir(g);
			}
		
		}catch(ArrayIndexOutOfBoundsException ex ) {
			
		
		}
	 }
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			DefaultListModel modelo = new DefaultListModel();
			modelo.remove(listGuias.getSelectedIndex());
			listGuias.setModel(modelo);
			

			
				
				}
	}
	private class BtnNewButton_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Guias g= listaGuias.get(listGuias.getSelectedIndex());
			g.setNombre(textNombre.getText());
			g.setDNI(textDNI.getText());
			g.setEdad(textEdad.getText());
			g.setSexo(textSexo.getText());
			
			}
	}
	private class ListGuiasListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			textNombre.setText(listaGuias.get(listGuias.getSelectedIndex()).getNombre());
			textDNI.setText(listaGuias.get(listGuias.getSelectedIndex()).getDNI());
			textEdad.setText(listaGuias.get(listGuias.getSelectedIndex()).getEdad());
			textSexo.setText(listaGuias.get(listGuias.getSelectedIndex()).getSexo());
		}
	}
}
