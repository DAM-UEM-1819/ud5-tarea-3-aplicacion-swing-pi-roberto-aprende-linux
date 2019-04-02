package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionRegistros extends JFrame {

	private JPanel contentPane;
	private JTable tablaRegistros;
	private JTextField txtCod_registro;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JTextField txtHorasProfesor;
	private JTextField txtActividadNombre;
	private JPanel HeaderPanel;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionRegistros frame = new GestionRegistros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionRegistros() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\usuario\\git\\ud5-tarea-3-aplicacion-swing-pi-roberto-aprende-linux\\img\\UEMLogo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(98 , 168, 800, 450);
		contentPane.add(scrollPane);
		
		tablaRegistros = new JTable();
		tablaRegistros.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Codigo Registro", "Fecha", "Hora", "Hora Profesor", "Actividad nombre"
			}
		));
		scrollPane.setViewportView(tablaRegistros);
		
		txtCod_registro = new JTextField();
		txtCod_registro.setBounds(108, 629, 155, 30);
		contentPane.add(txtCod_registro);
		txtCod_registro.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(273, 629, 164, 30);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setBounds(447, 629, 146, 30);
		contentPane.add(txtHora);
		txtHora.setColumns(10);
		
		txtHorasProfesor = new JTextField();
		txtHorasProfesor.setBounds(603, 629, 155, 30);
		contentPane.add(txtHorasProfesor);
		txtHorasProfesor.setColumns(10);
		
		txtActividadNombre = new JTextField();
		txtActividadNombre.setBounds(768, 629, 121, 30);
		contentPane.add(txtActividadNombre);
		txtActividadNombre.setColumns(10);
		
		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);
		
		lblTitulo = new JLabel("Registros");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(358, 11, 202, 61);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		HeaderPanel.add(lblTitulo);
		 lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		 lblTitulo.setVerticalAlignment(JLabel.CENTER);
		 
		 JButton btnVolver = new JButton("Volver");
		 btnVolver.setBounds(96, 690, 120, 40);
		 contentPane.add(btnVolver);
		 
		 JButton btnBorrarRegistro = new JButton("Borrar Registro");
		 btnBorrarRegistro.setBounds(436, 690, 120, 40);
		 contentPane.add(btnBorrarRegistro);
		 
		 JButton btnAddRegistro = new JButton("A\u00F1adir Registro");
	
		 btnAddRegistro.setBounds(778, 690, 120, 40);
		 contentPane.add(btnAddRegistro);
	}
}
