import java.util.Arrays;
import javax.swing.JOptionPane;

public class playGame
{
    private String[][] compGrid;
    private String[] attackCoordinates = new String[2];
    private int ammo;
    private String[] hitSayings;
    private String[] missSayings;
    private int randomIndex;

    public playGame(int difficulty, String[][] botBoard)
    {
        compGrid = botBoard;

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

        hitSayings = new String[]   {"Ouchie...",
                                    "Hmm maybe you do know how to play the game...",
                                    "Welp you got me there :(",
                                    "Please... no more :((",
                                    "Hit me baby one more time"
                                    };
        missSayings = new String[] {"Good one chief",
                                    "Guess again :D",
                                    "Guess I'm not the only bot here...",
                                    "Here's a gold star for effort buddy :)",
                                    "Not even close baby!"
                                    };
    }

    public int getAmmo()
    {
        return ammo;
    }

    public void action()
    {
        try
        {
            String fireCoordinates = JOptionPane.showInputDialog(null, "Please enter the column and row you would like to fire upon matey!", "Fire the Cannons",JOptionPane.YES_NO_OPTION);
            
            attackCoordinates = fireCoordinates.split("");

            switch (attackCoordinates[0].toUpperCase())
            {
                case("A"):
                    attackCoordinates[0] = "1";
                    break;
                case("B"):
                    attackCoordinates[0] = "2";
                    break;
                case("C"):
                    attackCoordinates[0] = "3";
                    break;
                case("D"):
                    attackCoordinates[0] = "4";
                    break;
                case("E"):
                    attackCoordinates[0] = "5";
                    break;
                case("F"):
                    attackCoordinates[0] = "6";
                    break;
                case("G"):
                    attackCoordinates[0] = "7";
                    break;
                case("H"):
                    attackCoordinates[0] = "8";
                    break;
                case("I"):
                    attackCoordinates[0] = "9";
                    break;
                default:
                    action();
            }
        }
        catch (NullPointerException e)
        {
            System.exit(0);
        }
        /*
        attackCoordinates = fireCoordinates.split("");

            switch (attackCoordinates[0].toUpperCase())
            {
                case("A"):
                    attackCoordinates[0] = "1";
                    break;
                case("B"):
                    attackCoordinates[0] = "2";
                    break;
                case("C"):
                    attackCoordinates[0] = "3";
                    break;
                case("D"):
                    attackCoordinates[0] = "4";
                    break;
                case("E"):
                    attackCoordinates[0] = "5";
                    break;
                case("F"):
                    attackCoordinates[0] = "6";
                    break;
                case("G"):
                    attackCoordinates[0] = "7";
                    break;
                case("H"):
                    attackCoordinates[0] = "8";
                    break;
                case("I"):
                    attackCoordinates[0] = "9";
                    break;
            }
                */
        //randomIndex = randomIndex = (int)((Math.random() * 5));

        if (compGrid[Integer.parseInt(attackCoordinates[1])][Integer.parseInt(attackCoordinates[0])].equals("0"))
        {
            JOptionPane.showMessageDialog(null, missSayings[randomIndex],"Firing the Cannons!", JOptionPane.PLAIN_MESSAGE);
            compGrid[Integer.parseInt(attackCoordinates[1])][Integer.parseInt(attackCoordinates[0])] = "9";
        }
        else if  (compGrid[Integer.parseInt(attackCoordinates[1])][Integer.parseInt(attackCoordinates[0])].equals("1") || compGrid[Integer.parseInt(attackCoordinates[1])][Integer.parseInt(attackCoordinates[0])].equals("9") )
        {    
            JOptionPane.showMessageDialog(null, "Hey! You already shot there! >:(","Firing the Cannons!",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, hitSayings[randomIndex],"Firing the Cannons!",  JOptionPane.PLAIN_MESSAGE);
            compGrid[Integer.parseInt(attackCoordinates[1])][Integer.parseInt(attackCoordinates[0])] = "1";
        }

        ammo--;
    }


    public boolean boardIsClear()
    {
        for (int i = 1; i<compGrid.length; i++)
        {
            for (int j = 1; j<compGrid.length; j++)
            {
                if (Integer.parseInt(compGrid[i][j]) > 1 && Integer.parseInt(compGrid[i][j]) < 9)
                    return false;
            }
        }
        return true;
    }

    public void printBoard()
    {
        for (int i =0; i<compGrid.length;i++)
        	{
		    	for (int j = 0; j<compGrid.length;j++)
		    	{
		        	System.out.print("[" + compGrid[i][j] + "]");
		    	}
            	System.out.println("");
        	}
    }
}
