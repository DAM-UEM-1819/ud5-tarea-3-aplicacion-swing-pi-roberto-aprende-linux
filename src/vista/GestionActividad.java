package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GestionActividad extends JFrame {

	private JPanel contentPane;
	private JTable tablaActividad;
	private JTextField txtNombre;
	private JTextField txtTipo_actividad;
	private JTextField txtDocumentacion_tecnica;
	private JTextField txtHorasActividad;
	private JTextField txtCod_asignatura;
	private JTextField txtSimulador;
	private JPanel HeaderPanel;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	private JButton btnVolver;
	private JButton btnBorrarActividad;
	private JButton btnAddActividad;
	private JButton btnModificarActividad;


	 
	public GestionActividad() {
		setTitle("Actividad gesti\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 168, 800, 450);
		contentPane.add(scrollPane);

		tablaActividad = new JTable();
		tablaActividad.setModel(new DefaultTableModel(
			new Object[][] {
				{"Seg paciente 1", "Taller de habilidades", "2", "2","01411", "ISTAN"},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Tipo de actividad", "Ficha tecnica", "Horas de actividad", "Codigo de asignatura", "Simulador"
			}
		));
		tablaActividad.setRowHeight(40);
		scrollPane.setViewportView(tablaActividad);

		txtNombre = new JTextField();
		txtNombre.setBounds(108, 629, 128, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtTipo_actividad = new JTextField();
		txtTipo_actividad.setBounds(246, 629, 126, 30);
		contentPane.add(txtTipo_actividad);
		txtTipo_actividad.setColumns(10);

		txtDocumentacion_tecnica = new JTextField();
		txtDocumentacion_tecnica.setBounds(382, 629, 128, 30);
		contentPane.add(txtDocumentacion_tecnica);
		txtDocumentacion_tecnica.setColumns(10);

		txtHorasActividad = new JTextField();
		txtHorasActividad.setBounds(520, 629, 114, 30);
		contentPane.add(txtHorasActividad);
		txtHorasActividad.setColumns(10);

		txtCod_asignatura = new JTextField();
		txtCod_asignatura.setBounds(644, 629, 128, 30);
		contentPane.add(txtCod_asignatura);
		txtCod_asignatura.setColumns(10);

		txtSimulador = new JTextField();
		txtSimulador.setColumns(10);
		txtSimulador.setBounds(780, 629, 107, 30);
		contentPane.add(txtSimulador);
		


		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);

		lblTitulo = new JLabel("Actividad");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(358, 11, 266, 61);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		HeaderPanel.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		lblTitulo.setVerticalAlignment(JLabel.CENTER);

		lblUemLogo = new JLabel("Aqui Iria el logo");
		lblUemLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUemLogo.setBounds(0, 0, 240, 100);
		HeaderPanel.add(lblUemLogo);

		lblPerfil = new JLabel("Aqui Iria el logo");
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setBounds(760, 0, 224, 100);
		HeaderPanel.add(lblPerfil);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(100, 685, 120, 40);
		contentPane.add(btnVolver);

		btnModificarActividad = new JButton("Modificar actividad");
		btnModificarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(rootPane, "¿Desea modificar el profesor seleccionado?" );
			}
		});
		btnModificarActividad.setBounds(325, 685, 128, 40);
		contentPane.add(btnModificarActividad);

		btnBorrarActividad = new JButton("Borrar actividad");
		btnBorrarActividad.setBounds(575, 685, 120, 40);
		contentPane.add(btnBorrarActividad);

		btnAddActividad = new JButton(" A\u00F1adir actividad");
		btnAddActividad.setBounds(774, 685, 128, 40);
		contentPane.add(btnAddActividad);
		
	
	}

}
