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

public class GestionAcad extends JFrame {

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
	private JButton btnVolver;
	private JButton btnAI_actor;
	private JButton btnAddActor;
	private JButton btnModificarActor;



	/**
	 * Create the frame.
	 */
	public GestionAcad() {
		setTitle("Año academico gesti\u00F3n");
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
				new Object[][] { { "19/19","00/00/0000" , "00/00/0000" },
						{ null, null, null, null, null, null, null }, },
				new String[] { "Año academico" , "semestre1" , "semestre2" }));
		tablaActores.setRowHeight(40);
		scrollPane.setViewportView(tablaActores);

		txtCod_actor = new JTextField();
		txtCod_actor.setBounds(108, 629, 103, 30);
		contentPane.add(txtCod_actor);
		txtCod_actor.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setBounds(221, 629, 103, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtEdad = new JTextField();
		txtEdad.setBounds(334, 629, 121, 30);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);

		txtGenero = new JTextField();
		txtGenero.setBounds(465, 629, 103, 30);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);

		txtIdioma = new JTextField();
		txtIdioma.setBounds(578, 629, 103, 30);
		contentPane.add(txtIdioma);
		txtIdioma.setColumns(10);

		txtComplexion = new JTextField();
		txtComplexion.setColumns(10);
		txtComplexion.setBounds(691, 629, 103, 30);
		contentPane.add(txtComplexion);

		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);

		lblTitulo = new JLabel("Año academico");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(322, 11, 333, 61);
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

		btnModificarActor = new JButton("Modificar actor");
		btnModificarActor.setBounds(325, 685, 120, 40);
		contentPane.add(btnModificarActor);

		btnAI_actor = new JButton("Activo/Inactivo");
		btnAI_actor.setBounds(575, 685, 120, 40);
		contentPane.add(btnAI_actor);

		btnAddActor = new JButton(" A\u00F1adir actor");
		btnAddActor.setBounds(782, 685, 120, 40);
		contentPane.add(btnAddActor);
	}

}
