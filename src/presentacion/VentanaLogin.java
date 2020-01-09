package presentacion;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;

import dominio.DatosUsuario;
import dominio.Usuario;

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
	private JLabel lbliniciarsesion;
	private JComboBox comboBox;
	public String UsuarioConectado;
	private JLabel lblUsuario_1;
	private JLabel lblContraseña_2;

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
		Login.setTitle(MessagesApp.getString("VentanaLogin.Login.title")); //$NON-NLS-1$
		Login.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Login.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Login.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/presentacion/route.png"))); //$NON-NLS-1$
		Login.setBounds(100, 100, 600, 400);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{131, 59, 94, 64, 86, 74, 0, 0};
		gridBagLayout.rowHeights = new int[]{25, 81, 30, 39, 30, 59, 70, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Login.getContentPane().setLayout(gridBagLayout);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString()=="ENGLISH") { //$NON-NLS-1$
					MessagesApp.setIdioma("ingles"); //$NON-NLS-1$
					textoIngles();
				}else {
					MessagesApp.setIdioma("español");
					textoIngles();
				}
					
			}
			
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ESPAÑOL", "ENGLISH"})); //$NON-NLS-1$ //$NON-NLS-2$
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 0;
		Login.getContentPane().add(comboBox, gbc_comboBox);
		
		
		lbliniciarsesion = new JLabel();
		lbliniciarsesion.setText(MessagesApp.getString("VentanaLogin.lbliniciarsesion.text")); //$NON-NLS-1$
		lbliniciarsesion.setFont(new Font("Tahoma", Font.BOLD, 20)); //$NON-NLS-1$
		GridBagConstraints gbc_lbliniciarsesion = new GridBagConstraints();
		gbc_lbliniciarsesion.anchor = GridBagConstraints.NORTH;
		gbc_lbliniciarsesion.gridwidth = 2;
		gbc_lbliniciarsesion.insets = new Insets(0, 0, 5, 5);
		gbc_lbliniciarsesion.gridx = 0;
		gbc_lbliniciarsesion.gridy = 1;
		Login.getContentPane().add(lbliniciarsesion, gbc_lbliniciarsesion);
		
		lblUsuario_1 = new JLabel();
		lblUsuario_1.setText(MessagesApp.getString("VentanaLogin.lblUsuario_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 0;
		gbc_lblUsuario_1.gridy = 2;
		Login.getContentPane().add(lblUsuario_1, gbc_lblUsuario_1);
		
		user = new JTextField();
		user.setToolTipText(MessagesApp.getString("VentanaLogin.user.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_user = new GridBagConstraints();
		gbc_user.gridwidth = 2;
		gbc_user.fill = GridBagConstraints.BOTH;
		gbc_user.insets = new Insets(0, 0, 5, 5);
		gbc_user.gridx = 1;
		gbc_user.gridy = 2;
		Login.getContentPane().add(user, gbc_user);
		user.setColumns(10);
		
		lblContraseña_2 = new JLabel();
		lblContraseña_2.setText(MessagesApp.getString("VentanaLogin.lblContraseña_1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblContraseña_2 = new GridBagConstraints();
		gbc_lblContraseña_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña_2.gridx = 0;
		gbc_lblContraseña_2.gridy = 4;
		Login.getContentPane().add(lblContraseña_2, gbc_lblContraseña_2);
		
		pass = new JPasswordField();
		pass.setToolTipText(MessagesApp.getString("VentanaLogin.pass.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_pass = new GridBagConstraints();
		gbc_pass.gridwidth = 2;
		gbc_pass.fill = GridBagConstraints.BOTH;
		gbc_pass.insets = new Insets(0, 0, 5, 5);
		gbc_pass.gridx = 1;
		gbc_pass.gridy = 4;
		Login.getContentPane().add(pass, gbc_pass);
		
		btnNewButton = new JButton();
		btnNewButton.setText(MessagesApp.getString("VentanaLogin.btnNewButton.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		Login.getContentPane().add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(new BtnNewButtonActionListener());
		
		btnLimpiar = new JButton();
		btnLimpiar.setText(MessagesApp.getString("VentanaLogin.btnLimpiar.text")); //$NON-NLS-1$
		GridBagConstraints gbc_btnLimpiar = new GridBagConstraints();
		gbc_btnLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_btnLimpiar.gridx = 2;
		gbc_btnLimpiar.gridy = 5;
		Login.getContentPane().add(btnLimpiar, gbc_btnLimpiar);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText(""); //$NON-NLS-1$
				pass.setText(""); //$NON-NLS-1$
			}
		});
		
		menuBar = new JMenuBar();
		Login.setJMenuBar(menuBar);
		
		mnOpciones = new JMenu();
		mnOpciones.setText(MessagesApp.getString("VentanaLogin.mnOpciones.text")); //$NON-NLS-1$
		mnOpciones.setMnemonic('O');
		menuBar.add(mnOpciones);
		
		mnTamañoFuente = new JMenu();
		mnTamañoFuente.setText(MessagesApp.getString("VentanaLogin.mnTamañoFuente.text")); //$NON-NLS-1$
		mnOpciones.add(mnTamañoFuente);
		
		rdbtnmntmGrande = new JRadioButtonMenuItem();
		rdbtnmntmGrande.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmGrande.text")); //$NON-NLS-1$
		rdbtnmntmGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tamanio=16;
			lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
			lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
			btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
			btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
			lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
			lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
			btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
			btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
		buttonGroup.add(rdbtnmntmGrande);
		mnTamañoFuente.add(rdbtnmntmGrande);
		
		rdbtnmntmMediana = new JRadioButtonMenuItem();
		rdbtnmntmMediana.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmMediana.text")); //$NON-NLS-1$
		rdbtnmntmMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio=12;
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
				lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
		buttonGroup.add(rdbtnmntmMediana);
		mnTamañoFuente.add(rdbtnmntmMediana);
		
		rdbtnmntmPequeña = new JRadioButtonMenuItem();
		rdbtnmntmPequeña.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmPequeña.text")); //$NON-NLS-1$
		rdbtnmntmPequeña.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamanio=10;
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
				lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
		buttonGroup.add(rdbtnmntmPequeña);
		mnTamañoFuente.add(rdbtnmntmPequeña);
		
		mnFuente = new JMenu();
		mnFuente.setText(MessagesApp.getString("VentanaLogin.mnFuente.text")); //$NON-NLS-1$
		mnOpciones.add(mnFuente);
		
		rdbtnmntmArial = new JRadioButtonMenuItem("Arial"); //$NON-NLS-1$
		rdbtnmntmArial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			letra="Arial"; //$NON-NLS-1$
			lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
			lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
			btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
			btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
			lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
			lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
			btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
			btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
			lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmArial);
		mnFuente.add(rdbtnmntmArial);
		
		rdbtnmntmCalibri = new JRadioButtonMenuItem("Calibri"); //$NON-NLS-1$
		rdbtnmntmCalibri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letra="Calibri"; //$NON-NLS-1$
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
				lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
		buttonGroup_1.add(rdbtnmntmCalibri);
		mnFuente.add(rdbtnmntmCalibri);
		
		rdbtnmntmTimesNewRoman = new JRadioButtonMenuItem("Times New Roman"); //$NON-NLS-1$
		rdbtnmntmTimesNewRoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letra="Times New Roman"; //$NON-NLS-1$
				lblUsuario_1.setFont(new Font(null, Font.PLAIN, tamanio));
				lblContraseña_2.setFont(new Font(null, Font.PLAIN,tamanio ));
				btnNewButton.setFont(new Font(null, Font.PLAIN, tamanio ));
				btnLimpiar.setFont(new Font(null, Font.PLAIN, tamanio ));
				lblUsuario_1.setFont(new Font(letra, Font.PLAIN, lblUsuario_1.getFont().getSize()));
				lblContraseña_2.setFont(new Font(letra, Font.PLAIN, lblContraseña_2.getFont().getSize()));
				btnNewButton.setFont(new Font(letra, Font.PLAIN, btnNewButton.getFont().getSize()));
				btnLimpiar.setFont(new Font(letra, Font.PLAIN, btnLimpiar.getFont().getSize()));
				lbliniciarsesion.setFont(new Font(letra, Font.PLAIN, lbliniciarsesion.getFont().getSize()));
			}
		});
	
		buttonGroup_1.add(rdbtnmntmTimesNewRoman);
		mnFuente.add(rdbtnmntmTimesNewRoman);
		
		mnAyuda = new JMenu();
		mnAyuda.setText(MessagesApp.getString("VentanaLogin.mnAyuda.text")); //$NON-NLS-1$
		mnAyuda.setMnemonic('A');
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem();
		mntmAcercaDe.setText(MessagesApp.getString("VentanaLogin.mntmAcercaDe.text")); //$NON-NLS-1$
		mnAyuda.add(mntmAcercaDe);
	}
	

	private void textoIngles() {
		lbliniciarsesion.setText(MessagesApp.getString("VentanaLogin.lbliniciarsesion.text")); //$NON-NLS-1$
		lblUsuario_1.setText(MessagesApp.getString("VentanaLogin.lblUsuario_1.text")); //$NON-NLS-1$
		user.setToolTipText(MessagesApp.getString("VentanaLogin.user.toolTipText")); //$NON-NLS-1$
		lblContraseña_2.setText(MessagesApp.getString("VentanaLogin.lblContraseña_1.text")); //$NON-NLS-1$
		pass.setToolTipText(MessagesApp.getString("VentanaLogin.pass.toolTipText")); //$NON-NLS-1$
		btnNewButton.setText(MessagesApp.getString("VentanaLogin.btnNewButton.text")); //$NON-NLS-1$
		btnLimpiar.setText(MessagesApp.getString("VentanaLogin.btnLimpiar.text")); //$NON-NLS-1$
		mnOpciones.setText(MessagesApp.getString("VentanaLogin.mnOpciones.text")); //$NON-NLS-1$
		mnTamañoFuente.setText(MessagesApp.getString("VentanaLogin.mnTamañoFuente.text")); //$NON-NLS-1$
		rdbtnmntmGrande.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmGrande.text")); //$NON-NLS-1$
		rdbtnmntmMediana.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmMediana.text")); //$NON-NLS-1$
		rdbtnmntmPequeña.setText(MessagesApp.getString("VentanaLogin.rdbtnmntmPequeña.text")); //$NON-NLS-1$
		mnFuente.setText(MessagesApp.getString("VentanaLogin.mnFuente.text")); //$NON-NLS-1$
		mnAyuda.setText(MessagesApp.getString("VentanaLogin.mnAyuda.text")); //$NON-NLS-1$
		mntmAcercaDe.setText(MessagesApp.getString("VentanaLogin.mntmAcercaDe.text")); //$NON-NLS-1$


		
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	
			DatosUsuario d =new DatosUsuario(); 
		if (d.Existe(user.getText(), pass.getText())==1) {
			String nombre=user.getText();
			
			d.usuario=nombre;
			Usuario usuario=d.UsuarioConectado(nombre);
			
			////////////////////////////
			Object[] botonesOptionPane= {MessagesApp.getString("VentanaLogin.btnacceptar")};
			
			//JOptionPane.showMessageDialog(null, MessagesApp.getString("VentanaLogin.0")); //$NON-NLS-1$
			JOptionPane.showOptionDialog(Login, MessagesApp.getString("VentanaLogin.0"),
					MessagesApp.getString("VentanaLogin.0"), 
					JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE, null,botonesOptionPane, 0);
			
			VentanaPagina Vp= new VentanaPagina();
			Vp.SetNombre(usuario);
			Vp.SetFoto(usuario);
			try {
				Vp.SetUltimaConexion("09-08-2019 20:30:10"); //$NON-NLS-1$
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			Vp.frmAplicacion.setVisible(true);
			
			
			Login.dispose();//
		}else {
			if (d.Existe(user.getText(), pass.getText())==-1) {
				Object[] botonesOptionPane= {MessagesApp.getString("VentanaLogin.btnacceptar")};
			//JOptionPane.showMessageDialog(null, MessagesApp.getString("VentanaLogin.1")); //$NON-NLS-1$
				JOptionPane.showOptionDialog(Login, MessagesApp.getString("VentanaLogin.1"),
						MessagesApp.getString("VentanaLogin.1"), 
						JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE, null,botonesOptionPane, 0);
			}else {
				Object[] botonesOptionPane= {MessagesApp.getString("VentanaLogin.btnacceptar")};
				//JOptionPane.showMessageDialog(null, MessagesApp.getString("VentanaLogin.17")); //$NON-NLS-1$
				JOptionPane.showOptionDialog(Login, MessagesApp.getString("VentanaLogin.17"),
						MessagesApp.getString("VentanaLogin.17"), 
						JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE, null,botonesOptionPane, 0);
			}
		}
			
		}
	}
	
	
	public static JFrame getFrame() {
		return Login;
	}
}
