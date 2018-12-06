import java.util.Arrays;

public class playGame
{
    private String[][] compGrid, userGrid;
    private String[] attackCoordinates = new String[2];
    private int ammo; 
    public playGame(int difficulty, String[][] botBoard)
    {
        compGrid = botBoard.clone();
        userGrid = botBoard.clone();

        switch (difficulty)
        {
            case (0):
                ammo = 999;
                break;
            case (1):
                ammo = 50;
                break;
            case (2):
                ammo = 30; 
                break;
            default:
                ammo = 999;
        }
    }

    public void action()
    {
        String fireCoordinates = JOptionPane.showInputDialog(null, "Please enter the column and row you would like to fire upon matey!", "Fire the Cannons", JOptionPane.PLAIN_MESSAGE);
        
        
    }

    public void gameIsDone()
    {
        while (!(boardIsClear()))
        {
            
        }

    }

    public boolean boardIsClear()
    {
        for (int i = 0; i<compGrid.length; i++)
        {
            for (int j = 0; j<compGrid.length; j++)
            {
                if (!(compGrid[i][j].equals("0")))
                    return false;
            }
        }
        return true;
    }
}