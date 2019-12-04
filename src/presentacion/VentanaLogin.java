package presentacion;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaLogin {

	public  JFrame Login;
	private JTextField user;
	private JTextField pass;
	private JMenuBar menuBar;
	private JMenu mnOpciones;
	private JMenu mnAyuda;
	private JMenuItem mntmLetra;
	private JMenuItem mntmAcercaDe;
	private JPanel pnlBotones;
	private JButton btnLimpiar;
	private JMenu mnTamañoFuente;
	private JRadioButtonMenuItem rdbtnmntmGrande;
	private JRadioButtonMenuItem rdbtnmntmMediana;
	private JRadioButtonMenuItem rdbtnmntmPequeña;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JLabel lblUsuario = new JLabel("USUARIO ");
		lblUsuario.setBounds(149, 177, 174, 16);
		Login.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setBounds(149, 248, 174, 16);
		Login.getContentPane().add(lblContrasea);
		
		pnlBotones = new JPanel();
		pnlBotones.setBounds(0, 417, 986, 102);
		Login.getContentPane().add(pnlBotones);
		
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
		
		mntmLetra = new JMenuItem("Letra");
		mnOpciones.add(mntmLetra);
		
		mnTamañoFuente = new JMenu("Tamaño de Fuente");
		mnOpciones.add(mnTamañoFuente);
		
		rdbtnmntmGrande = new JRadioButtonMenuItem("Grande");
		buttonGroup.add(rdbtnmntmGrande);
		mnTamañoFuente.add(rdbtnmntmGrande);
		
		rdbtnmntmMediana = new JRadioButtonMenuItem("Mediana");
		buttonGroup.add(rdbtnmntmMediana);
		mnTamañoFuente.add(rdbtnmntmMediana);
		
		rdbtnmntmPequeña = new JRadioButtonMenuItem("Pequeña");
		buttonGroup.add(rdbtnmntmPequeña);
		mnTamañoFuente.add(rdbtnmntmPequeña);
		
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
