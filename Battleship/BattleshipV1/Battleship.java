import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class Battleship
{ 
    private char[][] board = new char[8][8];
    private int moves;

    public Battleship(int difficulty)
    {
        int length = 2;
        for (int i = 1; i<board.length; i++)                        //sets the top row
            board[0][i] = (char)(64 + i); 
        for (int i = 1; i<board.length; i++)                        //sets number row
            board[i][0] = (char)(48 + i);

        while(!allShipsSet())
        {
            setBoat(length);
        }
        printBoardT();
    }

    private void setBoat(int length)
    {
        int row = (int)(Math.random()*(7))+1;
        int column = (int)(Math.random()*(7))+1;
        if (hasSpaceDown(length, column, row))
        {
            for (int i = 0; i<length; i++)
                board[row-i][column] = (char)length;
        }
        else if (hasSpaceUp(length, column, row))
        {
            for (int i = 0; i<length; i++)
                board[row+i][column] = (char)length;
        }
        else if (hasSpaceRight(length, column, row))
        {
            for (int i = 0; i<length; i++)
                board[row][column+i] = (char)length;
        }
        else if (hasSpaceLeft(length, column, row))
        {
            for (int i = 0; i<length; i++)
                board[row][column-i] = (char)length;
        }
    }

    private boolean hasSpaceDown(int length, int column, int row)
    {
        for (int i = 0; i<length;i++)
        {
            try
            {
                if (board[row-i][column] > 1)
                    return false;
            }
            catch (IndexOutOfBoundsException e)
            {
                return false;
            }
        }
        return true;
    }

    private boolean hasSpaceUp(int length, int column, int row)
    {
        for (int i = 0; i<length;i++)
        {
            try
            {
                if (board[row+i][column] > 1)
                    return false;
            }
            catch (IndexOutOfBoundsException e)
            {
                return false;
            }
        }
        return true;
    }

    private boolean hasSpaceRight(int length, int column, int row)
    {
        for (int i = 0; i<length;i++)
        {
            try
            {
                if (board[row][column+i] > 1)
                    return false;
            }
            catch (IndexOutOfBoundsException e)
            {
                return false;
            }
        }
        return true;   
    }

    private boolean hasSpaceLeft(int length, int column, int row)
    {
        for (int i = 0; i<length;i++)
        {
            try
            {
                if (board[row][column-i] > 1)
                    return false;
            }
            catch (IndexOutOfBoundsException e)
            {
                return false;
            }
        }
        return true;
    }

    private void action()                                           //does an action
    {
        String column = JOptionPane.showInputDialog(null, "Please enter the column you would like to fire upon matey!", "Fire the Cannons", JOptionPane.PLAIN_MESSAGE);
        int row = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the row to fire upon matey!", "Fire the Cannons", JOptionPane.PLAIN_MESSAGE));

        try
        {
            
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Arghh! Enter a valid space you blabbering landlubber!" , "Error", JOptionPane.ERROR_MESSAGE);
            action();
        }
    }

    

    private void printBoard()                                       //prints entire board                                    
    {
        for (int i = 0; i<board.length;i++)
        {

            for (int j = 0; j<board.length; j++)                    //not board[j] bc their is not 7th index in the board array
            {
                if (board[i][j] > 40)
                    System.out.print("[" + board[i][j] + "]");
                else if (board[i][j] == -1)                         //if a boat is hit set value to -1
                    System.out.print("[X]");
                else
                    System.out.print("[ ]");
            }
            System.out.println("");
        }
    }

    public boolean gameIsDone()                                    //checks the board to see if there are any values not acceptable
    {
        for (int i = 0; i<board.length; i++)
        {
            for (int value: board[i])
            {
                if (value > 0)
                    return false;
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

    private boolean allShipsSet()
    {
        for (int i =0; i<board.length;i++)
        {
            for (int j = 0; j<board.length;j++)
            {
                if (board[i][j] > 0)
                    return false;
            }
        }
        return true;
    }

    public void playGame()                                          //loops to ask for command until clear
    {
        while(!gameIsDone())
        {

        }
    }
}