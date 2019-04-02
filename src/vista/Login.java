package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;

public class Login extends JFrame {

	private JPanel contentPane;


	
	
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField txtUser = new TextField();
		txtUser.setBounds(258, 191, 149, 22);
		contentPane.add(txtUser);
		
		TextField textField = new TextField();
		textField.setBounds(258, 246, 149, 22);
		contentPane.add(textField);
	}
}
