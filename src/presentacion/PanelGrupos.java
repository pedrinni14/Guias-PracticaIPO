package presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelGrupos extends JPanel {
	private JToolBar toolBar;
	private JButton btnAadirFila;
	private JButton btnEliminarFila;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea taFilaSeleccionada;
	private JLabel lblfoto;
	private JScrollPane scrollPaneTabla;
	private JTable mitabla;

	/**
	 * Create the panel.
	 */
	public PanelGrupos() {
		setLayout(new BorderLayout(0, 0));
		
		toolBar = new JToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		btnAadirFila = new JButton("Añadir Grupo");
		btnAadirFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiModeloTabla modeloTabla = (MiModeloTabla) mitabla.getModel();
				Object[] nuevaFila = {null, "...", "...", null, null, "....", "..." };
				modeloTabla.aniadeFila(nuevaFila);
				modeloTabla.fireTableDataChanged();
			}
		});
		btnAadirFila.setIcon(new ImageIcon(PanelGrupos.class.getResource("/presentacion/ic_menu_btn_add.png")));
		toolBar.add(btnAadirFila);
		
		btnEliminarFila = new JButton("Eliminar Grupo");
		btnEliminarFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiModeloTabla modeloTabla = (MiModeloTabla) mitabla.getModel();
				int n = mitabla.getSelectedRow();
				if (n != -1)
					modeloTabla.eliminaFila(mitabla.getSelectedRow());
				modeloTabla.fireTableDataChanged();
				taFilaSeleccionada.setText("");
			}
			
		});
		btnEliminarFila.setIcon(new ImageIcon(PanelGrupos.class.getResource("/presentacion/ic_menu_delete.png")));
		toolBar.add(btnEliminarFila);
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(50, 200));
		panel.add(scrollPane);
		
		lblfoto = new JLabel("");
		scrollPane.setViewportView(lblfoto);
		
		taFilaSeleccionada = new JTextArea();
		taFilaSeleccionada.setEditable(false);
		panel.add(taFilaSeleccionada);
		
		scrollPaneTabla = new JScrollPane();
		add(scrollPaneTabla, BorderLayout.CENTER);
		
		mitabla = new JTable();
		mitabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		MiModeloTabla modeloTabla= new MiModeloTabla();
		mitabla.setModel(modeloTabla);
		/*mitabla.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "Pedro Gomez", "05697842K", 2, 15, "Ruta por Toledo", "Español"},
				{2, "Mathew Edwards","0455896L", 1, 8, "Ruta por Cuenca", "English"},
				{3, "Pablo Gonzalez", "04894568S", 3, 12, "Ruta por Ciudad Real", "Español"},
			},
			new String[] {
				"Id_Grupo", "Representante Grupo", "DNI", "Grupo", "Numero de Participantes", "Ruta Seleccionada", "Idioma"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});*/
		Object[] fila1 = { 1, "Pedro Gomez", "05697842K", 2, 15, "Ruta por Toledo", "Español"};
		modeloTabla.aniadeFila(fila1);
		Object[] fila2 = {2, "Mathew Edwards","04558976L", 1, 8, "Ruta por Cuenca", "English"};
		modeloTabla.aniadeFila(fila2);
		Object[] fila3 = { 3, "Pablo Gonzalez", "04894568S", 3, 12, "Ruta por Ciudad Real", "Español" };
		modeloTabla.aniadeFila(fila3);
		scrollPaneTabla.setViewportView(mitabla);
		
		TableColumn columnaIdioma = mitabla.getColumnModel().getColumn(6);
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Español");
		comboBox.addItem("English");
	
		columnaIdioma.setCellEditor(new DefaultCellEditor(comboBox));
		mitabla.setRowHeight(20);
		ListSelectionModel rowSM = mitabla.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					MiModeloTabla modeloTabla = (MiModeloTabla) mitabla.getModel();
					int n = mitabla.getSelectedRow();
					if (n != -1) {
						String contenido = "Nombre del Representante del Grupo :" + modeloTabla.getValueAt(n, 1) + "\n" + "DNI del Representante: "
								+ modeloTabla.getValueAt(n, 2) + "\n";
						contenido += "Idioma que habla el representante :" + modeloTabla.getValueAt(n, 6) + "\n";
						taFilaSeleccionada.setText(contenido);
						PonerImagen(n);
					}
				}
			}

			private void PonerImagen(int n) {
				switch (n) {
				case 0:
					
					lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/GrupoToledo.jpg")));
					break;
				case 1:
					
					lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/GrupoIngles.jpg")));
					break;
				case 2:
					
					lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/GrupoCuenca.jpg")));
					break;
				case 3:
			
					lblfoto.setIcon(new ImageIcon(PanelHistorial.class.getResource("/presentacion/Guadalajara.jpg")));
					break;
				default:
					break;
					
				}
			}
		});

	}

}
