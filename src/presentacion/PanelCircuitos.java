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
import javax.swing.DefaultListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
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
import javax.swing.SpinnerListModel;

public class PanelCircuitos extends JPanel {
	private static ArrayList<Ruta> listaRutas = Ruta.generarRutas();
	private JPanel pnlListaPedidos;
	private JScrollPane scrollPane;
	private JButton btnAadir;
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
	private JSpinner Apertura;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JButton AñadirM;
	private JButton EliminarM;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton AñadirR;
	private JButton ModificarR;
	private JButton EliminarR;
	private JButton ModificarM;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_6;
	private JSpinner Cierre;
	DefaultListModel modelo = new DefaultListModel();

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
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				//listaGuias.get(listGuias.getSelectedIndex()).getNombre()
				ArrayList<Monumento> monumentos;
				ArrayList<Tienda> tiendas;
				ArrayList<Restaurante> restaurantes;
				monumentos=listaRutas.get(list.getSelectedIndex()).getM();
				tiendas=listaRutas.get(list.getSelectedIndex()).getT();
				restaurantes=listaRutas.get(list.getSelectedIndex()).getR();
				DefaultListModel modelo2 = new DefaultListModel();
				DefaultListModel modelo3 = new DefaultListModel();
				DefaultListModel modelo4 = new DefaultListModel();


