package critter;

import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.DBHandler;

public class EaglegotchiExample {

	public static void main(String[] args) throws SQLException {
		DBHandler dbHandler = new DBHandler();
		Eaglegotchi gotchi = dbHandler.fetchEagleByUsername("LSNELL");		
		try (Scanner scanner = new Scanner(System.in)) {
			JFrame frame = new JFrame();
			JPanel jpanel = new JPanel();
			jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
			frame.setLayout(new FlowLayout());
			ImageIcon icon = new ImageIcon("eagle.png");
			JLabel nameLbl = new JLabel("Name: " +gotchi.getName());
			JLabel moodLbl = new JLabel("Mood: " + gotchi.getMood());
			JLabel icon_label = new JLabel(icon);
			frame.add(icon_label);
			jpanel.add(nameLbl);
			jpanel.add(moodLbl);
			frame.add(jpanel);
//			frame.add(moodLbl);
			frame.setDefaultCloseOperation
			       (JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}
}