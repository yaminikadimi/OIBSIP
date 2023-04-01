package Num_Guessing;

import java.util.Random;
import java.util.Scanner;

public class Guessnum{
	 static OptionPane op = new OptionPane();
	int score = 50;
	static int input_count = 1;

	public  int count(int input) {
		input_count += 1;
		score -= 5;
		if(input_count<=5 && input_count>1)
		{
			input= Integer.parseInt(op.input_again());
			System.out.print("Guess the number again:  ");
			System.out.println(input);
		}
		return input;
	}

	public static void main(String args[]) {
		op.rules();
		op.welcome();

		Guessnum g = new Guessnum();
		Random r = new Random();
		int num = r.nextInt(1,100);

		try {
			int input = Integer.parseInt(op.input());
			System.out.print("Guess the positive number that computer generates in the range of 0 to 100:  ");
			System.out.println(input);
	
			while(input_count<=5) {
				if(num > input) {
					System.out.println("The computer generated number is greater than the number you guessed!");
					input=g.count(input);
					}
					if(num == input) {
						op.guessed(g.score);
						System.exit(0);
						}
				else if(num<input){
						System.out.println("The computer generated number is lesser than the number you guessed!");
						input = g.count(input);
						}
				}
			if(input_count>5) 
				op.out_of_chances();	
	}
	catch(Exception e) {
		System.out.println("The input you entered is invalid!\n The error:"+e);
	}
}
}




