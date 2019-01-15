import java.util.Scanner;

public class Lab10d
{
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		RockPaperScissors game;

		while(true)
		{
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			game = new RockPaperScissors(kboard.nextLine());
			System.out.println(game.toString());
			System.out.println(game.determineWinner());
			
			System.out.print("Do you want to play again?: ");
			if (kboard.nextLine().toLowerCase().contains("n"))
				break;
		}
		System.out.println("See you again next time!");
	}
}
