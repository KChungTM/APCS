import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;

//Notes:
//  1.add ASCII ship || System.out.println().
//  2. Learn to add an icon to the JOptionPane.

public class Tester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        String[] difficulty = {"Easy","Medium", "Hard", "Exit"};
        int difficultyInt = JOptionPane.showOptionDialog(null,"Welcome to Battleship! The game of bullshit luck!\nPlease enter a difficulty: Easy, Medium, or Hard","Battleship", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, difficulty, difficulty[0]);
        
        switch (difficultyInt)
        {
            case (0):
                System.out.println("Pshhh picking easy? Wuss...");
                break;
            case (1):
                System.out.println("I respect it...");
                break;
            case (2):
                System.out.println("Now we got a big baller...");
                break;
            case (3):
                System.out.println("Welp ok... guess you're too chicken...");
                System.exit(0);
        }
        
        initGrid game = new initGrid();

        game.setAllBoat();
        
    }
}