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
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Gestion extends JFrame {
	
	private Controlador controlador;
	private JPanel contentPane;
	private JButton btnVolver;
	private JButton btnGestionUsuarios;
	private JPanel Header;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	private JButton btnGestionarActividades;
	private JButton btnGestionarAsignatura;
	private JButton btnGestionarSalas;
	private JButton btnGestionarActores;
	private JButton btnGestionarProfesores;
	private JButton btnGestionarAlumnos;
	private JButton btnGestionRegistros;
	private JButton btnGestionarAcad;
	private JButton btnVerGrupos;


	public Gestion() {
		setTitle("Hospital simulado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToHome();
			}
		});
		
		Header = new JPanel();
		Header.setBackground(new Color(165, 42, 42));
		Header.setBounds(0, 0, 984, 100);
		contentPane.add(Header);
		Header.setLayout(null);
		
		lblTitulo = new JLabel("Gesti\u00F3n");
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
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfil.setBounds(760, 0, 224, 100);
		Header.add(lblPerfil);
		btnVolver.setBounds(440, 671, 120, 40);
		contentPane.add(btnVolver);

		btnGestionUsuarios = new JButton("Gestionar Usuarios");
		btnGestionUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.gestionToGestionarUsuarios();
			}
		});
		btnGestionUsuarios.setBounds(150, 165, 250, 60);
		contentPane.add(btnGestionUsuarios);
		
		btnGestionRegistros = new JButton("Gestionar Registros");
		btnGestionRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarRegistros();
			}
		});
		btnGestionRegistros.setBounds(600, 165, 250, 60);
		contentPane.add(btnGestionRegistros);
		
		btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarActividades();
			}
		});
		btnGestionarActividades.setBounds(150, 265, 250, 60);
		contentPane.add(btnGestionarActividades);
		
		btnGestionarAsignatura = new JButton("Gestionar Asignatura");
		btnGestionarAsignatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarAsignatura();
			}
		});
		btnGestionarAsignatura.setBounds(600, 265, 250, 60);
		contentPane.add(btnGestionarAsignatura);
		
		btnGestionarAlumnos = new JButton("Gestionar Alumnos");
		btnGestionarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarAlumnos();
			}
		});
		btnGestionarAlumnos.setBounds(150, 365, 250, 60);
		contentPane.add(btnGestionarAlumnos);
		
		btnGestionarProfesores = new JButton("Gestionar Profesores");
		btnGestionarProfesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarProfesores();
			}
		});
		btnGestionarProfesores.setBounds(600, 365, 250, 60);
		contentPane.add(btnGestionarProfesores);
		
		btnGestionarActores = new JButton("Gestionar Actores");
		btnGestionarActores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarActores();
			}
		});
		btnGestionarActores.setBounds(150, 465, 250, 60);
		contentPane.add(btnGestionarActores);
		
		btnGestionarSalas = new JButton("Gestionar Salas");
		btnGestionarSalas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarSalas();
			}
		});
		btnGestionarSalas.setBounds(600, 465, 250, 60);
		contentPane.add(btnGestionarSalas);
		
		btnGestionarAcad = new JButton("Gestionar A\u00F1o Acad\u00E9mico");
		btnGestionarAcad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToGestionarAcad();
			}
		});
		btnGestionarAcad.setBounds(600, 565, 250, 60);
		contentPane.add(btnGestionarAcad);
		
		btnVerGrupos = new JButton("Ver grupos");
		btnVerGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionToVerGrupos();
			}
		});
		btnVerGrupos.setBounds(150, 565, 250, 60);
		contentPane.add(btnVerGrupos);
	}
	
	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
}
