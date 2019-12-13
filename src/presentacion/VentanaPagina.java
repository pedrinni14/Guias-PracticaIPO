package presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.AbstractListModel;


public class VentanaPagina {
	
	public JFrame frmAplicacion;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu_1;
	private JRadioButtonMenuItem radioButtonMenuItem;
	private JRadioButtonMenuItem radioButtonMenuItem_1;
	private JRadioButtonMenuItem radioButtonMenuItem_2;
	private JMenu menu_2;
	private JRadioButtonMenuItem radioButtonMenuItem_3;
	private JRadioButtonMenuItem radioButtonMenuItem_4;
	private JRadioButtonMenuItem radioButtonMenuItem_5;
	private JMenu menu_3;
	private JMenuItem menuItem;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel Nombre;
	private JTabbedPane tabbedPane;
	private JPanel pnlHistorial;
	private JPanel pnlCircuitosDisponibles;
	private JPanel pnlGuiasTuristicos;
	private JPanel pnlCreaTuRuta;
	private Button button;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPagina window = new VentanaPagina();
					window.frmAplicacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPagina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplicacion = new JFrame();
		frmAplicacion.setTitle("Aplicacion");
		frmAplicacion.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPagina.class.getResource("/presentacion/route.png")));
		frmAplicacion.setBounds(100, 100, 1044, 551);
		frmAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frmAplicacion.setJMenuBar(menuBar);
		
		menu = new JMenu("Opciones");
		menu.setMnemonic('O');
		menuBar.add(menu);
		
		menu_1 = new JMenu("Tamaño de Fuente");
		menu.add(menu_1);
		
		radioButtonMenuItem = new JRadioButtonMenuItem("Grande");
		menu_1.add(radioButtonMenuItem);
		
		radioButtonMenuItem_1 = new JRadioButtonMenuItem("Mediana");
		menu_1.add(radioButtonMenuItem_1);
		
		radioButtonMenuItem_2 = new JRadioButtonMenuItem("Pequeña");
		menu_1.add(radioButtonMenuItem_2);
		
		menu_2 = new JMenu("Tipo de fuente");
		menu.add(menu_2);
		
		radioButtonMenuItem_3 = new JRadioButtonMenuItem("Arial");
		menu_2.add(radioButtonMenuItem_3);
		
		radioButtonMenuItem_4 = new JRadioButtonMenuItem("Calibri");
		menu_2.add(radioButtonMenuItem_4);
		
		radioButtonMenuItem_5 = new JRadioButtonMenuItem("Times New Roman");
		menu_2.add(radioButtonMenuItem_5);
		
		menu_3 = new JMenu("Ayuda");
		menu_3.setMnemonic('A');
		menuBar.add(menu_3);
		
		menuItem = new JMenuItem("Acerca de ");
		menu_3.add(menuItem);
		frmAplicacion.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		frmAplicacion.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		pnlHistorial = new JPanel();
		tabbedPane.addTab("Historial", null, pnlHistorial, null);
		
		pnlCircuitosDisponibles = new PanelCircuitos();
		tabbedPane.addTab("Circuitos Disponibles", null, pnlCircuitosDisponibles, null);
		
		pnlGuiasTuristicos = new JPanel();
		tabbedPane.addTab("Guias Turisticos", null, pnlGuiasTuristicos, null);
		pnlGuiasTuristicos.setLayout(new BorderLayout(0, 0));
		
		pnlCreaTuRuta = new EditorGrafico();
		tabbedPane.addTab("Crea tu ruta", null, pnlCreaTuRuta, null);
		
		panel_1 = new JPanel();
		frmAplicacion.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		Nombre = new JLabel("(Nombre)");
		DatosUsuario d =new DatosUsuario();
		System.out.println(d.getUsuario());
		Nombre.setText(d.getUsuario());
		panel_1.add(Nombre, BorderLayout.WEST);
		
		button = new Button("New button");
		panel_1.add(button, BorderLayout.EAST);
	}

	public JFrame getFrame() {
		return frmAplicacion;
	}

	public void setFrame(JFrame frame) {
		this.frmAplicacion = frame;
	}
}
