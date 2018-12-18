import java.text.NumberFormat;
import java.util.Scanner;

public class NumberDoubler
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.print("Please enter a sentence w/ numerical values: ");
        String input = kboard.nextLine();

        if (input.toUpperCase().equals("EXIT"))
        {
            System.out.println("Bye bye");
            System.exit(0);
        }

        //String input = "i eat 8 bread";

        String[] sentence = input.split("\\W+");

        for (int i = 0; i<sentence.length; i++)
            System.out.println(sentence[i]);

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