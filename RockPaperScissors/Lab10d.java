import java.util.Scanner;

public class Lab10d
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		RockPaperScissors game;
		String userRestart; 

		while(true)
		{
			System.out.print("\nRock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			game = new RockPaperScissors(kboard.nextLine());
			System.out.println(game.toString());
			System.out.println(game.determineWinner());
			
			System.out.print("\nDo you want to play again?\nPlease enter either \"Y\" or \"N\": ");

			userRestart = kboard.nextLine().toLowerCase();

			if (userRestart.equals("n"))
				break;
			else if(!userRestart.equals("y"))
				System.out.println("Welp your gonna play again :))\n");
		}
		System.out.println("See you again next time!\n");
	}
}