				for (int i = 0; i <= monumentos.size() - 1; i++) {

					modelo2.addElement(monumentos.get(i).getNombre());

				}
				M.setModel(modelo2);
				for (int i = 0; i <= tiendas.size() - 1; i++) {

					modelo3.addElement(tiendas.get(i).getNombre());

				}
				T.setModel(modelo3);
				for (int i = 0; i <= restaurantes.size() - 1; i++) {

					modelo4.addElement(restaurantes.get(i).getNombre());

				}
				R.setModel(modelo4);
			}
		});
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
		crearLista();
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new BtnEliminarActionListener());
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 2;
		pnlListaPedidos.add(btnEliminar, gbc_btnEliminar);
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 215, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 135, 0, 126, 0, 124, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MMouseListener());
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 2;
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
			String[] values = new String[] {"Monumneto 1 ", "Monumento 2 "};
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
		gbc_scrollPane_2.gridheight = 2;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 3;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		R = new JList();
		R.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		R.addListSelectionListener(new List_2ListSelectionListener());
		
		R.setModel(new AbstractListModel() {
			String[] values = new String[] {"Restaurante 1 ", "Restaurante 2"};
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
		gbc_scrollPane_3.gridheight = 2;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 1;
		gbc_scrollPane_3.gridy = 5;
		panel.add(scrollPane_3, gbc_scrollPane_3);
		
		T = new JList();
		T.addListSelectionListener(new TListSelectionListener());
		T.setModel(new AbstractListModel() {
			String[] values = new String[] {"Tienda 1 ", "Tineda 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
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
		gbl_Monumento.rowHeights = new int[]{25, 0, 0, 0, 34, 27, 0, 29, 53, 0, 0, 0, 0};
		gbl_Monumento.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Monumento.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_textField.gridwidth = 3;
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
		
		lblNewLabel = new JLabel("Apertura");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		Monumento.add(lblNewLabel, gbc_lblNewLabel);
		
		Apertura = new JSpinner();
		Apertura.setModel(new SpinnerListModel(new String[] {"00:00"}));
		GridBagConstraints gbc_Apertura = new GridBagConstraints();
		gbc_Apertura.gridwidth = 3;
		gbc_Apertura.insets = new Insets(0, 0, 5, 5);
		gbc_Apertura.gridx = 1;
		gbc_Apertura.gridy = 4;
		Monumento.add(Apertura, gbc_Apertura);
		
		AñadirM = new JButton("Añadir ");
		AñadirM.addActionListener(new AñadirMActionListener());
		
		lblNewLabel_6 = new JLabel("Cierre");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		Monumento.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		Cierre = new JSpinner();
		Cierre.setModel(new SpinnerListModel(new String[] {"00:00"}));
		GridBagConstraints gbc_Cierre = new GridBagConstraints();
		gbc_Cierre.gridwidth = 3;
		gbc_Cierre.insets = new Insets(0, 0, 5, 5);
		gbc_Cierre.gridx = 1;
		gbc_Cierre.gridy = 6;
		Monumento.add(Cierre, gbc_Cierre);
		
		lblNewLabel_1 = new JLabel("Duración ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 8;
		Monumento.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 8;
		Monumento.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		GridBagConstraints gbc_AñadirM = new GridBagConstraints();
		gbc_AñadirM.anchor = GridBagConstraints.SOUTHWEST;
		gbc_AñadirM.insets = new Insets(0, 0, 5, 5);
		gbc_AñadirM.gridx = 1;
		gbc_AñadirM.gridy = 10;
		Monumento.add(AñadirM, gbc_AñadirM);
		
		EliminarM = new JButton("Eliminar ");
		GridBagConstraints gbc_EliminarM = new GridBagConstraints();
		gbc_EliminarM.anchor = GridBagConstraints.SOUTHWEST;
		gbc_EliminarM.insets = new Insets(0, 0, 5, 5);
		gbc_EliminarM.gridx = 2;
		gbc_EliminarM.gridy = 10;
		Monumento.add(EliminarM, gbc_EliminarM);
		
		ModificarM = new JButton("Modificar ");
		ModificarM.addActionListener(new ModificarMActionListener());
		GridBagConstraints gbc_ModificarM = new GridBagConstraints();
		gbc_ModificarM.anchor = GridBagConstraints.SOUTH;
		gbc_ModificarM.insets = new Insets(0, 0, 5, 5);
		gbc_ModificarM.gridx = 3;
		gbc_ModificarM.gridy = 10;
		Monumento.add(ModificarM, gbc_ModificarM);
		
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
		
		AñadirR = new JButton("AÑADIR ");
		GridBagConstraints gbc_AñadirR = new GridBagConstraints();
		gbc_AñadirR.insets = new Insets(0, 0, 0, 5);
		gbc_AñadirR.gridx = 1;
		gbc_AñadirR.gridy = 5;
		Restaurantes.add(AñadirR, gbc_AñadirR);
		
		ModificarR = new JButton("MODIFICAR ");
		GridBagConstraints gbc_ModificarR = new GridBagConstraints();
		gbc_ModificarR.insets = new Insets(0, 0, 0, 5);
		gbc_ModificarR.gridx = 2;
		gbc_ModificarR.gridy = 5;
		Restaurantes.add(ModificarR, gbc_ModificarR);
		
		EliminarR = new JButton("ELIMINAR ");
		GridBagConstraints gbc_EliminarR = new GridBagConstraints();
		gbc_EliminarR.insets = new Insets(0, 0, 0, 5);
		gbc_EliminarR.gridx = 3;
		gbc_EliminarR.gridy = 5;
		Restaurantes.add(EliminarR, gbc_EliminarR);
		
		Tiendas = new JPanel();
		Formulario.add(Tiendas, "Tiendas");
		GridBagLayout gbl_Tiendas = new GridBagLayout();
		gbl_Tiendas.columnWidths = new int[]{0, 138, 0, 0, 0, 0, 0};
		gbl_Tiendas.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Tiendas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Tiendas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Tiendas.setLayout(gbl_Tiendas);
		
		lblNewLabel_4 = new JLabel("Nombre ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		Tiendas.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 4;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 0;
		Tiendas.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Tipo de Tienda ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 2;
		Tiendas.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 4;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 2;
		Tiendas.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		btnNewButton = new JButton("AÑADIR");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		Tiendas.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1 = new JButton("ELIMINAR ");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 4;
		Tiendas.add(btnNewButton_1, gbc_btnNewButton_1);
		
		btnNewButton_2 = new JButton("MODIFICAR ");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 4;
		gbc_btnNewButton_2.gridy = 4;
		Tiendas.add(btnNewButton_2, gbc_btnNewButton_2);

	}

	private class List_1ListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			R.clearSelection();
			T.clearSelection();
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
	private class TListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			CardLayout cl = (CardLayout)(Formulario.getLayout());
			cl.show(Formulario, "Tiendas");
		}
	}
	private class AñadirMActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class ModificarMActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public 	void crearLista() {
		
		
		for(int i = 0; i<=listaRutas.size()-1; i++){
		        modelo.addElement(listaRutas.get(i).getNombre());
		}
		list.setModel(modelo);
		
	}
	
	
	
}
