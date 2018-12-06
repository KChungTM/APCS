import java.util.Arrays;

import javafx.scene.transform.Rotate;

public class Battleship
{
	private String[][] board = new String[10][10];
	private int boatLength;
	private int xCords;
	private int yCords;
	private boolean vertical;

	public Battleship()
	{
		for (String[] row: board)
			Arrays.fill(row, "0");

		for (int i = 0; i<board.length; i++)                        //sets the top row
            		board[0][i] = (char)(64 + i) + ""; 
        for (int i = 1; i<board.length; i++)                        //sets number row
					board[i][0] = i + "";	
					
		boatLength = 5;
	}

	public void boatsAreSet()
	{
		while (boatLength>1)
		{
			generateBoats();
			
			printBoardT();
			System.out.println("");
		
			boatLength--;
		}
	}

	private void setCords()								//method to get coordinates for b
	{
		xCords = (int)(Math.random()*10);
		yCords = (int)(Math.random()*10);
	}

	private void generateBoats()
	{
			while(!(xCords>0&&yCords>0))
			setCords();

			if (Math.random() < 0.5)
				vertical = true;
			else
				vertical = false;
					
			if (!hasSpace())
			{
				generateBoats();
			}
			else
			{
				if (vertical)
				{
					for (int i = boatLength; i > 0; i--)
						board[yCords+i][xCords] = boatLength + "";
				}
				else if (!vertical)
				{
					for (int i = boatLength; i > 0; i--)
						board[yCords][xCords+i] = boatLength + "";
				}
			}
	}

	private boolean hasSpace()
	{
		if (vertical)
		{
			if (yCords + boatLength > board.length)
				return false;
			else
			{
				for (int i = boatLength; i < 0; i--)
				{
					if (!(board[yCords+i][xCords].equals("0")))
						return false;
				}
			}
		}
		else if (!vertical)
		{
			if (xCords + boatLength > board.length)
				return false;
			else
			{
				for (int i = boatLength; i < 0; i--)
				{
					if (!(board[yCords][xCords+i].equals("0")))
						return false;
				}
			}
		}
		return true;
	}
	

	public void printBoardT()
   	{
        	for (int i =0; i<board.length;i++)
        	{
            		for (int j = 0; j<board.length;j++)
            		{
                		System.out.print("[" + board[i][j] + "]");
            		}
            		System.out.println("");
        	}
    }
}
