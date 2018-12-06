import java.util.InputMismatchException;
import java.util.Scanner;


public class ChungKennedyEvenOrOdd {

    public static void main(String []args){
        Scanner integerCounter = new Scanner(System.in);
        try 
        {
        System.out.print("Enter an integer: ");
        int i = integerCounter.nextInt();
            if ((i % 2 <= -1) || (i % 2 >= 1))
            {
            System.out.print("The integer " + i + " is odd.");
            }
            else
            {
            System.out.print("The integer " + i + " is even.");
            }
        }
        catch(InputMismatchException e) {
            System.out.print("Please enter an integer...");
        }
     }
}
