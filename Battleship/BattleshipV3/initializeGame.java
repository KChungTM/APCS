import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;

//Notes:
//  1.add ASCII ship || System.out.println().
//  2. Learn to add an icon to the JOptionPane.

public class initializeGame
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        String[] difficultyOptions = {"Easy","Medium", "Hard", "Exit"};
        int difficulty = JOptionPane.showOptionDialog(null,"Welcome to Battleship! The game of bullshit luck!\nPlease enter a difficulty: Easy, Medium, or Hard","Battleship", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, difficultyOptions, difficultyOptions[0]);
        
        switch (difficulty)
        {
            case (0):
                System.out.println("Pshhh picking easy? Wuss...\n");
                break;
            case (1):
                System.out.println("I respect it...\n");
                break;
            case (2):
                System.out.println("Now we got a big baller...\n");
                break;
            case (3):
                System.out.println("Welp ok... guess you're too chicken...\n");
                System.exit(0);
        }
        initGrid compGrid = new initGrid();
        playGame newGame = new playGame(difficulty, compGrid.getBoard());

        
    }
}