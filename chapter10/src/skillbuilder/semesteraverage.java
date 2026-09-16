package skillbuilder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class semesteraverage {

    private JFrame frame;
    private JTextField Gr1;
    private JTextField Gr2;
    private JTextField Gr3;

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    semesteraverage window = new semesteraverage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

   
    public semesteraverage() {
        initialize();
    }

    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 752, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblGr1 = new JLabel("Grade 1:");
        lblGr1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblGr1.setBounds(10, 11, 80, 50);
        panel.add(lblGr1);

        JLabel lblGr2 = new JLabel("Grade 2:");
        lblGr2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblGr2.setBounds(10, 72, 80, 50);
        panel.add(lblGr2);

        JLabel lblGr3 = new JLabel("Grade 3:");
        lblGr3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        lblGr3.setBounds(10, 134, 80, 50);
        panel.add(lblGr3);


        Gr1 = new JTextField();
        Gr1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        Gr1.setBounds(100, 11, 197, 50);
        panel.add(Gr1);
        Gr1.setColumns(10);

        Gr2 = new JTextField();
        Gr2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        Gr2.setBounds(100, 72, 197, 50);
        panel.add(Gr2);
        Gr2.setColumns(10);

        Gr3 = new JTextField();
        Gr3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        Gr3.setBounds(100, 134, 197, 50);
        panel.add(Gr3);
        Gr3.setColumns(10);


    
        JLabel Display = new JLabel("Average: ");
        Display.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Display.setBounds(10, 210, 350, 40);
        panel.add(Display);


    
        JButton btnNewButton = new JButton("Submit");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        btnNewButton.setBounds(401, 25, 292, 189);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double grade1 = Double.parseDouble(Gr1.getText().trim());
                    double grade2 = Double.parseDouble(Gr2.getText().trim());
                    double grade3 = Double.parseDouble(Gr3.getText().trim());
                    
                    double average = (grade1 + grade2 + grade3) / 3.0;
                    
                    Display.setText(String.format("Average: %.2f", average));
                    
                } catch (NumberFormatException ex) {
                    Display.setText("Error: Please fill all boxes with numbers!");
                }
            }
        });
        
        panel.add(btnNewButton);
    }
}