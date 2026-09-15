import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class classdemo {

	private JFrame frame;
	private JTextField firstname;
	private JTextField lastname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classdemo window = new classdemo();
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
	public classdemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		firstname = new JTextField();
		firstname.setText("Enter First Name");
		firstname.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(firstname.getText().equals("Enter First Name")) {
					
				firstname.setText("");
				
				}
					
					
			
			}
		
			});
		firstname.setBounds(42, 27, 100, 20);
		panel.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setText("Enter Last Name");
		lastname.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lastname.getText().equals("Enter Last Name")) {
					lastname.setText("");
				}
			}
		});
		lastname.setColumns(10);
		lastname.setBounds(271, 27, 100, 20);
		panel.add(lastname);
		
		JLabel display = new JLabel("");
		display.setFont(new Font("Tahoma", Font.PLAIN, 9));
		display.setBounds(31, 173, 318, 58);
		panel.add(display);
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String fn = firstname.getText();
			String ln = lastname.getText();
display.setText("Your First Name Is: "
		+ fn + " "
		+ "Your Last Name"
		+ ln);

			}
		});
		submit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		submit.setBounds(441, 11, 240, 204);
		panel.add(submit);
		
		
	
}	
}
