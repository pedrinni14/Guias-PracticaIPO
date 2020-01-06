package presentacion;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.TextField;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelOfertas extends JPanel {
	private JPanel pnlOfertas;
	private JPanel pnlPromociones;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JButton btnBorrar_1;
	private JButton btnBorrar;
	private JTextArea textArea;
	private JButton button;
	private JButton btnGuardar;
	private JButton btnEnviar;
	private JButton btnCancelar;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelOfertas() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		pnlOfertas = new JPanel();
		add(pnlOfertas);
		GridBagLayout gbl_pnlOfertas = new GridBagLayout();
		gbl_pnlOfertas.columnWidths = new int[]{0, 79, 79, 79, 0, 0};
		gbl_pnlOfertas.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlOfertas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlOfertas.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlOfertas.setLayout(gbl_pnlOfertas);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		pnlOfertas.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		list.setBorder(new TitledBorder(null, "Ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(list);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 2;
		gbc_btnBorrar.gridy = 2;
		pnlOfertas.add(btnBorrar, gbc_btnBorrar);
		
		pnlPromociones = new JPanel();
		add(pnlPromociones);
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[]{0, 79, 79, 79, 53, 0};
		gbl_pnlPromociones.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlPromociones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPromociones.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPromociones.setLayout(gbl_pnlPromociones);
		
		scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridwidth = 3;
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 1;
		gbc_scrollPane_1.gridy = 1;
		pnlPromociones.add(scrollPane_1, gbc_scrollPane_1);
		
		list_1 = new JList();
		list_1.setBorder(new TitledBorder(null, "Promociones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane_1.setViewportView(list_1);
		
		btnBorrar_1 = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar_1 = new GridBagConstraints();
		gbc_btnBorrar_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar_1.gridx = 2;
		gbc_btnBorrar_1.gridy = 2;
		pnlPromociones.add(btnBorrar_1, gbc_btnBorrar_1);
		
		panel_2 = new JPanel();
		add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{68, 96, 90, 82, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		btnGuardar = new JButton("Modificar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		textField.setColumns(10);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(PanelOfertas.class.getResource("/presentacion/user-2.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 3;
		gbc_button.gridy = 1;
		panel_2.add(button, gbc_button);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 2;
		panel_2.add(textArea, gbc_textArea);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 3;
		panel_2.add(btnGuardar, gbc_btnGuardar);
		
		btnEnviar = new JButton("Añadir");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 2;
		gbc_btnEnviar.gridy = 3;
		panel_2.add(btnEnviar, gbc_btnEnviar);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 3;
		panel_2.add(btnCancelar, gbc_btnCancelar);

	}

}
