package snakeladderproblem;

import java.util.Random;

public class UC3 {

	public static void main(String[] args) {
		int playerOnePosition = 0;
		System.out.println("The initial position of player one is: " + playerOnePosition);
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		System.out.println("Dice roll: " + dice);
		int playerOption = random.nextInt(3);
		System.out.print("The generated option is: ");
		{
			if (playerOption == 0)
				System.out.print("No Play.");
			else if (playerOption == 1)
				System.out.print("Ladder.");
			else
				System.out.print("Snake.");
		}
		System.out.println("");
		switch (playerOption) {
		case 0:
			dice = 0;
			playerOnePosition = playerOnePosition + dice;
			System.out.println("Player one position: " + playerOnePosition);
			break;
		case 1:
			playerOnePosition = playerOnePosition + dice;
			System.out.println("Player one position: " + playerOnePosition);
			break;
		default:
			playerOnePosition = playerOnePosition - dice;
			if (playerOnePosition < 0)
				playerOnePosition = 0;
			else
				System.out.println("Player one position: " + playerOnePosition);
		}
	}
}
