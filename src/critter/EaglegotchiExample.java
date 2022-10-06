package critter;

import java.util.Scanner;

public class EaglegotchiExample {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your Eaglegotchi's Name:");
			String eName = scanner.next();
			
			System.out.println("Select your Eaglegotchi's iconPath:");
			String iconPath = scanner.next();
			Eaglegotchi gotchi = new Eaglegotchi(eName, "Happy", 3, iconPath);
			System.out.println(gotchi.getIconPath());
		}
	}
}