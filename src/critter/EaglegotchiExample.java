package critter;

import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
			ImageIcon icon = new ImageIcon(gotchi.getIconPath());
			JLabel nameLbl = new JLabel("Name: " +gotchi.getName());
			JLabel moodLbl = new JLabel("Mood: " + gotchi.getMood().trim() + "/10");
			JLabel hungerLbl = new JLabel("Hunger: " + gotchi.getHungerLevel() + "/10");
			JLabel iconLbl = new JLabel(icon);
			JButton moodButton = new JButton("Play");
			JButton hungerButton = new JButton("Feed");
			
			frame.add(iconLbl);
			jpanel.add(nameLbl);
			jpanel.add(moodLbl);
			jpanel.add(hungerLbl);
			jpanel.add(moodButton);
			jpanel.add(hungerButton);
			frame.add(jpanel);

			frame.setDefaultCloseOperation
			       (JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}
}