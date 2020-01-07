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
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Image;
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
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelGrupos extends JPanel {
	private static ArrayList<Grupos> listaGrupos = Grupos.generarGrupos();
	private JLabel lblNewLabel_1;
	private JFrame frame;
	private JToolBar toolBar;
	private JButton btnAadirFila;
	private JButton btnEliminarFila;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea taFilaSeleccionada;
	private JScrollPane scrollPaneTabla;
	private JTable mitabla;
	private JButton btnfoto;
	private ImageIcon imagen;

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
				Object[] nuevaFila = {listaGrupos.size()+1, "...", "...", 0, 0, "....", "Español" };
				listaGrupos.add(new Grupos( listaGrupos.size()+1, "...", "...", 0, 0, "....", "Español",PanelGrupos.class.getResource("/presentacion/loading.png")));
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
		
		btnfoto = new JButton("");
		btnfoto.setIcon(new ImageIcon(PanelGrupos.class.getResource("/presentacion/loading.png")));
		btnfoto.addActionListener(new btnFotoActionListener());
		scrollPane.setViewportView(btnfoto);
		
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
		
		Object[] fila1 = { listaGrupos.get(0).getID(),listaGrupos.get(0).getNombre(),listaGrupos.get(0).getDNI(),listaGrupos.get(0).getGrupo(),listaGrupos.get(0).getTamaño(),listaGrupos.get(0).getRuta(),listaGrupos.get(0).getIdioma()};
		modeloTabla.aniadeFila(fila1);
		Object[] fila2 = {listaGrupos.get(1).getID(),listaGrupos.get(1).getNombre(),listaGrupos.get(1).getDNI(),listaGrupos.get(1).getGrupo(),listaGrupos.get(1).getTamaño(),listaGrupos.get(1).getRuta(),listaGrupos.get(1).getIdioma()};
		modeloTabla.aniadeFila(fila2);
		Object[] fila3 = { listaGrupos.get(2).getID(),listaGrupos.get(2).getNombre(),listaGrupos.get(2).getDNI(),listaGrupos.get(2).getGrupo(),listaGrupos.get(2).getTamaño(),listaGrupos.get(2).getRuta(),listaGrupos.get(2).getIdioma() };
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
					
					btnfoto.setIcon(new ImageIcon( listaGrupos.get(0).getImagen()));
					break;
				case 1:
					
					btnfoto.setIcon(new ImageIcon( listaGrupos.get(1).getImagen()));
					break;
				case 2:
					
					btnfoto.setIcon(new ImageIcon( listaGrupos.get(2).getImagen()));
					break;
				
				default:
					btnfoto.setIcon(new ImageIcon(listaGrupos.get(n).getImagen()));
					break;
					
				}
			}
		});


	}
	class btnFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(frame);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
			File file = fcAbrir.getSelectedFile();
			imagen = new ImageIcon(file.getAbsolutePath());
			btnfoto.setIcon(imagen);
			}

		}
	}

}
