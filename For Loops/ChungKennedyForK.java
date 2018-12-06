import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
    
        try
        {
            System.out.println("\n__________________________________________________\nWelcome to the Greatest Common Divisor Calculator!");
            Thread.sleep(800);
            System.out.println("\n__________________________________________________\nOr GCD for short :))\n__________________________________________________");
            Thread.sleep(800);
        }
        catch (InterruptedException e)
        {
            System.out.println("Yikes");
        }
        calculator();
    }

    public static void calculator()
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter the first integer: ");
        int firNum = kboard.nextInt();
        System.out.println("Please enter the second integer: ");
        int secNum = kboard.nextInt();
        kboard.nextLine();
        int GCD = 0;

        for (int i = 1; i < (firNum+secNum)/2; i++)
        {

            if ((firNum % i) == 0 && (secNum % i) == 0)
                GCD = i;

        }

        System.out.println("\nBoom Shacka Lacka Greatest Common Divisor is: " + GCD);

        System.out.println("\nDo you want to see me do it again?");
        String answer = kboard.nextLine();

        if (answer.contains("yes") || answer.contains("Yes"))
        {
            System.out.println("");
            calculator();
        }
        else
        {
            System.out.println("Fine then :(");
            System.exit(0);
        }
    }
}