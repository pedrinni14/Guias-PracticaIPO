package presentacion;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAñdirGuias extends JPanel {
	private JButton btnRegistrar;
	private JButton btnCancelar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Create the panel.
	 */
	public PanelAñdirGuias() {
		setLayout(null);
		
		btnRegistrar = new JButton("Registrar ");
		btnRegistrar.setBounds(172, 248, 89, 23);
		add(btnRegistrar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(301, 248, 89, 23);
		add(btnCancelar);
		
		textField = new JTextField();
		textField.setBounds(172, 80, 218, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 109, 218, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(172, 140, 218, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Varón ", "Mujer "}));
		comboBox.setBounds(172, 171, 218, 20);
		add(comboBox);
		
		lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setBounds(79, 83, 81, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(79, 112, 46, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setBounds(79, 140, 46, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(81, 174, 46, 14);
		add(lblNewLabel_3);

	}
}
