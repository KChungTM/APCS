
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		playChoice = player.toUpperCase();
		compChoice = ((int)(Math.random()*3))+"";

		switch(compChoice)
		{
			case("0"):
				compChoice = "R";
				break;
			case("1"):
				compChoice = "P";
				break;
			case("2"):
				compChoice = "S";
				break;
		}
	}

	public String determineWinner()
	{
		String winner="";

		if (playChoice.equals(compChoice))
			return ("!Draw Game!");

		switch(playChoice)
		{
			case("R"):
				if (compChoice.equals("P"))
					winner = ("!Computer wins <<Paper Covers Rock>>");
				else if (compChoice.equals("S"))
					winner = ("!Player wins <<Rock Crushes Scissors>>");
				break;
			case("P"):
				if (compChoice.equals("S"))
					winner = ("!Computer wins <<Scissors Cut Paper>");
				else if (compChoice.equals("R"))
					winner = ("!Player wins <<Paper Covers Rock>>");
				break;
			case("S"):
				if (compChoice.equals("R"))
					winner = ("!Computer wins <<Rock Crushes Scissors>");
				else if (compChoice.equals("P"))
					winner = ("!Player wins <<Scissors Cuts Paper>>");	
				break;
			case(""):
				winner = ("Please enter a choice next time!");
				break;						
		}
		return winner;
	}

	public String toString()
	{
		String output;

		output = "Player had " + playChoice.toUpperCase() + "\nComp had " + compChoice;
				
		return output;
	}
}

