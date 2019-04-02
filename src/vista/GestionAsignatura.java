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
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class GestionAsignatura extends JFrame {

	private JPanel contentPane;
	private JPanel HeaderPanel;
	private JLabel lblTitulo;
	private JButton btnModificarAsignatura;
	private JButton btnBorrarAsignatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAsignatura frame = new GestionAsignatura();
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
	public GestionAsignatura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\usuario\\git\\ud5-tarea-3-aplicacion-swing-pi-roberto-aprende-linux\\img\\UEMLogo.png"));
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
		
		lblTitulo = new JLabel("Asignatura");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(280, 11, 467, 61);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		HeaderPanel.add(lblTitulo);
		 lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		 lblTitulo.setVerticalAlignment(JLabel.CENTER);
		 
		 JButton btnVolver = new JButton("Volver");
		 btnVolver.setBounds(128, 672, 120, 40);
		 contentPane.add(btnVolver);
		 
		 JButton btnCrearUsuario = new JButton("A\u00F1adir Asignartura");
		 btnCrearUsuario.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		 btnCrearUsuario.setBounds(722, 672, 131, 40);
		 contentPane.add(btnCrearUsuario);
		 
		 btnModificarAsignatura = new JButton("Modificar Asignatura");
		 btnModificarAsignatura.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		 btnModificarAsignatura.setBounds(318, 672, 131, 40);
		 contentPane.add(btnModificarAsignatura);
		 
		 btnBorrarAsignatura = new JButton("Borrar Asignatura");
		 btnBorrarAsignatura.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 btnBorrarAsignatura.setBounds(518, 672, 120, 40);
		 contentPane.add(btnBorrarAsignatura);
	}
}
