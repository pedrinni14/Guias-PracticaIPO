package presentacion;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;

public class VentanaLogin {

	public static  JFrame Login;
	private JTextField user;
	private JMenuBar menuBar;
	private JMenu mnOpciones;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDe;
	private JButton btnLimpiar;
	private JMenu mnTamañoFuente;
	private JRadioButtonMenuItem rdbtnmntmMediana;
	private JRadioButtonMenuItem rdbtnmntmPequeña;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButtonMenuItem rdbtnmntmGrande;
	private JMenu mnFuente;
	private JRadioButtonMenuItem rdbtnmntmArial;
	private JRadioButtonMenuItem rdbtnmntmCalibri;
	private JRadioButtonMenuItem rdbtnmntmTimesNewRoman;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private String letra;
	private int tamanio=12;
	private JButton btnNewButton;
	private JPasswordField pass;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	public String UsuarioConectado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
					window.Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setResizable(false);
		Login.getContentPane().setMaximumSize(new Dimension(600, 400));
		Login.setMaximumSize(new Dimension(600, 400));
		Login.setMinimumSize(new Dimension(600, 400));
		Login.setTitle("LOGIN");
		Login.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Login.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Login.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/presentacion/route.png")));
		Login.setBounds(100, 100, 600, 400);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{131, 59, 94, 64, 86, 74, 0, 0};
		gridBagLayout.rowHeights = new int[]{25, 81, 30, 39, 30, 59, 70, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Login.getContentPane().setLayout(gridBagLayout);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ESPAÑOL", "ENGLISH"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 0;
		Login.getContentPane().add(comboBox, gbc_comboBox);
		
		
		lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		Login.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblUsuario_1 = new JLabel("USUARIO");
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 0;
		gbc_lblUsuario_1.gridy = 2;
		Login.getContentPane().add(lblUsuario_1, gbc_lblUsuario_1);
		
		user = new JTextField();
		user.setToolTipText("NOMBRE DE USUARIO");
		GridBagConstraints gbc_user = new GridBagConstraints();
		gbc_user.gridwidth = 2;
		gbc_user.fill = GridBagConstraints.BOTH;
		gbc_user.insets = new Insets(0, 0, 5, 5);
		gbc_user.gridx = 1;
		gbc_user.gridy = 2;
		Login.getContentPane().add(user, gbc_user);
		user.setColumns(10);
		
		JLabel lblContraseña_1 = new JLabel("CONTRASEÑA");
		GridBagConstraints gbc_lblContraseña_1 = new GridBagConstraints();
		gbc_lblContraseña_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña_1.gridx = 0;
		gbc_lblContraseña_1.gridy = 4;
		Login.getContentPane().add(lblContraseña_1, gbc_lblContraseña_1);
		
		pass = new JPasswordField();
		pass.setToolTipText("CONTRASEÑA");
		GridBagConstraints gbc_pass = new GridBagConstraints();
		gbc_pass.gridwidth = 2;
		gbc_pass.fill = GridBagConstraints.BOTH;
		gbc_pass.insets = new Insets(0, 0, 5, 5);
		gbc_pass.gridx = 1;
		gbc_pass.gridy = 4;
		Login.getContentPane().add(pass, gbc_pass);
		
		btnNewButton = new JButton("ENTRAR");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		Login.getContentPane().add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		
		btnLimpiar = new JButton("LIMPIAR");
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 5;
		Login.getContentPane().add(btnLimpiar, gbc_btnLimpiar);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText("");
				pass.setText("");
			}
		});
		
		menuBar = new JMenuBar();
		Login.setJMenuBar(menuBar);
		
		mnOpciones = new JMenu("Opciones");
		mnOpciones.setMnemonic('O');
		menuBar.add(mnOpciones);
		
		mnTamañoFuente = new JMenu("Tamaño de Fuente");
		mnOpciones.add(mnTamañoFuente);
		
		rdbtnmntmGrande = new JRadioButtonMenuItem("Grande");
		rdbtnmntmGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tamanio=16;
			lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
			lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
			btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
			btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
			lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
			lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
			btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
			btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup.add(rdbtnmntmGrande);
		mnTamañoFuente.add(rdbtnmntmGrande);
		
		rdbtnmntmMediana = new JRadioButtonMenuItem("Mediana");
		rdbtnmntmMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio=12;
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup.add(rdbtnmntmMediana);
		mnTamañoFuente.add(rdbtnmntmMediana);
		
		rdbtnmntmPequeña = new JRadioButtonMenuItem("Pequeña");
		rdbtnmntmPequeña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio=10;
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			
			}
		});
		buttonGroup.add(rdbtnmntmPequeña);
		mnTamañoFuente.add(rdbtnmntmPequeña);
		
		mnFuente = new JMenu("Tipo de fuente");
		mnOpciones.add(mnFuente);
		
		rdbtnmntmArial = new JRadioButtonMenuItem("Arial");
		rdbtnmntmArial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			letra="Arial";
			lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
			lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
			btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
			btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
			lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
			lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
			btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
			btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmArial);
		mnFuente.add(rdbtnmntmArial);
		
		rdbtnmntmCalibri = new JRadioButtonMenuItem("Calibri");
		rdbtnmntmCalibri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letra="Calibri";
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmCalibri);
		mnFuente.add(rdbtnmntmCalibri);
		
		rdbtnmntmTimesNewRoman = new JRadioButtonMenuItem("Times New Roman");
		rdbtnmntmTimesNewRoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letra="Times New Roman";
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_1.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_1.setFont(new Font(letra, Font.PLAIN, lblContraseña_1.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
	
		buttonGroup_1.add(rdbtnmntmTimesNewRoman);
		mnFuente.add(rdbtnmntmTimesNewRoman);
		
		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setMnemonic('A');
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca de ");
		mnAyuda.add(mntmAcercaDe);
	}
	

	
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		// Codigo correspondiente al de entrar mas o menos Usuario jesus o pedro y contraseña 1234a para los dos 
			// Codigo sucio hay que mejorarlo 
			DatosUsuario d =new DatosUsuario(); 
		if (d.Existe(user.getText(), pass.getText())==1) {
			String nombre=user.getText();
			
			d.usuario=nombre;
			String n=d.UsuarioConectado(nombre);
			
			////////////////////////////
			JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
			VentanaPagina Vp= new VentanaPagina();
			Vp.SetNombre(n);
			try {
				Vp.SetUltimaConexion("09-08-2019 20:30:10");
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			Vp.frmAplicacion.setVisible(true);
			
			
			Login.dispose();//
		}else {
			if (d.Existe(user.getText(), pass.getText())==-1) {
			JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
			}else {
				JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
			}
		}
			
		}
	}
	
	
	public static JFrame getFrame() {
		return Login;
	}
}
