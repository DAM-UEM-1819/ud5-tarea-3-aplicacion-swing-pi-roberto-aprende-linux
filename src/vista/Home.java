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

public class Home extends JFrame {

	private JPanel contentPane;
	private JTable tablaUsuarios;
	private JTextField txtUsuario;
	private JTextField txtRol;
	private JButton btnVolver;
	private JButton btnBorrarUsr;
	private JButton btnAddUsuario;
	private JPanel Header;
	private JLabel lblTitulo;
	private JLabel lblUemLogo;
	private JLabel label;
	private JScrollPane scrollPaneRegistros;

	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPaneRegistros = new JScrollPane();
		scrollPaneRegistros.setBounds(100, 145, 800, 450);
		contentPane.add(scrollPaneRegistros);

		tablaUsuarios = new JTable();
		tablaUsuarios.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Usuarios", "Rol" }));
		scrollPaneRegistros.setViewportView(tablaUsuarios);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(125, 600, 350, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtRol = new JTextField();
		txtRol.setBounds(525, 600, 350, 30);
		contentPane.add(txtRol);
		txtRol.setColumns(10);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setBounds(100, 685, 120, 40);
		contentPane.add(btnVolver);

		btnBorrarUsr = new JButton("Borrar Usuario");
		btnBorrarUsr.setBounds(440, 685, 120, 40);
		contentPane.add(btnBorrarUsr);

		btnAddUsuario = new JButton("A\u00F1adir Usuario");
		btnAddUsuario.setBounds(782, 685, 120, 40);
		contentPane.add(btnAddUsuario);
		
		Header = new JPanel();
		Header.setBackground(new Color(165, 42, 42));
		Header.setBounds(0, 0, 984, 100);
		contentPane.add(Header);
		Header.setLayout(null);
		
		lblTitulo = new JLabel("Usuarios");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(250, 0, 500, 100);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		Header.add(lblTitulo);
		
		lblUemLogo = new JLabel("Aqui Iria el logo");
		lblUemLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblUemLogo.setBounds(0, 0, 240, 100);
		Header.add(lblUemLogo);
		
		label = new JLabel("Aqui Iria el logo");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(760, 0, 224, 100);
		Header.add(label);
	}
}
