package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JPanel HeaderPanel;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel lblPerfil;
	private JButton btnVolver;
	private JButton btnConfirmarCambios;
	private JTextField txtUsuario;
	private JLabel lblUsuario;
	private JTextField txtPasswordActual;
	private JLabel lblPasswordActual;
	private JLabel lblRolTitulo;
	private JLabel lblRol;
	private JLabel lblPasswordNueva;
	private JTextField txtPasswordNueva;
	private JLabel lblConfirmarContrasea;
	private JTextField txtPasswordConfirmar;


	/**
	 * Create the frame.
	 */
	public Perfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(165, 42, 42));
		HeaderPanel.setBounds(0, 0, 984, 101);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);
		
		lblTitulo = new JLabel("Perfil");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(250, 0, 500, 100);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		HeaderPanel.add(lblTitulo);
		
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


		btnConfirmarCambios = new JButton(" Confirmar cambios");
		btnConfirmarCambios.setBounds(762, 685, 140, 40);
		contentPane.add(btnConfirmarCambios);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(130, 246, 210, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setBounds(194, 181, 91, 54);
		contentPane.add(lblUsuario);
		
		txtPasswordActual = new JTextField();
		txtPasswordActual.setColumns(10);
		txtPasswordActual.setBounds(572, 246, 210, 30);
		contentPane.add(txtPasswordActual);
		
		lblPasswordActual = new JLabel("Contrase\u00F1a actual");
		lblPasswordActual.setForeground(Color.BLACK);
		lblPasswordActual.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPasswordActual.setBounds(584, 181, 198, 54);
		contentPane.add(lblPasswordActual);
		
		lblRolTitulo = new JLabel("Rol");
		lblRolTitulo.setForeground(Color.BLACK);
		lblRolTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblRolTitulo.setBounds(213, 358, 43, 54);
		contentPane.add(lblRolTitulo);
		
		lblRol = new JLabel("Administrador");
		lblRol.setForeground(Color.BLACK);
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRol.setBounds(180, 412, 104, 30);
		contentPane.add(lblRol);
		
		lblPasswordNueva = new JLabel("Nueva contrase\u00F1a");
		lblPasswordNueva.setForeground(Color.BLACK);
		lblPasswordNueva.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPasswordNueva.setBounds(584, 317, 198, 54);
		contentPane.add(lblPasswordNueva);
		
		txtPasswordNueva = new JTextField();
		txtPasswordNueva.setColumns(10);
		txtPasswordNueva.setBounds(572, 382, 210, 30);
		contentPane.add(txtPasswordNueva);
		
		lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmarContrasea.setForeground(Color.BLACK);
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConfirmarContrasea.setBounds(544, 445, 238, 54);
		contentPane.add(lblConfirmarContrasea);
		
		txtPasswordConfirmar = new JTextField();
		txtPasswordConfirmar.setColumns(10);
		txtPasswordConfirmar.setBounds(572, 508, 210, 30);
		contentPane.add(txtPasswordConfirmar);
		
	}
}
