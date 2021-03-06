package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private Controlador controlador;
	private JPanel contentPane;
	private JTable tablaRegistros;
	private JButton btnSalir;
	private JButton btnInfoExtra;
	private JPanel Header;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	private JScrollPane scrollPaneRegistros;
	private JLabel lblNumAlumnos;
	private JPanel infoExtra;
	private JLabel lblSimulador;
	private JLabel lblActor;
	private JCheckBox chckbxActor;
	private JLabel lblNombreSimulador;
	private JLabel lblNuberAlumnos;
	private JButton btnGestionar;
	private JButton btnInformes;
	private JLabel lblOcupaciones;
	private JLabel lblNewLabel;
	private JTextField txtCalendario;
	// private JDateChooser calendario;

	public Home() {
		setTitle("Hospital simulado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPaneRegistros = new JScrollPane();
		scrollPaneRegistros.setBounds(35, 144, 700, 500);
		contentPane.add(scrollPaneRegistros);

		tablaRegistros = new JTable();
		tablaRegistros.setModel(
				new DefaultTableModel(
						new Object[][] {
								{ "Consulta 2", "16:30", "18:30", "Consulta", "Enfermeria", "ENM11",
										"Matilda P\u00E9rez" },
								{ "Consulta1", "17:30", "19:30", "Consulta", "Medicina", "MEM11", null }, },
						new String[] { "Sala", "Inicio", "Fin", "Actividad", "Titulaci\u00F3n", "Grupo", "Profesor" }));
		tablaRegistros.setRowHeight(30);

		scrollPaneRegistros.setViewportView(tablaRegistros);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Se tendr� que mandar un aviso al controlador El controlador llamara a la
				 * ventana de confirmacion La ventana de confirmacion llamar� al controlador
				 * homeToLogin
				 */

				controlador.homeToLogin();
			}
		});
		btnSalir.setBounds(35, 685, 120, 40);
		contentPane.add(btnSalir);

		btnInfoExtra = new JButton("Informaci\u00F3n Extra");
		btnInfoExtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.homeToInfoExtra();
			}
		});
		btnInfoExtra.setBounds(251, 685, 144, 40);
		contentPane.add(btnInfoExtra);

		btnGestionar = new JButton("Gestionar");
		btnGestionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.homeToGestion();
			}
		});
		btnGestionar.setBounds(782, 685, 170, 40);
		contentPane.add(btnGestionar);

		Header = new JPanel();
		Header.setBackground(new Color(165, 42, 42));
		Header.setBounds(0, 0, 984, 100);
		contentPane.add(Header);
		Header.setLayout(null);

		lblTitulo = new JLabel("27/03/2019");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(250, 0, 500, 100);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Header.add(lblTitulo);

		lblUemLogo = new JLabel("Aqui Iria el logo");
		lblUemLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUemLogo.setBounds(0, 0, 240, 100);
		Header.add(lblUemLogo);

		lblPerfil = new JLabel("Aqui Iria el logo");
		lblPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.homeToPerfil();
			}
		});
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setBounds(760, 0, 224, 100);
		Header.add(lblPerfil);

		infoExtra = new JPanel();
		infoExtra.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		infoExtra.setBounds(782, 144, 170, 500);
		contentPane.add(infoExtra);
		infoExtra.setLayout(null);

		lblNumAlumnos = new JLabel("N\u00BA alumnos");
		lblNumAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumAlumnos.setBounds(0, 0, 85, 166);
		infoExtra.add(lblNumAlumnos);

		lblSimulador = new JLabel("Simulador");
		lblSimulador.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimulador.setBounds(0, 161, 85, 166);
		infoExtra.add(lblSimulador);

		lblActor = new JLabel("Actor");
		lblActor.setHorizontalAlignment(SwingConstants.CENTER);
		lblActor.setBounds(0, 334, 85, 166);
		infoExtra.add(lblActor);

		chckbxActor = new JCheckBox("");
		chckbxActor.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxActor.setBounds(91, 344, 73, 149);
		infoExtra.add(chckbxActor);

		lblNuberAlumnos = new JLabel("");
		lblNuberAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuberAlumnos.setBounds(85, 0, 85, 166);
		infoExtra.add(lblNuberAlumnos);

		lblNombreSimulador = new JLabel("");
		lblNombreSimulador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreSimulador.setBounds(85, 161, 85, 166);
		infoExtra.add(lblNombreSimulador);

		btnInformes = new JButton("Informes");
		btnInformes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.homeToInformes();
			}
		});
		btnInformes.setBounds(518, 685, 144, 40);
		contentPane.add(btnInformes);

		lblOcupaciones = new JLabel("Ocupaciones");
		lblOcupaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.homeToOcupaciones();
			}
		});
		lblOcupaciones.setIcon(new ImageIcon(Home.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		lblOcupaciones.setBounds(35, 110, 93, 23);
		contentPane.add(lblOcupaciones);

		lblNewLabel = new JLabel("Selecionar d\u00EDa");
		lblNewLabel.setBounds(782, 110, 84, 23);
		contentPane.add(lblNewLabel);

		txtCalendario = new JTextField();
		txtCalendario.setBounds(859, 111, 70, 20);
		contentPane.add(txtCalendario);
		txtCalendario.setColumns(10);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void confirmacionSalir() {
		JOptionPane.showConfirmDialog(rootPane, "�Esta seguro/a de que desea salir?");
	}

	public void getTxtCalendario() {

	}
}
