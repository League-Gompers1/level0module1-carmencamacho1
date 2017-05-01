package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.

String CarmensPower = "Eating Things";
String KaylasPower = "Telekinesis";
String SusannasPower = "Flying";
String BrisasPower = "Turning into Anime Characters";
String KendallsPower = "Super Speed";

        // 2. Ask the user to enter a name. Store their answer in a variable.
String ans = JOptionPane.showInputDialog("You have 5 options of people to choose from. Would you choose \n" + "Carmen? \n"+ "Kayla? \n" + "Susanna? \n" + "Brisa? \n"+ "Or Kendall? \n" + "Enter the name below");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
if(ans.equalsIgnoreCase("Carmen")){
	JOptionPane.showMessageDialog(null, "Your Super Power is "+ CarmensPower +"!");
}
if(ans.equalsIgnoreCase("Kayla")){
	JOptionPane.showMessageDialog(null, "Your Super Power is "+ KaylasPower + "!");
}
if(ans.equalsIgnoreCase("Susanna")){
	JOptionPane.showMessageDialog(null, "Your Super Power is " + SusannasPower + "!");
}
if(ans.equalsIgnoreCase("Brisa")){
	JOptionPane.showMessageDialog(null, "Your Super Power is " + BrisasPower + "!");
}
if(ans.equalsIgnoreCase("Kendall")){
	JOptionPane.showMessageDialog(null, "Your Super Power is "+ KendallsPower+ "!");
}
}
}	

