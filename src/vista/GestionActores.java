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
import javax.swing.JCheckBox;

public class GestionActores extends JFrame {

	private JPanel contentPane;
	private JTable tablaActores;
	private JTextField txtCod_actor;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtGenero;
	private JTextField txtIdioma;
	private JTextField txtComplexion;
	private JPanel HeaderPanel;
	private JScrollPane scrollPane;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	

	/**
	 * Launch the application.
	 */

	public GestionActores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(98, 168, 800, 450);
		contentPane.add(scrollPane);

		tablaActores = new JTable();
		tablaActores.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Raul", "20", "Hombre", "Bilingue", "Normal", "1"},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Codigo Actor", "Nombre", "Edad", "Genero", "Idioma", "Complexion", "Activo"
			}
		));
		tablaActores.setRowHeight(40);
		scrollPane.setViewportView(tablaActores);

		txtCod_actor = new JTextField();
		txtCod_actor.setBounds(108, 629, 121, 30);
		contentPane.add(txtCod_actor);
		txtCod_actor.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(239, 629, 126, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setBounds(375, 629, 103, 30);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);

		txtGenero = new JTextField();
		txtGenero.setBounds(488, 629, 103, 30);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);

		txtIdioma = new JTextField();
		txtIdioma.setBounds(601, 629, 108, 30);
		contentPane.add(txtIdioma);
		txtIdioma.setColumns(10);
		
		txtComplexion = new JTextField();
		txtComplexion.setColumns(10);
		txtComplexion.setBounds(719, 629, 103, 30);
		contentPane.add(txtComplexion);

		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);

		lblTitulo = new JLabel("Actores");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(358, 11, 202, 61);
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

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(96, 690, 120, 40);
		contentPane.add(btnVolver);

		JButton btnBorrarRegistro = new JButton("Activo/Inactivo");
		btnBorrarRegistro.setBounds(436, 690, 120, 40);
		contentPane.add(btnBorrarRegistro);

		JButton btnAddRegistro = new JButton(" A\u00F1adir actor");
		btnAddRegistro.setBounds(778, 690, 120, 40);
		contentPane.add(btnAddRegistro);
	}
}
