package presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

public class PanelGrupos extends JPanel {
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelGrupos() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "Alvaro Mostazo", "04895678D", new Integer(1), new Integer(15), "Ruta por Toledo", "Espa\u00F1ol"},
				{new Integer(2), "David Gomez", "05789678C", new Integer(3), new Integer(20), "Ruta por Guadalajara", "Espa\u00F1ol"},
				{new Integer(3), "Mathew Weasley", "72525889F", new Integer(5), new Integer(10), "Ruta por Toledo", "Ingl\u00E9s"},
				{new Integer(4), "Pedro de la Fuente", "04586667L", new Integer(2), new Integer(8), "Ruta por Ciudad Real", "Espa\u00F1ol"},
				{new Integer(5), "Fatima Herrero", "04235698K", new Integer(4), new Integer(11), "Ruta por Guadalajara", "Espa\u00F1ol"},
				{new Integer(6), "Jesus Herraez", "03854499P", new Integer(6), new Integer(14), "Ruta por Cuenca", "Espa\u00F1ol"},
				{new Integer(7), "Jorge del Cerro", "05896586J", new Integer(8), new Integer(13), "Ruta por Toledo", "Espa\u00F1ol"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Id_Grupo", "Representante", "DNI Representante", "Grupo", "Numero de Personas", "Ruta Seleccionada", "Idioma del Grupo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

	}

}
