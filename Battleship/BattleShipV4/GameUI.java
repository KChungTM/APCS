import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class GameUI  						// class used to 
{
	private String[][] displayBoard;
	private int shipNumber;

	public GameUI()
	{
		displayBoard = new String[10][10];

		for (String[] row: displayBoard) 			// fills board with blanks
			Arrays.fill(row, " ");
		for (int i = 0; i<displayBoard.length; i++)                        //sets the top row
            		displayBoard[0][i] = (char)(64 + i) + ""; 
        	for (int i = 1; i<displayBoard.length; i++)                        //sets number row
			displayBoard[i][0] = i + "";
		
		shipNumber = 2;
	}

	public void updateBoard(String[][] compGrid, int ammo)	//prints the FULL display
	{	
		System.out.println("Reminder: \"O's\"= Miss & \"X's\"= Hit");				
		printBoard(compGrid);						//prints display
		System.out.println("\nAmmo: " + ammo);
		printShipClear(compGrid);					//bottom row
		
	}

	private void printShipClear(String[][] compGrid)
	{
		System.out.println("Destroyed Ships\n------------------");
		for (int i = 2; i< 7; i++) 		// 6 is max length (maybe implement it as .length later?)
		{
			System.out.print("[");
		
			if (isXShipClear(compGrid, i))
				System.out.print("X");
			else
				System.out.print(" ");
			System.out.print("]");

			switch (shipNumber)
			{
				case(2) :
					System.out.print(" Destroyer");
					break;
				case(3) :
					System.out.print(" Submarine");
					break;
				case(4) :
					System.out.print(" Cruiser");
					break;
				case(5) :
					System.out.print(" Battleship");
					break;
				case(6) :
					System.out.print(" Carrier");
					break;
			}
			System.out.print("\n");
			shipNumber++;
		}
		System.out.println(); //spacer

		/*
		System.out.print("[");
		if (isXShipClear())
			System.out.print("X");
		else
			System.out.print(" ");
		System.out.print("]/t[>");

		System.out.print("[");
		if (isXShipClear())
			System.out.print("X");
		else
			System.out.print(" ");
		System.out.print("]/t[=>");

		System.out.print("[");
		if (isXShipClear())
			System.out.print("X");
		else
			System.out.print(" ");
		System.out.print("]/t[==>");

		System.out.print("[");
		if (isXShipClear())
			System.out.print("X");
		else
			System.out.print(" ");
		System.out.print("]/t[===>");

		System.out.print("[");
		if (isXShipClear())
			System.out.print("X");
		else
			System.out.print(" ");
		System.out.print("]/t[====>");
		*/
			
		shipNumber = 2;	
	}

	private boolean isXShipClear(String[][] compGrid, int shipLength)
	{
		for (int i =1; i<compGrid.length;i++)
        	{
		    	for (int j = 1; j<compGrid.length;j++)
		    	{
		        	if (compGrid[i][j].equals(shipLength + ""))
					return false;
		    	}
		}
		return true;	
	}
	

	public void printBoard(String[][] compGrid)
   	{
        	for (int i =0; i<displayBoard.length;i++)
        	{
		    	for (int j = 0; j<displayBoard.length;j++)
		    	{
					if (i > 0 && j > 0 && Integer.parseInt(compGrid[i][j]) == 1)
						System.out.print("[X]"); 
					else if (i > 0 && j > 0 && Integer.parseInt(compGrid[i][j]) == 9)
						System.out.print("[O]");
					else
						System.out.print("[" + displayBoard[i][j] + "]");
		    	}
            	System.out.println("");
        	}
    }	
}
