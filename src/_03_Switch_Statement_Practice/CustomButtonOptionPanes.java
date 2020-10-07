package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
			case("Sunday"):
				System.out.println("cool");
				break;
			case("Monday"):
				System.out.println("garfield");
				break;
			case("Tuesday"):
				System.out.println("It's chewsday innit");
				break;
			case("Wednesday"):
				System.out.println("Alexa play living on a prayer");
				break;
			case("Thursday"):
				System.out.println("I hate python");
				break;
			case("Friday"):
				System.out.println("Beach Time");
				break;
			case("Saturday"):
				System.out.println("Epic");
				break;
		}
	}
}
