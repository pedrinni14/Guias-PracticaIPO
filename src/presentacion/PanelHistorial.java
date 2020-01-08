package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PanelHistorial extends JPanel {
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTextArea textArea_1;
	private JTable table;
	private JLabel lblfoto;

	/**
	 * Create the panel.
	 */
	public PanelHistorial() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
ListSelectionModel rowSM = table.getSelectionModel();
		
		rowSM.addListSelectionListener(new ListSelectionListener() {
		public void valueChanged(ListSelectionEvent e) {
		ListSelectionModel lsm = (ListSelectionModel) e.getSource();
		if (!lsm.isSelectionEmpty()) {
		int n= table.getSelectedRow();
		if (n != -1) {
			switch (n) {
			case 0:
				textArea_1.setText("Ruta por Ciudad Real en la que recorreremos los punto de interes mas importantes como sus bares y restaurantes de tapas");
				lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/ciudad-real.jpg")));
				break;
			case 1:
				textArea_1.setText("Ruta por Toledo recorreremos el casco historico y visitaremos algunos lugares emblematicos, como el Alcazar o San Juan de los Reyes");
				lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/toledo.jpg")));
				break;
			case 2:
				textArea_1.setText("Ruta por Cuenca veremos las casas colgantes y donde comeremos en los mejores restaurantes");
				lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/cuenca.jpg")));
				break;
			case 3:
				textArea_1.setText("Ruta por Guadalajara en la que disfrutaremos de la ciudad y sus gentes, asi como de sus restaurantes y tiendas");
				lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/Guadalajara.jpg")));
				break;
				
			}
		}
		
		
		}
		}
		});
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			ListSelectionModel lsm = (ListSelectionModel) e.getSource();
			if (!lsm.isSelectionEmpty()) {
			
			}
			}
			});

		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Ruta por Ciudad Real", "21 de Septiembre de 2019", "23 de Septiembre de 2019",true},
				{"Ruta por Toledo", "25 de Septiembre de 2019", "28 de Septiembre de 2019", true},
				{"Ruta por Cuenca","1 de Noviembre de 2019", "5 de Noviembre de 2019", true},
				{"Ruta por Guadalajara", "15 de Diciembre de 2019", "20 de Diciembre de 2019", null},
			},
			new String[] {
				"Nombre", "Inicio", "Fin", "Finalizada"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{101, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.insets = new Insets(0, 0, 0, 5);
		gbc_textArea_1.fill = GridBagConstraints.BOTH;
		gbc_textArea_1.gridx = 0;
		gbc_textArea_1.gridy = 0;
		panel.add(textArea_1, gbc_textArea_1);
		
		lblfoto = new JLabel("");
		GridBagConstraints gbc_lblfoto = new GridBagConstraints();
		gbc_lblfoto.gridx = 1;
		gbc_lblfoto.gridy = 0;
		panel.add(lblfoto, gbc_lblfoto);

	}

}
