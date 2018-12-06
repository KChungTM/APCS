import java.util.InputMismatchException;
import java.util.Scanner;


public class ChungKennedyEvenOrOddV2 {

    public static void main(String []args){
        Scanner integerCounter = new Scanner(System.in);

        int meme = 0; // sets the loop control 
        while(meme < 3) //does the following until meme <3 :D
        {
            try //tries the following
            {
            System.out.print("Enter an integer: ");
            int i = integerCounter.nextInt();
                if ((i % 2 <= -1) || (i % 2 >= 1))
                {
                System.out.println("The integer " + i + " is odd.\n");
                }
                else
                {
                System.out.println("The integer " + i + " is even.\n");
                }
            }
            catch(InputMismatchException e) //used to catch error
            {
                System.out.println("Please enter an integer...");
                break; //breaks the program if an invalid input is input
            }
            meme = meme + 1; //increment to close loop
            
        } //close while loop
     } // close main
} // close class