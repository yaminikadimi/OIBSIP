package Num_Guessing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane extends Guessnum  {

	JFrame f;
	public void rules() {
		JOptionPane.showMessageDialog(f,"This is a number guessing game.\nRules:\n-There are 5 chances to guess the number correctly, if you are unable to "
				+"guess the number with those chances game will be ended.\n-The input you enter should be a positive integer.\n-If the number is guessed in 1st "
				+ "attempt, the score will be 50 and for every further attempt the score will be reduced by 5.\n-You can view your entered inputs and hints in the "
				+ "console.","Rules",JOptionPane.INFORMATION_MESSAGE);	
	}

	public void welcome(){
		int option = JOptionPane.showConfirmDialog(f,"Welcome players!\n Are you ready to play?","Message",JOptionPane.INFORMATION_MESSAGE);
		if(option == JOptionPane.NO_OPTION || option==JOptionPane.CANCEL_OPTION || option == JOptionPane.CLOSED_OPTION)
		{
			JOptionPane.showMessageDialog(f,"Game Ended","Alert",JOptionPane.WARNING_MESSAGE);
			System.exit(option);
		}
	}
	public String input() {
		String input = JOptionPane.showInputDialog(f,"Guess the positive number that computer generates in the range of 0 to 100:");
		
		if(input == null || input.isEmpty() == true || input == "")   
		{
			JOptionPane.showMessageDialog(f,"Game Ended","Alert",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		return input;
	}
	public String input_again() {
		String input = JOptionPane.showInputDialog(f,"Guess the number again:");
		return input;
	}

	public void guessed(int score){
		JOptionPane.showMessageDialog(f,"You guessed the number correctly in "+super.input_count +" chance(s)!!\n You Won :)\nYour score is " + score);
	}

	public void out_of_chances() {
		JOptionPane.showMessageDialog(f, "You are out of chances!\n Game Ended","Alert",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
