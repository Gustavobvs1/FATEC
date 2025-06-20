package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestaoA {

	private JFrame frmVerificarnumeroperfeito;
	private JTextField numberInput;
	private JTextField resultInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoA window = new QuestaoA();
					window.frmVerificarnumeroperfeito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuestaoA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVerificarnumeroperfeito = new JFrame();
		frmVerificarnumeroperfeito.setTitle("VerificarNumeroPerfeito");
		frmVerificarnumeroperfeito.setBounds(100, 100, 724, 484);
		frmVerificarnumeroperfeito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVerificarnumeroperfeito.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Verificação");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		titleLabel.setBounds(287, 124, 141, 41);
		frmVerificarnumeroperfeito.getContentPane().add(titleLabel);
		
		JLabel numberInputLabel = new JLabel("Digite um número:");
		numberInputLabel.setHorizontalAlignment(SwingConstants.LEFT);
		numberInputLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		numberInputLabel.setBounds(94, 209, 141, 32);
		frmVerificarnumeroperfeito.getContentPane().add(numberInputLabel);
		
		JLabel resultLabel = new JLabel("Resultado:");
		resultLabel.setHorizontalAlignment(SwingConstants.LEFT);
		resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		resultLabel.setBounds(94, 249, 141, 32);
		frmVerificarnumeroperfeito.getContentPane().add(resultLabel);
		
		numberInput = new JTextField();
		numberInput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		numberInput.setBounds(211, 216, 96, 19);
		frmVerificarnumeroperfeito.getContentPane().add(numberInput);
		numberInput.setColumns(10);
		
		resultInput = new JTextField();
		resultInput.setEditable(false);
		resultInput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		resultInput.setColumns(10);
		resultInput.setBounds(162, 256, 96, 19);
		frmVerificarnumeroperfeito.getContentPane().add(resultInput);
		
		JButton perfectNumberButton = new JButton("Perfeito");
		perfectNumberButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					int number = Integer.parseInt(numberInput.getText());
					int sum = 0;
					for(int i = 1; i < number; i++) {
						if(number % i == 0) sum += i;
					}
					resultInput.setText(String.valueOf(sum));
					if(number == sum) JOptionPane.showMessageDialog(null, "Número é perfeito");
					else JOptionPane.showMessageDialog(null, "Número não é perfeito");	
					}
				catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Erro: digite um número válido!");
				}
		}});
		perfectNumberButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		perfectNumberButton.setBounds(162, 355, 85, 21);
		frmVerificarnumeroperfeito.getContentPane().add(perfectNumberButton);
		
		JButton dsuButton = new JButton("DSU");
		dsuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int number = Integer.parseInt(numberInput.getText());
				if(number < 10 || number > 99) JOptionPane.showMessageDialog(null, "Digite um número entre 10 e 99 para utilizar este botão!");
				else {
					int tenNumber = Character.getNumericValue(numberInput.getText().charAt(0));
					int unitNumber = Character.getNumericValue(numberInput.getText().charAt(1));
					int sum = tenNumber + unitNumber;
					String text = String.valueOf(tenNumber) + String.valueOf(sum) + String.valueOf(unitNumber);
					resultInput.setText(text);
					
					JOptionPane.showMessageDialog(null, "Número: " + number);
					JOptionPane.showMessageDialog(null, "Dezena: " + tenNumber);
					JOptionPane.showMessageDialog(null, "Unidade: " + unitNumber);
					JOptionPane.showMessageDialog(null, "Soma da dezena com a unidade: " + sum);
					}
				}
				catch(NumberFormatException error) {
					JOptionPane.showMessageDialog(null, "Erro: digite um número válido!");
					}
			}
		});
		dsuButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		dsuButton.setBounds(287, 355, 85, 21);
		frmVerificarnumeroperfeito.getContentPane().add(dsuButton);
		
		JButton cleanButton = new JButton("Limpar");
		cleanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberInput.setText("");
				resultInput.setText("");
			}
		});
		cleanButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cleanButton.setBounds(408, 355, 85, 21);
		frmVerificarnumeroperfeito.getContentPane().add(cleanButton);
		
		JButton exitButton = new JButton("Sair");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setBackground(Color.RED);
		exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		exitButton.setBounds(547, 355, 85, 21);
		frmVerificarnumeroperfeito.getContentPane().add(exitButton);
	}
}
