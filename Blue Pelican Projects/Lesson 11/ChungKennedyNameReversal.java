import java.util.Scanner;
public class ChungKennedyNameReversal
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String name = kboard.nextLine();

        for (int substringCounter = name.length(); substringCounter >= 1; substringCounter = substringCounter - 1)
            System.out.print(name.substring(substringCounter-1, substringCounter).toLowerCase());

    } // end of main method
} // end of class