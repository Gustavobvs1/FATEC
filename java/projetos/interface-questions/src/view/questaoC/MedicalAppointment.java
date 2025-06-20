package view.questaoC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicalAppointment {

	private JFrame frmConsultaMdica;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicalAppointment window = new MedicalAppointment();
					window.frmConsultaMdica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MedicalAppointment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultaMdica = new JFrame();
		frmConsultaMdica.setTitle("Consulta médica");
		frmConsultaMdica.setBounds(100, 100, 854, 534);
		frmConsultaMdica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConsultaMdica.getContentPane().setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		JLabel titleLabel = new JLabel("Agendamento de consulta médica");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		titleLabel.setBounds(233, 61, 376, 41);
		frmConsultaMdica.getContentPane().add(titleLabel);
		
		JComboBox<String> medicalTypeComboBox = new JComboBox<String>();
		medicalTypeComboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		medicalTypeComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Cardiologista", "Neurologista", "Pediatra"}));
		medicalTypeComboBox.setBounds(379, 127, 169, 41);
		frmConsultaMdica.getContentPane().add(medicalTypeComboBox);
		
		JLabel medicalTypeLabel = new JLabel("Selecione a especialidade do médico: ");
		medicalTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicalTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		medicalTypeLabel.setBounds(15, 134, 367, 26);
		frmConsultaMdica.getContentPane().add(medicalTypeLabel);
		
		JLabel appointmentTypeLabel = new JLabel("Selecione o tipo de consulta:");
		appointmentTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		appointmentTypeLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		appointmentTypeLabel.setBounds(20, 170, 278, 26);
		frmConsultaMdica.getContentPane().add(appointmentTypeLabel);
		
		JRadioButton onlineTypeRButton = new JRadioButton("Online");
		onlineTypeRButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		onlineTypeRButton.setBounds(304, 175, 70, 21);
		onlineTypeRButton.setActionCommand(onlineTypeRButton.getText());
		frmConsultaMdica.getContentPane().add(onlineTypeRButton);
		
		JRadioButton inpersonTypeRButton = new JRadioButton("Presencial");
		inpersonTypeRButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inpersonTypeRButton.setBounds(373, 175, 87, 21);
		inpersonTypeRButton.setActionCommand(inpersonTypeRButton.getText());
		frmConsultaMdica.getContentPane().add(inpersonTypeRButton);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(onlineTypeRButton);
		buttonGroup.add(inpersonTypeRButton);
		
		JCheckBox medicalCareCheckBox = new JCheckBox("");
		medicalCareCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		medicalCareCheckBox.setBounds(361, 211, 21, 21);
		frmConsultaMdica.getContentPane().add(medicalCareCheckBox);
		
		JLabel medicalCareLabel = new JLabel("Selecione se tem convênio médico:");
		medicalCareLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicalCareLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		medicalCareLabel.setBounds(26, 206, 329, 26);
		frmConsultaMdica.getContentPane().add(medicalCareLabel);
		
		JList<String> appointmentList = new JList<String>(model);
		appointmentList.setBounds(26,326, 583, 124);
		frmConsultaMdica.getContentPane().add(appointmentList);
		
		JButton addAppointmentButton = new JButton("Marcar consulta");
		addAppointmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String medicalType = medicalTypeComboBox.getSelectedItem().toString().toLowerCase();
				String appointmentType = buttonGroup.getSelection().getActionCommand().toLowerCase();
				String medicalCareCheckBoxString = medicalCareCheckBox.isSelected() ? "com convênio" : "sem convênio";
				
				String appointmentString = String.format("Consulta %s de %s marcada %s", appointmentType, medicalType, medicalCareCheckBoxString);
				model.addElement(appointmentString);
			}
		});
		addAppointmentButton.setForeground(Color.BLACK);
		addAppointmentButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		addAppointmentButton.setBackground(Color.WHITE);
		addAppointmentButton.setBounds(117, 242, 136, 32);
		frmConsultaMdica.getContentPane().add(addAppointmentButton);
		
		JScrollPane scrollPane = new JScrollPane(appointmentList);
		scrollPane.setBounds(26, 326, 583, 124);
		frmConsultaMdica.getContentPane().add(scrollPane);
		
		JButton removeAppointmentButton = new JButton("Remover consulta");
		removeAppointmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.remove(appointmentList.getSelectedIndex());
			}
		});
		removeAppointmentButton.setForeground(Color.BLACK);
		removeAppointmentButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		removeAppointmentButton.setBackground(Color.WHITE);
		removeAppointmentButton.setBounds(619, 378, 136, 32);
		frmConsultaMdica.getContentPane().add(removeAppointmentButton);
		
		JButton exitButton = new JButton("Sair");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		exitButton.setBackground(Color.RED);
		exitButton.setBounds(278, 238, 93, 32);
		frmConsultaMdica.getContentPane().add(exitButton);	
	}
}
