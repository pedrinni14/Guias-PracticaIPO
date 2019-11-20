import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin {

	public  JFrame Login;
	private JTextField user;
	private JTextField pass;

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
		
		JLabel lblContrasea = new JLabel("Contraseña ");
		lblContrasea.setBounds(149, 248, 174, 16);
		Login.getContentPane().add(lblContrasea);
		
		JButton btnNewButton = new JButton("Entrtar ");
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
	
	
		btnNewButton.setBounds(409, 330, 126, 49);
		Login.getContentPane().add(btnNewButton);
	}
	
		
	
	
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		// Codigo correspondiente al de entrar mas o menos Usuario jesus o pedro y contraseña 1234a para los dos 
			// Codigo sucio hay que mejorarlo 
			DatosUsuario d =new DatosUsuario();
		if (d.Existe(user.getText(), pass.getText())==1) {
			VentanaPagina Vp= new VentanaPagina();
			Vp.frame.setVisible(true);
			
			Login.dispose();//
		}else {
			JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
		}
			
		}
	}
}
