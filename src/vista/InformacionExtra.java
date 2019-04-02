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

public class InformacionExtra extends JFrame {

	private JPanel contentPane;
	private JPanel HeaderPanel;
	private JLabel lblTitulo;
	private JTextArea txtrNose;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionExtra frame = new InformacionExtra();
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
	public InformacionExtra() {
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
		
		lblTitulo = new JLabel("Informaci\u00F3n Extra");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(280, 11, 467, 61);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 50));
		HeaderPanel.add(lblTitulo);
		 lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		 lblTitulo.setVerticalAlignment(JLabel.CENTER);
		 
		 JButton btnVolver = new JButton("Volver");
		 btnVolver.setBounds(457, 672, 120, 40);
		 contentPane.add(btnVolver);
		 
		 JTable table = new JTable();
		 table.setModel(new DefaultTableModel(
		 	new Object[][] {
		 		{"0001", "00000001P", "Pedro Camacho Ortega", "Medicina", "pedrocamachoortega@gmail.com", "666998877"},
		 		{null, "00000002F", "Ra\u00FAl Rodr\u00EDguez Mercado", "Medicina", "raulrodriguezmercado@gmail.com", "666665544"},
		 	},
		 	new String[] {
		 		"N\u00FAmero", "DNI", "Nombre y Apellidos", "Titulaci\u00F3n", "Mail", "Tel\u00E9fono"
		 	}
		 ));
		 table.getColumnModel().getColumn(2).setPreferredWidth(145);
		 table.getColumnModel().getColumn(4).setPreferredWidth(175);
		 table.setBounds(78, 165, 818, 101);
		 contentPane.add(table);
		 
		 txtrNose = new JTextArea();
		 txtrNose.setBounds(78, 356, 824, 265);
		 contentPane.add(txtrNose);
		 
		 table_1 = new JTable();
		 table_1.setBounds(78, 361, 824, 258);
		 contentPane.add(table_1);
	}
}