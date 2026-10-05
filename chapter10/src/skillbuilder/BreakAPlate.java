package skillbuilder;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class BreakAPlate {

	private JFrame frame;
	private JButton play;
	private JLabel plates;
	private JLabel prizeWon; 
	
	static final String FIRST_PRIZE = "tiger plush";
	static final String CONSOLATION_PRIZE = "sticker";

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public BreakAPlate() {
		initialize();
	}

	
	private void initialize() {
		
		ImageIcon platesImg = new ImageIcon("../chapter10/src/images/plates.gif");
		ImageIcon allBrokenImg = new ImageIcon("../chapter10/src/images/plates_all_broken.gif");
		ImageIcon twoBrokenImg = new ImageIcon("../chapter10/src/images/plates_two_broken.gif");
		
		
		ImageIcon tigerImg = new ImageIcon("../chapter10/src/images/tiger_plush.gif");
		ImageIcon stickerImg = new ImageIcon("../chapter10/src/images/sticker.gif");
		
		frame = new JFrame();
		frame.setTitle("BreakAPlate");
		frame.setBounds(100, 100, 423, 420); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255)); 
		panel.setBounds(0, 0, 407, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		plates = new JLabel("");
		plates.setBounds(62, 11, 284, 110);
		plates.setIcon(platesImg);
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(plates);
		
		
		prizeWon = new JLabel("");
		prizeWon.setBounds(62, 133, 284, 120);
		prizeWon.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(prizeWon);
		
				play = new JButton("Play");
				play.setBounds(110, 292, 184, 50);
		play.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		play.setBackground(SystemColor.activeCaption);
		play.setForeground(new Color(0, 0, 0));
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eventName = play.getText();

				if (eventName.equals("Play")) {
					if (Math.random() < 0.5) {
						plates.setIcon(allBrokenImg);
						prizeWon.setIcon(tigerImg); 
					} else {
						plates.setIcon(twoBrokenImg);
						prizeWon.setIcon(stickerImg); 
					}
					
					play.setText("Play Again");
				} else if (eventName.equals("Play Again")) {
					plates.setIcon(platesImg);
					prizeWon.setIcon(null);
					play.setText("Play");
				}
			}
		});
		panel.add(play);
	}
}