package presentacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.AbstractListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import dominio.DatosUsuario;
import dominio.Usuario;

import java.util.Date;
import java.util.Calendar;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import presentacion.PanelGuias;

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
	private JLabel lblAplicacionDeRutas;
	private JPanel pnlGrupos;
	private JComboBox comboBox;

	

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
		frmAplicacion.setMinimumSize(new Dimension(1081, 589));
		frmAplicacion.setTitle(MessagesPrincipal.getString("VentanaPagina.0")); //$NON-NLS-1$
		frmAplicacion.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPagina.class.getResource(MessagesPrincipal.getString("VentanaPagina.1")))); //$NON-NLS-1$
		frmAplicacion.setBounds(225, 0, 900, 700);
		frmAplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new JMenuBar();
		frmAplicacion.setJMenuBar(menuBar);
		
		menu = new JMenu();
		menu.setText(MessagesPrincipal.getString("VentanaPagina.menu.text")); //$NON-NLS-1$
		menu.setMnemonic('O');
		menuBar.add(menu);
		
		menu_1 = new JMenu();
		menu_1.setText(MessagesPrincipal.getString("VentanaPagina.menu_1.text")); //$NON-NLS-1$
		menu.add(menu_1);
		
		radioButtonMenuItem = new JRadioButtonMenuItem();
		radioButtonMenuItem.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem.text")); //$NON-NLS-1$
		menu_1.add(radioButtonMenuItem);
		
		radioButtonMenuItem_1 = new JRadioButtonMenuItem();
		radioButtonMenuItem_1.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem_1.text")); //$NON-NLS-1$
		menu_1.add(radioButtonMenuItem_1);
		
		radioButtonMenuItem_2 = new JRadioButtonMenuItem();
		radioButtonMenuItem_2.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem_2.text")); //$NON-NLS-1$
		menu_1.add(radioButtonMenuItem_2);
		
		menu_2 = new JMenu(MessagesPrincipal.getString("VentanaPagina.2")); //$NON-NLS-1$
		menu.add(menu_2);
		
		radioButtonMenuItem_3 = new JRadioButtonMenuItem(MessagesPrincipal.getString("VentanaPagina.3")); //$NON-NLS-1$
		menu_2.add(radioButtonMenuItem_3);
		
		radioButtonMenuItem_4 = new JRadioButtonMenuItem(MessagesPrincipal.getString("VentanaPagina.4")); //$NON-NLS-1$
		menu_2.add(radioButtonMenuItem_4);
		
		radioButtonMenuItem_5 = new JRadioButtonMenuItem(MessagesPrincipal.getString("VentanaPagina.5")); //$NON-NLS-1$
		menu_2.add(radioButtonMenuItem_5);
		
		menu_3 = new JMenu();
		menu_3.setText(MessagesPrincipal.getString("VentanaPagina.menu_3.text")); //$NON-NLS-1$
		menu_3.setMnemonic('A');
		menuBar.add(menu_3);
		
		menuItem = new JMenuItem();
		menuItem.setText(MessagesPrincipal.getString("VentanaPagina.menuItem.text")); //$NON-NLS-1$
		menu_3.add(menuItem);
		frmAplicacion.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		frmAplicacion.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tabbedPane);
		
		pnlHistorial = new PanelHistorial();
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.6"), null, pnlHistorial, null); //$NON-NLS-1$
		
		pnlCircuitosDisponibles = new PanelCircuitos();
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.7"), null, pnlCircuitosDisponibles, null); //$NON-NLS-1$
		

		pnlCreaTuRuta = new EditorGrafico();

		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.8"), null, pnlCreaTuRuta, null); //$NON-NLS-1$
		
		pnlGuias = new PanelGuias();
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.9"), null, pnlGuias, null); //$NON-NLS-1$
		
		pnlOfertas = new PanelOfertas();
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.10"), null, pnlOfertas, null); //$NON-NLS-1$
		
		pnlGrupos = new PanelGrupos();
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.11"), null, pnlGrupos, null); //$NON-NLS-1$
		
		panel_1 = new JPanel();
		frmAplicacion.getContentPane().add(panel_1, BorderLayout.NORTH);
		DatosUsuario d =new DatosUsuario();
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{156, 427, 0, 129, 64, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 64, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString()=="ENGLISH") { //$NON-NLS-1$
					MessagesPrincipal.setIdioma("ingles"); //$NON-NLS-1$
					texto();
					MessagesGuias.setIdioma("ingles");
					PanelGuias.textoGuias();
					
					
					
					
					
				}else {
					MessagesPrincipal.setIdioma("español"); //$NON-NLS-1$
					texto();
					MessagesGuias.setIdioma("español");
					
					PanelGuias.textoGuias();
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ESPAÑOL", "ENGLISH"})); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 0;
		panel_1.add(comboBox, gbc_comboBox);
		
		lblAplicacionDeRutas = new JLabel();
		lblAplicacionDeRutas.setText(MessagesPrincipal.getString("VentanaPagina.lblAplicacionDeRutas.text")); //$NON-NLS-1$
		lblAplicacionDeRutas.setFont(new Font("Tahoma", Font.BOLD, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_lblAplicacionDeRutas = new GridBagConstraints();
		gbc_lblAplicacionDeRutas.gridheight = 3;
		gbc_lblAplicacionDeRutas.gridwidth = 2;
		gbc_lblAplicacionDeRutas.insets = new Insets(0, 0, 5, 5);
		gbc_lblAplicacionDeRutas.gridx = 0;
		gbc_lblAplicacionDeRutas.gridy = 1;
		panel_1.add(lblAplicacionDeRutas, gbc_lblAplicacionDeRutas);
		
		lblFoto = new JLabel(""); //$NON-NLS-1$
		lblFoto.setIcon(new ImageIcon(VentanaPagina.class.getResource("/presentacion/user-2.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblFoto.gridx = 2;
		gbc_lblFoto.gridy = 1;
		panel_1.add(lblFoto, gbc_lblFoto);
		
		Nombre = new JLabel();
		Nombre.setText(MessagesPrincipal.getString("VentanaPagina.Nombre.text")); //$NON-NLS-1$
		Nombre.setFont(new Font("Tahoma", Font.PLAIN, 18)); //$NON-NLS-1$
		GridBagConstraints gbc_Nombre = new GridBagConstraints();
		gbc_Nombre.gridwidth = 2;
		gbc_Nombre.insets = new Insets(0, 0, 5, 5);
		gbc_Nombre.gridx = 3;
		gbc_Nombre.gridy = 1;
		panel_1.add(Nombre, gbc_Nombre);
		
		lblUltimaConexion = new JLabel();
		lblUltimaConexion.setText(MessagesPrincipal.getString("VentanaPagina.lblUltimaConexion.text")); //$NON-NLS-1$
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
		
		btnCerrarSesion = new JButton();
		btnCerrarSesion.setText(MessagesPrincipal.getString("VentanaPagina.btnCerrarSesion.text")); //$NON-NLS-1$
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaLogin frame = new VentanaLogin();
				Icon icono = new ImageIcon(getClass().getResource("/presentacion/Guia1.jpg")); //$NON-NLS-1$
				Object[] botones= {MessagesPrincipal.getString("VentanaPagina.BotonYes"),MessagesPrincipal.getString("VentanaPagina.BotonNo")};
				//int i =JOptionPane.showConfirmDialog(null, MessagesPrincipal.getString("VentanaPagina.20"), MessagesPrincipal.getString("VentanaPagina.21"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,lblFoto.getIcon()); //$NON-NLS-1$ //$NON-NLS-2$
				int i= JOptionPane.showOptionDialog(frmAplicacion, MessagesPrincipal.getString("VentanaPagina.20"),
						MessagesPrincipal.getString("VentanaPagina.21"), 
						JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE, null,botones, 0);

				if(i==0) {
					frame.Login.setVisible(true);
					frmAplicacion.dispose();
				}
				
			}
		});
		GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
		gbc_btnCerrarSesion.gridwidth = 2;
		gbc_btnCerrarSesion.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrarSesion.gridx = 3;
		gbc_btnCerrarSesion.gridy = 4;
		panel_1.add(btnCerrarSesion, gbc_btnCerrarSesion);
		//UserConectado();
	}

	public JFrame getFrame() {
		return frmAplicacion;
	}

	public void setFrame(JFrame frame) {
		this.frmAplicacion = frame;
	}
	
	public void SetNombre(Usuario n) {
		Nombre.setText(n.getUsuario());
	}
	public void SetFoto(Usuario n) {
		lblFoto.setIcon(new ImageIcon(n.getFoto()));
	}
	
	public void SetUltimaConexion(String ultimaconexion) throws ParseException {
		String pattern = "dd-MM-yyyy HH:mm:ss"; //$NON-NLS-1$
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = simpleDateFormat.parse(ultimaconexion);
		spinner.setValue(date);
	}
	
	public void texto() {
		menu.setText(MessagesPrincipal.getString("VentanaPagina.menu.text")); //$NON-NLS-1$
		menu_1.setText(MessagesPrincipal.getString("VentanaPagina.menu_1.text")); //$NON-NLS-1$
		radioButtonMenuItem.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem.text")); //$NON-NLS-1$
		radioButtonMenuItem_1.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem_1.text")); //$NON-NLS-1$
		radioButtonMenuItem_2.setText(MessagesPrincipal.getString("VentanaPagina.radioButtonMenuItem_2.text")); //$NON-NLS-1$
		menu_3.setText(MessagesPrincipal.getString("VentanaPagina.menu_3.text")); //$NON-NLS-1$
		menuItem.setText(MessagesPrincipal.getString("VentanaPagina.menuItem.text")); //$NON-NLS-1$
		lblAplicacionDeRutas.setText(MessagesPrincipal.getString("VentanaPagina.lblAplicacionDeRutas.text")); //$NON-NLS-1$
		//Nombre.setText(MessagesPrincipal.getString("VentanaPagina.Nombre.text")); //$NON-NLS-1$
		lblUltimaConexion.setText(MessagesPrincipal.getString("VentanaPagina.lblUltimaConexion.text")); //$NON-NLS-1$
		btnCerrarSesion.setText(MessagesPrincipal.getString("VentanaPagina.btnCerrarSesion.text")); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.6"), null, pnlHistorial, null); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.7"), null, pnlCircuitosDisponibles, null); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.8"), null, pnlCreaTuRuta, null); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.9"), null, pnlGuias, null); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.10"), null, pnlOfertas, null); //$NON-NLS-1$
		tabbedPane.addTab(MessagesPrincipal.getString("VentanaPagina.11"), null, pnlGrupos, null); //$NON-NLS-1$
		
		
		
		
	}
}

