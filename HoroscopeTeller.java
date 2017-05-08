package variables_and_conditionals;

import javax.swing.JOptionPane;

public class HoroscopeTeller {
	public static void main(String[] args) {
		String horoscope = JOptionPane.showInputDialog(null, "I will give you a horoscope based on your zodiac sign. Which one is yours? \n Aries: March 21-April 19 \n Taurus: April 20-May 20 \n Gemini: May 21-June 20 \n Cancer: June 21-July 22 \n Leo: July 23-August 22 \n Virgo: August 23-September 22 \n Libra: September 23-October 22 \n Scorpio: October 23-November 21 \n Sigittarius: November 22-December 21 \n Capricorn: December 22-January 19 \n Aquarius: January 20-February 18 \n Pisces: February 19-March 20");
		if(horoscope.equalsIgnoreCase("Aries")){
			JOptionPane.showMessageDialog(null,"You are adventurous, energetic, couageous, and enthusiastic. \nYou can be impatient, selfish, quick tempered, and a daredevil.");
		}
		if(horoscope.equalsIgnoreCase("Taurus")){
			JOptionPane.showMessageDialog(null,"You are patient, reliable, warm-hearted, and persistent. \nYou can be jealous, possesive, resentful, and greedy.");
		}
		if(horoscope.equalsIgnoreCase("Gemini")){
			JOptionPane.showMessageDialog(null,"You are adaptable, communicative, intellectual, and lively. \nYou can be nervous, tense, inconsistent, and superficial.");
		}
		}
	

}
