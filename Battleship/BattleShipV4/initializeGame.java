import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;
//import javax.swing.ImageIcon;
//import javax.swing.Icon;
//import java.io.IOException;

//Notes:
//  1.add ASCII ship || System.out.println().
//  2. Learn to add an icon to the JOptionPane.
public class initializeGame
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);


        //prompts user for difficulty that changes the amount of attempts
        String[] difficultyOptions = {"Easy","Medium", "Hard", "Exit"};
        int difficulty = JOptionPane.showOptionDialog(null,"Welcome to Battleship! The game of luck!\nPlease enter a difficulty: Easy, Medium, or Hard","Battleship", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, difficultyOptions, difficultyOptions[0]);
        
        int cheat = JOptionPane.showConfirmDialog(null, "Would you like to enable cheats?", "Cheat Codes", JOptionPane.YES_NO_OPTION);

        if (cheat == 0)
            JOptionPane.showMessageDialog(null, "Bok Bok... I hear a chicken >:))");

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

        //initializes the random grid for boats
        initGrid compGrid = new initGrid(); //sets board up (class is done)

        //sets up new game 
        playGame newGame = new playGame(difficulty, compGrid.getBoard());

        //creats display object
	    GameUI display = new GameUI();

        
        while(!newGame.boardIsClear())
        {
            if (cheat == 0)
                newGame.printBoard();

            display.updateBoard(compGrid.getBoard(), newGame.getAmmo());
            newGame.action();
            if (newGame.getAmmo() == 0)
            {
                JOptionPane.showMessageDialog(null, "Welp you're out of ammo...", "Game Over", JOptionPane.INFORMATION_MESSAGE); 
                System.exit(0); 
            }     
        }

        JOptionPane.showMessageDialog(null, "Congrats on beating the bot :))", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        


	//GameUI displayBoard = new GameUI();

	//while(!newGame.boardIsClear())
	//{
		
	//}
	
    }
}
