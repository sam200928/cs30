package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StudentSemesterAverage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverage window = new StudentSemesterAverage();
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
	public StudentSemesterAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(269, 10, 225, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(269, 30, 225, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(269, 50, 225, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(269, 70, 225, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(269, 90, 225, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(269, 110, 225, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(269, 130, 225, 20);
		panel.add(textField_6);
		
		Label label = new Label("Student Name");
		label.setBounds(10, 10, 86, 20);
		panel.add(label);
		
		Label label_1 = new Label("Grade Level");
		label_1.setBounds(10, 30, 62, 20);
		panel.add(label_1);
		
		Label label_2 = new Label("Semester Number");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 11));
		label_2.setBounds(10, 50, 100, 20);
		panel.add(label_2);
		
		Label label_3 = new Label("Grade 1");
		label_3.setBounds(10, 70, 62, 20);
		panel.add(label_3);
		
		Label label_4 = new Label("Grade 2");
		label_4.setBounds(10, 90, 62, 20);
		panel.add(label_4);
		
		Label label_5 = new Label("Grade 3");
		label_5.setBounds(10, 110, 62, 20);
		panel.add(label_5);
		
		Label label_6 = new Label("Grade 4");
		label_6.setBounds(10, 130, 62, 20);
		panel.add(label_6);
		
		JLabel lblNewLabel = new JLabel("Average");
		lblNewLabel.setBounds(10, 150, 46, 20);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save to File");
		btnNewButton.setBounds(141, 373, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnViewFileContents = new JButton("View File Contents");
		btnViewFileContents.setBounds(250, 373, 124, 23);
		panel.add(btnViewFileContents);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 181, 494, 181);
		panel.add(textArea);
	}
}
