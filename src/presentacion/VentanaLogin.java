package presentacion;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class VentanaLogin {

	public  JFrame Login;
	private JTextField user;
	private JTextField pass;
	private JMenuBar menuBar;
	private JMenu mnOpciones;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDe;
	private JPanel pnlBotones;
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
		Login.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/presentacion/route.png")));
		Login.setBounds(100, 100, 1012, 590);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login.getContentPane().setLayout(null);
		
		user = new JTextField();
		user.setBounds(335, 177, 282, 30);
		Login.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(335, 248, 282, 26);
		Login.getContentPane().add(pass);
		pass.setColumns(10);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(149, 177, 174, 16);
		Login.getContentPane().add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("CONTRASEÑA");
		lblContraseña.setBounds(149, 248, 174, 16);
		Login.getContentPane().add(lblContraseña);
		
		pnlBotones = new JPanel();
		pnlBotones.setBounds(0, 417, 986, 102);
		Login.getContentPane().add(pnlBotones);
		pnlBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("ENTRAR");
		pnlBotones.add(btnNewButton);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText("");
				pass.setText("");
			}
		});
		pnlBotones.add(btnLimpiar);
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		
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
				lblUsuario.setFont(new Font(null, Font.PLAIN, 16));
				lblContraseña.setFont(new Font(null, Font.PLAIN, 16));
				btnNewButton.setFont(new Font(null, Font.PLAIN, 16));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, 16));
			}
		});
		buttonGroup.add(rdbtnmntmGrande);
		mnTamañoFuente.add(rdbtnmntmGrande);
		
		rdbtnmntmMediana = new JRadioButtonMenuItem("Mediana");
		rdbtnmntmMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUsuario.setFont(new Font(null, Font.PLAIN, 12));
				lblContraseña.setFont(new Font(null, Font.PLAIN, 12));
				btnNewButton.setFont(new Font(null, Font.PLAIN, 12));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, 12));
				
			}
		});
		buttonGroup.add(rdbtnmntmMediana);
		mnTamañoFuente.add(rdbtnmntmMediana);
		
		rdbtnmntmPequeña = new JRadioButtonMenuItem("Pequeña");
		rdbtnmntmPequeña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUsuario.setFont(new Font(null, Font.PLAIN, 10));
				lblContraseña.setFont(new Font(null, Font.PLAIN, 10));
				btnNewButton.setFont(new Font(null, Font.PLAIN, 10));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, 10));
			}
		});
		buttonGroup.add(rdbtnmntmPequeña);
		mnTamañoFuente.add(rdbtnmntmPequeña);
		
		mnFuente = new JMenu("Tipo de fuente");
		mnOpciones.add(mnFuente);
		
		rdbtnmntmArial = new JRadioButtonMenuItem("Arial");
		rdbtnmntmArial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUsuario.setFont(new Font("Arial", Font.PLAIN, lblUsuario.getFont().getSize()));
				lblContraseña.setFont(new Font("Arial", Font.PLAIN, lblContraseña.getFont().getSize()));
				btnNewButton.setFont(new Font("Arial", Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font("Arial", Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmArial);
		mnFuente.add(rdbtnmntmArial);
		
		rdbtnmntmCalibri = new JRadioButtonMenuItem("Calibri");
		rdbtnmntmCalibri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUsuario.setFont(new Font("Calibri", Font.PLAIN, lblUsuario.getFont().getSize()));
				lblContraseña.setFont(new Font("Calibri", Font.PLAIN, lblContraseña.getFont().getSize()));
				btnNewButton.setFont(new Font("Calibri", Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font("Calibri", Font.PLAIN, btnLimpiar.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmCalibri);
		mnFuente.add(rdbtnmntmCalibri);
		
		rdbtnmntmTimesNewRoman = new JRadioButtonMenuItem("Times New Roman");
		rdbtnmntmTimesNewRoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, lblUsuario.getFont().getSize()));
				lblContraseña.setFont(new Font("Times New Roman", Font.PLAIN, lblContraseña.getFont().getSize()));
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, btnLimpiar.getFont().getSize()));
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
			
			JOptionPane.showMessageDialog(null, "INICIO CORRECTO");
			VentanaPagina Vp= new VentanaPagina();
			Vp.frame.setVisible(true);
			
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
	

}
