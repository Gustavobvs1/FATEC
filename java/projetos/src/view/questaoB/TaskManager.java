package view.questaoB;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TaskManager {

	protected JFrame frame;
	private JTextField taskField;


	/**
	 * Create the application.
	 */
	public TaskManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 747, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		JLabel titleLabel = new JLabel("Gerenciador de tarefas");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		titleLabel.setBounds(249, 50, 273, 41);
		frame.getContentPane().add(titleLabel);
		
		JLabel taskLabel = new JLabel("Digite a tarefa: ");
		taskLabel.setHorizontalAlignment(SwingConstants.CENTER);
		taskLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		taskLabel.setBounds(57, 216, 186, 26);
		frame.getContentPane().add(taskLabel);
		
		taskField = new JTextField();
		taskField.setColumns(10);
		taskField.setBounds(230, 216, 150, 26);
		frame.getContentPane().add(taskField);
		
		JList<String> taskList = new JList<String>(model);
		taskList.setBounds(506, 128, 180, 232);
		frame.getContentPane().add(taskList);
		
		JButton addTaskButton = new JButton("Adicionar tarefa");
		addTaskButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!model.contains(taskField.getText()) && taskField.getText() != "") {
				model.addElement(taskField.getText());
				taskField.setText("");
				}
			}
		});
		addTaskButton.setForeground(Color.BLACK);
		addTaskButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		addTaskButton.setBackground(Color.WHITE);
		addTaskButton.setBounds(104, 262, 136, 32);
		frame.getContentPane().add(addTaskButton);

		
		JButton removeTaskButton = new JButton("Remover tarefa");
		removeTaskButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.remove(taskList.getSelectedIndex());
			}
		});
		removeTaskButton.setForeground(Color.BLACK);
		removeTaskButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		removeTaskButton.setBackground(Color.WHITE);
		removeTaskButton.setBounds(531, 369, 136, 32);
		frame.getContentPane().add(removeTaskButton);
		
		JButton exitButton = new JButton("Sair");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new Login().frame.setVisible(true);
			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		exitButton.setBackground(Color.RED);
		exitButton.setBounds(277, 262, 93, 32);
		frame.getContentPane().add(exitButton);
		
		JScrollPane scrollPane = new JScrollPane(taskList);
		scrollPane.setBounds(506, 128, 180, 232);
		frame.getContentPane().add(scrollPane);
		
	}
}
