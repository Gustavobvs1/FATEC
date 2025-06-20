package view.questaoB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	protected JFrame frame;
	private JTextField loginField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 746, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel loginLabel = new JLabel("Login: ");
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		loginLabel.setBounds(179, 183, 136, 26);
		frame.getContentPane().add(loginLabel);
		
		JLabel passwordLabel = new JLabel("Senha: ");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		passwordLabel.setBounds(179, 229, 136, 26);
		frame.getContentPane().add(passwordLabel);
		
		JLabel errorLabel = new JLabel("Credenciais erradas!");
		errorLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setBounds(239, 363, 253, 50);
		errorLabel.setVisible(false);
		frame.getContentPane().add(errorLabel);
		
		loginField = new JTextField();
		loginField.setBounds(282, 188, 150, 26);
		frame.getContentPane().add(loginField);
		loginField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(282, 234, 150, 26);
		frame.getContentPane().add(passwordField);
		
		JButton exitButton = new JButton("Fechar");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		exitButton.setBackground(Color.RED);
		exitButton.setBounds(422, 298, 93, 32);
		frame.getContentPane().add(exitButton);
		
		JButton loginButton = new JButton("Entrar");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loginField.getText().toLowerCase().equals("admin") && passwordField.getText().equals("123456")) {
					new TaskManager().frame.setVisible(true);
					frame.setVisible(false);
					}
				else errorLabel.setVisible(true);
			}
		});
		loginButton.setForeground(new Color(0, 0, 0));
		loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		loginButton.setBackground(new Color(255, 255, 255));
		loginButton.setBounds(197, 298, 93, 32);
		frame.getContentPane().add(loginButton);
		
		JLabel titleLabel = new JLabel("Fazer Login");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		titleLabel.setBounds(282, 91, 141, 41);
		frame.getContentPane().add(titleLabel);
		
		JButton cleanButton = new JButton("Limpar");
		cleanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginField.setText("");
				passwordField.setText("");
			}
		});
		cleanButton.setForeground(new Color(0, 0, 0));
		cleanButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cleanButton.setBackground(new Color(255, 255, 255));
		cleanButton.setBounds(308, 298, 93, 32);
		frame.getContentPane().add(cleanButton);
		
	}
}
