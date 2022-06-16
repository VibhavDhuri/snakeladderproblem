package snakeladderproblem;

import java.util.Random;

public class UC2 {
	public static void main(String[] args) {
		int playerOnePosition = 0;
		System.out.println("The initial position of player one is: " + playerOnePosition);
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		System.out.println("Dice roll: " + dice);
	}
}