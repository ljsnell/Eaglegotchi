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
			Eaglegotchi gotchi = new Eaglegotchi(eName, "Happy", 3, iconPath);
			System.out.println(gotchi.getIconPath());
			JFrame frame = new JFrame();
			frame.setLayout(new FlowLayout());
			ImageIcon icon = new ImageIcon("egg.png");
			JLabel name = new JLabel(eName);
			JLabel colon = new JLabel(":");
			JLabel label = new JLabel(icon);
			frame.add(name);
			frame.add(colon);
			frame.add(label);
			frame.setDefaultCloseOperation
			       (JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
		}
	}
}