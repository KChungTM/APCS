import java.util.Scanner;

public class CountEmRight
{
    public static void main(String[] args)
    {
            Scanner kboard = new Scanner(System.in);
            int counter = 0;

            System.out.println("Type in a sentence and press Enter: ");
            String sentence = kboard.nextLine().toUpperCase();

            if (sentence.equals("EXIT"))
                System.exit(0);

            sentence = sentence + "TEXT EDITOR IS KING";

            String[] sp = sentence.split("S\\sA|SA");
            counter = sp.length-1;

            if (counter == 1)
                System.out.println("There is " + counter + " occurence.");
            else
                System.out.println("There are " + counter + " occurences.");
    }
}