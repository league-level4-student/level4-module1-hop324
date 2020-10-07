package _05_Enum_Stuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _00_Horoscope implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button10 = new JButton();
	JButton button11 = new JButton();
	JButton button12 = new JButton();
	
	Zodiac holder;
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void horoscope(Zodiac a){
		JFrame frame = new JFrame();
		JOptionPane panel = new JOptionPane();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		panel.add(button1);panel.add(button2);panel.add(button3);panel.add(button4);panel.add(button5);panel.add(button6);
		panel.add(button7);panel.add(button8);panel.add(button9);panel.add(button10);panel.add(button11);panel.add(button12);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		switch(a) {
			case ARIES:
				System.out.println("You're gonna be cool");
				break;
			case PISCES:
				System.out.println("You're gonna eat a taco");
				break;
			case TAURUS:
				System.out.println("You're gonna make a friend");
				break;
			case GEMINI:
				System.out.println("You're gonna do a flip");
				break;
			case CANCER:
				System.out.println("You're gonna be a crab");
				break;
			case LEO:
				System.out.println("You're gonna roar");
				break;
			case VIRGO:
				System.out.println("You're gonna take a vacation");
				break;
			case LIBRA:
				System.out.println("You're gonna speak French");
				break;
			case SCORPIO:
				System.out.println("You're gonna be a scorpion");
				break;
			case SAGITTARIUS:
				System.out.println("You're gonna drink some really good juice");
				break;
			case CAPRICORN:
				System.out.println("You're gonna be epic");
				break;
			case AQUARIUS:
				System.out.println("You're gonna drink some water");
				break;
			
		default:
			break;
		}
	}
	// 3. Make a main method to test your method

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			holder = new Zodiac.PISCES;
		}
		
	}
	
}
