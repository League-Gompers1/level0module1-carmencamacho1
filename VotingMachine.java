package for_loops;

import javax.swing.JOptionPane;

public class VotingMachine {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "There are two people running to be President of the Universe: \n Dwayne 'The Rock' Johnson or Bill Nye The Science Guy");
	String a = JOptionPane.showInputDialog("How many people will be voting?");
	int rock = 0;
	int bill = 0;
	int aAsInt = Integer.parseInt(a);
	for(int i=aAsInt; i>0; i= i-1){
		String vote = JOptionPane.showInputDialog(null, "Dwayne or Bill \n Type 'Dwayne or 'Bill'");
		if(vote.equalsIgnoreCase("dwayne")){
			rock= rock+1;
		}
		else{
			bill= bill+1;
		}
	}
	JOptionPane.showMessageDialog(null, "Dwayne Johnson had " + rock + " votes \n Bill Nye had " + bill + " votes");
	if(bill>rock){
		JOptionPane.showMessageDialog(null, "Bill Nye has been voted President of the Universe! \n He won by " + (bill-rock) + " votes.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Dwayne Johnson has been voted President of the Universe! \n He won by " + (rock-bill) + " votes.");
	}
}
}
