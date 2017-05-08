package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		Random x = new Random();
		int y = x.nextInt(1000) + 1;
		String ans = JOptionPane.showInputDialog(null,
				"Hello! I am thinking a number from 1-1000. \n Can you guess it?");
		int ansAsInt = Integer.parseInt(ans);
		int guesses = 0;
		for (int z = 0; z < 30; z++) {
			if (ansAsInt > y) {
				ans = JOptionPane.showInputDialog(null, "You need to guess a LOWER number.");
				ansAsInt = Integer.parseInt(ans);
			}
			if (ansAsInt < y) {
				ans = JOptionPane.showInputDialog(null, "You need to guess a HIGHER number.");
				ansAsInt = Integer.parseInt(ans);
			}
			if (ansAsInt == y) {
				JOptionPane.showMessageDialog(null, "You guessed the RIGHT number!");
				z = 11;
			}
			guesses = z;

		}
		if (guesses == 30) {
			JOptionPane.showMessageDialog(null, "You have no more guesses!\n The number was " + y);
		}
	}

}
