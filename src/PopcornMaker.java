import static org.hamcrest.CoreMatchers.instanceOf;

import javax.swing.JOptionPane;

/* Your mission and you have to accept it:
 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and cooks it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 *  Don't change the existing methods.
 */

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor should the popcorn be?");
		Popcorn bag = new Popcorn(flavor);
		Microwave hi = new Microwave();
		String time = JOptionPane.showInputDialog("How many minutes should the popcorn be cooked for?");
		int minutes = Integer.parseInt(time);
		hi.setTime(minutes);
		hi.putInMicrowave(bag);
		hi.startMicrowave();
	}
}
