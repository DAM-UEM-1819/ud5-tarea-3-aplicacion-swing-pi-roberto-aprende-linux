package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Label;

public class InformacionExtra extends JFrame {

	private JPanel contentPane;
	private JTable tablaInfoProfesores;
	private JPanel HeaderPanel;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	private JButton btnVolver;
	private JButton btnGuardarCambios;
	private Label lblProfesores;
	private JTable TablaInfoAlumnos;
	private Label lblAlumnos;
	private JScrollPane scrollPane_2;


	public InformacionExtra() {
		setTitle("Actores gesti\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 168, 800, 107);
		contentPane.add(scrollPane);

		tablaInfoProfesores = new JTable();
		tablaInfoProfesores.setModel(new DefaultTableModel(
				new Object[][] { { "1", "Raul", "20", "Hombre", "Bilingue", "Normal", "1" },
						{ null, null, null, null, null, null, null }, },
				new String[] { "Codigo Actor", "Nombre", "Edad", "Genero", "Idioma", "Complexion", "Activo" }));
		tablaInfoProfesores.setRowHeight(40);
		scrollPane.setViewportView(tablaInfoProfesores);
		//
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(98, 335, 800, 319);
		contentPane.add(scrollPane_2);
		
		TablaInfoAlumnos = new JTable();
		scrollPane_2.setViewportView(TablaInfoAlumnos);
		
		TablaInfoAlumnos.setModel(new DefaultTableModel(
			new Object[][] {
				{"David Mois�s Buena�o Viteri", "10"},
				{null, null},
			},
			new String[] {
				"Nombre y apellidos", "Notas"
			}
		));
		TablaInfoAlumnos.setRowHeight(40);

		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);

		lblTitulo = new JLabel("Informaci�n extra");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(259, 11, 404, 61);
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

		btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setBounds(782, 685, 120, 40);
		contentPane.add(btnGuardarCambios);
		
		lblProfesores = new Label("Profesores");
		lblProfesores.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblProfesores.setBounds(425, 128, 95, 22);
		contentPane.add(lblProfesores);
		
		lblAlumnos = new Label("Alumnos");
		lblAlumnos.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblAlumnos.setBounds(448, 307, 72, 22);
		contentPane.add(lblAlumnos);
	}
}
