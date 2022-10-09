package critter;

import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EaglegotchiExample {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your Eaglegotchi's Name:");
			String eName = scanner.next();
			String iconPath = "egg.png";
			Eaglegotchi gotchi = new Eaglegotchi(eName, "Indifferent", 3, iconPath);

			JFrame frame = new JFrame();
			frame.setLayout(new FlowLayout());
			ImageIcon icon = new ImageIcon("egg.png");
			JLabel nameLbl = new JLabel("Name: " +gotchi.getName());
			JLabel moodLbl = new JLabel("Mood: " + gotchi.getMood());
			JLabel label = new JLabel(icon);
			frame.add(nameLbl);
			frame.add(label);
			frame.add(moodLbl);
			frame.setDefaultCloseOperation
			       (JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}
}