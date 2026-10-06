package skillbuilder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSorting {

    private JFrame frame;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JComboBox<String> gradeBox;
    private JComboBox<String> schoolBox;
    private JTextArea textResultArea; 
    private JLabel mascotImageLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentSorting window = new StudentSorting();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StudentSorting() {
        initialize();
    }

    private void initialize() {
        ImageIcon jamesImg = new ImageIcon("../chapter10/src/images/james.png");
        ImageIcon aberhartImg = new ImageIcon("../chapter10/src/images/aberhart.png");
        ImageIcon diefenbakerImg = new ImageIcon("../chapter10/src/images/diefenbaker.png");
        ImageIcon franklinImg = new ImageIcon("../chapter10/src/images/franklin.png");

        frame = new JFrame();
        frame.setBounds(100, 100, 639, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 623, 411);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        firstNameField = new JTextField("first name");
        firstNameField.setBounds(20, 30, 170, 30);
        panel.add(firstNameField);

        lastNameField = new JTextField("last name");
        lastNameField.setBounds(200, 30, 170, 30);
        panel.add(lastNameField);

        String[] grades = { "10", "11", "12" };
        gradeBox = new JComboBox<>(grades);
        gradeBox.setBounds(20, 80, 90, 30);
        panel.add(gradeBox);

        String[] schools = { "James", "Aberhart", "Diefenbaker", "Franklin" };
        schoolBox = new JComboBox<>(schools);
        schoolBox.setBounds(200, 80, 140, 30);
        panel.add(schoolBox);

        textResultArea = new JTextArea("");
        textResultArea.setBounds(20, 140, 350, 60);
        textResultArea.setEditable(false);      
        panel.add(textResultArea);

        mascotImageLabel = new JLabel("");
        mascotImageLabel.setBounds(20, 220, 250, 150);
        panel.add(mascotImageLabel);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(410, 30, 110, 180);
        
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String selectedGrade = (String) gradeBox.getSelectedItem();
                String selectedSchool = (String) schoolBox.getSelectedItem();

                textResultArea.setText(firstName + " " + lastName + " is in grade: " + selectedGrade 
                        + "\nand goes to " + selectedSchool + " high school.");

                if (selectedSchool.equals("James")) {
                    mascotImageLabel.setIcon(jamesImg);
                } else if (selectedSchool.equals("Aberhart")) {
                    mascotImageLabel.setIcon(aberhartImg);
                } else if (selectedSchool.equals("Diefenbaker")) {
                    mascotImageLabel.setIcon(diefenbakerImg);
                } else if (selectedSchool.equals("Franklin")) {
                    mascotImageLabel.setIcon(franklinImg);
                }
            }
        }); 
        
        panel.add(submitButton);
    }
}