package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;

public class PanelCircuitos extends JPanel {
	private JPanel pnlDatosCircuito;
	private JPanel pnlListaPedidos;
	private JScrollPane scrollPane;
	private JButton btnAadir;
	private JButton btnModificar;
	private JList list;
	private JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public PanelCircuitos() {
		setMinimumSize(new Dimension(1366, 768));
		setLayout(new BorderLayout(0, 0));
		
		pnlDatosCircuito = new JPanel();
		add(pnlDatosCircuito, BorderLayout.EAST);
		GridBagLayout gbl_pnlDatosCircuito = new GridBagLayout();
		gbl_pnlDatosCircuito.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlDatosCircuito.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlDatosCircuito.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDatosCircuito.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDatosCircuito.setLayout(gbl_pnlDatosCircuito);
		
		pnlListaPedidos = new JPanel();
		add(pnlListaPedidos, BorderLayout.WEST);
		GridBagLayout gbl_pnlListaPedidos = new GridBagLayout();
		gbl_pnlListaPedidos.columnWidths = new int[]{0, 0, 90, 150, 104, 0, 0};
		gbl_pnlListaPedidos.rowHeights = new int[]{0, 195, 0, 0, 0};
		gbl_pnlListaPedidos.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlListaPedidos.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlListaPedidos.setLayout(gbl_pnlListaPedidos);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 1;
		pnlListaPedidos.add(scrollPane, gbc_scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnAadir = new JButton("Añadir");
		btnAadir.setMinimumSize(new Dimension(75, 23));
		btnAadir.setMaximumSize(new Dimension(75, 23));
		btnAadir.setPreferredSize(new Dimension(75, 23));
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.gridx = 2;
		gbc_btnAadir.gridy = 2;
		pnlListaPedidos.add(btnAadir, gbc_btnAadir);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 2;
		pnlListaPedidos.add(btnEliminar, gbc_btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setMinimumSize(new Dimension(69, 23));
		btnModificar.setMaximumSize(new Dimension(69, 23));
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 4;
		gbc_btnModificar.gridy = 2;
		pnlListaPedidos.add(btnModificar, gbc_btnModificar);

	}

}
