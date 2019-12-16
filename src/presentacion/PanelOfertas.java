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

public class PanelOfertas extends JPanel {
	private JPanel pnlOfertas;
	private JPanel pnlPromociones;
	private JPanel panel_2;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JButton btnAadir;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JButton btnAadir_1;
	private JButton btnModificar_1;
	private JButton btnBorrar_1;
	private JButton btnEnviar;
	private JButton button;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelOfertas() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		pnlOfertas = new JPanel();
		add(pnlOfertas);
		GridBagLayout gbl_pnlOfertas = new GridBagLayout();
		gbl_pnlOfertas.columnWidths = new int[]{0, 70, 0, 0, 0, 0};
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
		
		btnAadir = new JButton("Añadir");
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 1;
		gbc_btnAadir.gridy = 2;
		pnlOfertas.add(btnAadir, gbc_btnAadir);
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 2;
		pnlOfertas.add(btnModificar, gbc_btnModificar);
		
		btnBorrar = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 3;
		gbc_btnBorrar.gridy = 2;
		pnlOfertas.add(btnBorrar, gbc_btnBorrar);
		
		pnlPromociones = new JPanel();
		add(pnlPromociones);
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[]{0, 0, 88, 0, 0, 0};
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
		
		btnAadir_1 = new JButton("Añadir");
		GridBagConstraints gbc_btnAadir_1 = new GridBagConstraints();
		gbc_btnAadir_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir_1.gridx = 1;
		gbc_btnAadir_1.gridy = 2;
		pnlPromociones.add(btnAadir_1, gbc_btnAadir_1);
		
		btnModificar_1 = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar_1 = new GridBagConstraints();
		gbc_btnModificar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar_1.gridx = 2;
		gbc_btnModificar_1.gridy = 2;
		pnlPromociones.add(btnModificar_1, gbc_btnModificar_1);
		
		btnBorrar_1 = new JButton("Borrar");
		GridBagConstraints gbc_btnBorrar_1 = new GridBagConstraints();
		gbc_btnBorrar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar_1.gridx = 3;
		gbc_btnBorrar_1.gridy = 2;
		pnlPromociones.add(btnBorrar_1, gbc_btnBorrar_1);
		
		panel_2 = new JPanel();
		add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{69, 0, 0, 40, 0, 0};
		gbl_panel_2.rowHeights = new int[]{31, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(PanelOfertas.class.getResource("/presentacion/user-2.png")));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		panel_2.add(button, gbc_button);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 1;
		gbc_btnEnviar.gridy = 4;
		panel_2.add(btnEnviar, gbc_btnEnviar);

	}

}
