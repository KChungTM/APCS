import java.util.Arrays;

public class initGrid
{
    private String[][] board = new String[10][10];
    private int boatLength;
    private int xCords;
    private int yCords;
    private boolean vertical;

    public initGrid()
    {
        for (String[] row: board)
			Arrays.fill(row, "0");

        for (int i = 0; i<board.length; i++)                        //sets the top row
                    board[0][i] = (char)(64 + i) + ""; 
            for (int i = 1; i<board.length; i++)                   //sets number row
            board[i][0] = i + "";	
                        
        boatLength = 6;
	
	    setAllBoat();	
    }

    public void setAllBoat()
    {
        while (boatLength>1)
        {
            placeBoats();
            /*
            printBoard();
            System.out.println("");
            */
            boatLength--;
        }
    }

    private void placeBoats()
    {
        xCords = (int)(Math.random()*10);
        yCords = (int)(Math.random()*10);
        randomizeDirection();

        while (!hasSpace())
        {
            xCords = (int)(Math.random()*10);
            yCords = (int)(Math.random()*10);
            randomizeDirection();
        }

        if (vertical)
        {
            for (int i = 0; i < boatLength; i++)
                board[yCords+i][xCords] = boatLength + "";
        }
        else if (!vertical)
        {
            for (int i = 0; i < boatLength; i++)
                board[yCords][xCords+i] = boatLength + "";
        }

        //Initially used placeBoats() within itself
        /*
        if (hasSpace())
        {
            if (vertical)
            {
                for (int i = 0; i < boatLength; i++)
                    board[yCords+i][xCords] = boatLength + "";
            }
            else if (!vertical)
            {
                for (int i = 0; i < boatLength; i++)
                    board[yCords][xCords+i] = boatLength + "";
            }
        }
        else
        {
            placeBoats();
        }
        */
    }

    private boolean hasSpace()
    {
        if (yCords + boatLength > board.length-1 || xCords + boatLength > board.length-1)
                return false;
        else
        {
            if (vertical)
            {
                for (int i = 0; i < boatLength; i++)
                {
                    if (!(board[yCords+i][xCords].equals("0")))
                    return false;
                }
            }
            else if (!vertical)
            {
                for (int i = 0; i < boatLength; i++)
                {
                    if (!(board[yCords][xCords+i].equals("0")))
                        return false;
                }
            }
        }
        return true;
    }

    private void randomizeDirection()
    {
        if (Math.random()>0.5)
            vertical = true;
        else
            vertical = false;
    }

    public void printBoard()
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

    public String[][] getBoard()
    {
        return board;
    }
}
