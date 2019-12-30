package presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	private JTabbedPane tabbedPane;
	private JPanel pnlHistorial;
	private JPanel pnlCircuitosDisponibles;
	private JPanel pnlGuias;
	private JPanel pnlCreaTuRuta;

	private JLabel lblFoto;
	private JPanel pnlOfertas;
	private JLabel Nombre;
	private JButton btnCerrarSesion;
	private JLabel lblUltimaConexion;
	private JSpinner spinner;

	

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
		frmAplicacion.setSize(new Dimension(700, 700));
		frmAplicacion.setMinimumSize(new Dimension(900, 700));
		frmAplicacion.setTitle("Aplicacion");
		frmAplicacion.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPagina.class.getResource("/presentacion/route.png")));
		frmAplicacion.setBounds(225, 0, 900, 700);
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
		
		pnlHistorial = new PanelHistorial();
		tabbedPane.addTab("Historial", null, pnlHistorial, null);
		
		pnlCircuitosDisponibles = new PanelCircuitos();
		tabbedPane.addTab("Circuitos Disponibles", null, pnlCircuitosDisponibles, null);
		

		pnlCreaTuRuta = new EditorGrafico();

		tabbedPane.addTab("Crea tu ruta", null, pnlCreaTuRuta, null);
		
		pnlGuias = new PanelGuias();
		tabbedPane.addTab("Guias Turisticos", null, pnlGuias, null);
		
		pnlOfertas = new PanelOfertas();
		tabbedPane.addTab("Ofertas y Promociones", null, pnlOfertas, null);
		
		panel_1 = new JPanel();
		frmAplicacion.getContentPane().add(panel_1, BorderLayout.NORTH);
		DatosUsuario d =new DatosUsuario();
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{156, 427, 0, 129, 64, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 64, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(VentanaPagina.class.getResource("/presentacion/user-2.png")));
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblFoto.gridx = 2;
		gbc_lblFoto.gridy = 1;
		panel_1.add(lblFoto, gbc_lblFoto);
		
		Nombre = new JLabel("(nombre)");
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_Nombre = new GridBagConstraints();
		gbc_Nombre.gridwidth = 2;
		gbc_Nombre.insets = new Insets(0, 0, 5, 5);
		gbc_Nombre.gridx = 3;
		gbc_Nombre.gridy = 1;
		panel_1.add(Nombre, gbc_Nombre);
		
		lblUltimaConexion = new JLabel("Ultima Conexion");
		GridBagConstraints gbc_lblUltimaConexion = new GridBagConstraints();
		gbc_lblUltimaConexion.anchor = GridBagConstraints.EAST;
		gbc_lblUltimaConexion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUltimaConexion.gridx = 2;
		gbc_lblUltimaConexion.gridy = 2;
		panel_1.add(lblUltimaConexion, gbc_lblUltimaConexion);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1576450800000L), null, null, Calendar.DAY_OF_YEAR));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.gridwidth = 2;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 3;
		gbc_spinner.gridy = 2;
		panel_1.add(spinner, gbc_spinner);
		
		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaLogin frame = new VentanaLogin();
				frame.Login.setVisible(true);
				frmAplicacion.dispose();
			}
		});
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridwidth = 2;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 3;
		gbc_btnCerrarSesion.gridy = 4;
		panel_1.add(btnCerrarSesion, gbc_btnCerrarSesion);
		UserConectado();
	}

	public JFrame getFrame() {
		return frmAplicacion;
	}

	public void setFrame(JFrame frame) {
		this.frmAplicacion = frame;
	}
	public void UserConectado() {
		  URL archivo = null;
	      InputStreamReader fr = null;
	      BufferedReader br = null;

	      try {
	         
	         archivo = VentanaPagina.class.getResource("/presentacion/Usuario.txt");
	         fr =  new InputStreamReader(archivo.openStream());
	         br = new BufferedReader(fr);
	         String linea;
	         while((linea=br.readLine())!=null)
	        	 Nombre.setText(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	        
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	
		
	}

