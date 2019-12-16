package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

import javax.swing.AbstractButton;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCircuitos extends JPanel {
	private JPanel pnlListaPedidos;
	private JScrollPane scrollPane;
	private JButton btnAadir;
	private JButton btnModificar;
	private JList list;
	private JButton btnEliminar;
	private JPanel panel;
	private JPanel Formulario;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JList R;
	private JScrollPane scrollPane_3;
	private JList T;
	private JList M;
	private JPanel Monumento;
	private JPanel Restaurantes;
	private JPanel Tiendas;
	private JLabel lblNombre;
	private JTextField textField;
	private JLabel lblGratuito;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel;
	private JSpinner spinner;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton button;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Create the panel.
	 */
	public PanelCircuitos() {
		setMinimumSize(new Dimension(1366, 768));
		setLayout(new BorderLayout(0, 0));
		
		pnlListaPedidos = new JPanel();
		add(pnlListaPedidos, BorderLayout.WEST);
		GridBagLayout gbl_pnlListaPedidos = new GridBagLayout();
		gbl_pnlListaPedidos.columnWidths = new int[]{0, 0, 90, 150, 104, 0, 0};
		gbl_pnlListaPedidos.rowHeights = new int[]{0, 195, 0, 0, 0};
		gbl_pnlListaPedidos.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlListaPedidos.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlListaPedidos.setLayout(gbl_pnlListaPedidos);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		pnlListaPedidos.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new BtnAadirActionListener());
		btnAadir.setMinimumSize(new Dimension(75, 23));
		btnAadir.setMaximumSize(new Dimension(75, 23));
		btnAadir.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 2;
		pnlListaPedidos.add(btnAadir, gbc_btnAadir);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 2;
		pnlListaPedidos.add(btnEliminar, gbc_btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setMinimumSize(new Dimension(69, 23));
		btnModificar.setMaximumSize(new Dimension(69, 23));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 2;
		pnlListaPedidos.add(btnModificar, gbc_btnModificar);
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 215, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 108, 0, 88, 0, 73, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MMouseListener());
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		panel.add(scrollPane_1, gbc_scrollPane_1);
		
		JList M = new JList();
		M.addMouseListener(new MMouseListener());
		M.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		M.addListSelectionListener(new List_1ListSelectionListener());
		M.setModel(new AbstractListModel() {
			String[] values = new String[] {"hola", "Adios"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		M.setBorder(new TitledBorder(null, "Monumentos ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setViewportView(M);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.addMouseListener(new MMouseListener());
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 3;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		R = new JList();
		R.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		R.addListSelectionListener(new List_2ListSelectionListener());
		
		R.setModel(new AbstractListModel() {
			String[] values = new String[] {"Adios", "444", "555", "555"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		R.setBorder(new TitledBorder(null, "Restaurantes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_2.setViewportView(R);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.addMouseListener(new MMouseListener());
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 5;
		panel.add(scrollPane_3, gbc_scrollPane_3);
		
		T = new JList();
		T.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		T.setBorder(new TitledBorder(null, "Tiendas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_3.setViewportView(T);
		
		Formulario = new JPanel();
		add(Formulario, BorderLayout.EAST);
		Formulario.setLayout(new CardLayout(0, 0));
		
		Monumento = new JPanel();
		
		Formulario.add(Monumento, "Monumentos");
		GridBagLayout gbl_Monumento = new GridBagLayout();
		gbl_Monumento.columnWidths = new int[]{97, 45, 55, 0, 0, 0, 0};
		gbl_Monumento.rowHeights = new int[]{25, 0, 0, 0, 34, 27, 29, 479, 0};
		gbl_Monumento.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Monumento.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		Monumento.setLayout(gbl_Monumento);
		
		lblNombre = new JLabel("Nombre ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		Monumento.add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		Monumento.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblGratuito = new JLabel("Gratuito ");
		GridBagConstraints gbc_lblGratuito = new GridBagConstraints();
		gbc_lblGratuito.anchor = GridBagConstraints.EAST;
		gbc_lblGratuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblGratuito.gridx = 0;
		gbc_lblGratuito.gridy = 2;
		Monumento.add(lblGratuito, gbc_lblGratuito);
		
		rdbtnNewRadioButton = new JRadioButton("SI");
		buttonGroup.add(rdbtnNewRadioButton);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.EAST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 2;
		Monumento.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("NO");
		buttonGroup.add(rdbtnNewRadioButton_1);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 2;
		gbc_rdbtnNewRadioButton_1.gridy = 2;
		Monumento.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		lblNewLabel = new JLabel("Horario ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		Monumento.add(lblNewLabel, gbc_lblNewLabel);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1576450800000L), new Date(1576450800000L), null, Calendar.DAY_OF_YEAR));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.gridwidth = 2;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 4;
		Monumento.add(spinner, gbc_spinner);
		
		lblNewLabel_1 = new JLabel("Duración ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 6;
		Monumento.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 6;
		Monumento.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		Monumento.add(btnNewButton, gbc_btnNewButton);
		
		button = new JButton("New button");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.SOUTHWEST;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 7;
		Monumento.add(button, gbc_button);
		
		Restaurantes = new JPanel();
		Formulario.add(Restaurantes, "Restaurantes");
		GridBagLayout gbl_Restaurantes = new GridBagLayout();
		gbl_Restaurantes.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Restaurantes.rowHeights = new int[]{0, 0, 0, 31, 0, 0, 0};
		gbl_Restaurantes.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Restaurantes.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Restaurantes.setLayout(gbl_Restaurantes);
		
		lblNewLabel_2 = new JLabel("Nombre ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		Restaurantes.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 1;
		Restaurantes.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Tipo de comida ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		Restaurantes.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		Restaurantes.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_1 = new JButton("AÑADIR ");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 5;
		Restaurantes.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton_2 = new JButton("MODIFICAR ");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 5;
		Restaurantes.add(btnNewButton_2, gbc_btnNewButton_2);
		
		btnNewButton_3 = new JButton("ELIMINAR ");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 5;
		Restaurantes.add(btnNewButton_3, gbc_btnNewButton_3);
		
		Tiendas = new JPanel();
		Formulario.add(Tiendas, "Tiendas");
		GridBagLayout gbl_Tiendas = new GridBagLayout();
		gbl_Tiendas.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_Tiendas.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_Tiendas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Tiendas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Tiendas.setLayout(gbl_Tiendas);

	}

	private class List_1ListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			CardLayout cl = (CardLayout)(Formulario.getLayout());
			cl.show(Formulario, "Monumentos");
		}
	}
	private class List_2ListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			CardLayout cl = (CardLayout)(Formulario.getLayout());
			cl.show(Formulario, "Restaurantes");
		}
	}
	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(Formulario.getLayout());
			cl.show(Formulario, "Restaurantes");
		}
	}
	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class MMouseListener extends MouseAdapter {
		@Override
		public void mouseExited(MouseEvent e) {
	 
		}
	}
	
}
