import java.io.File;
import java.text.NumberFormat;
import java.util.Scanner;

public class NumberDoublerV2
{
    public static void main(String[] args) throws Exception
    {
        File textFile = new File("sampleText.txt");
        Scanner kboard = new Scanner(textFile);

        //System.out.print("Please enter a sentence w/ numerical values: ");
        //String input = kboard.nextLine();

        /*
        if (input.toUpperCase().equals("EXIT"))
        {
            System.out.println("Bye bye");
            System.exit(0);
        }
        */

        String input = "null";

        while (kboard.hasNextLine())
        {
            input = kboard.nextLine();
            System.out.println(input);
        }

        //String input = "i eat 8 bread";

        String[] sentence = input.split("(?<=[\\D+])|(?=[\\D+])");

        for(String word : sentence)
            {
                try
                {
                    word = Integer.parseInt(word)*2 + "";
                    System.out.print(word + " ");
                }
                catch(NumberFormatException e)
                {
                    System.out.print(word + " ");
                }
            }
    }
}