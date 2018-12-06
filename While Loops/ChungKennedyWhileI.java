import java.util.Scanner;

public class ChungKennedyWhileI 
{
    public static void main(String[] args)
    {
        
        try
        {
            System.out.println("\n__________________________________________________\nWelcome to the Decimal to Any Base Converter!");
            Thread.sleep(800);
            System.out.println("\n__________________________________________________\nLess than a base of 16 though of course... :))\n__________________________________________________");
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

        System.out.println("Please enter an integer: ");
        int num = kboard.nextInt();
        System.out.println("Please enter a base: ");
        int base = kboard.nextInt();
        String value = "";
        String[] hex = {"A", "B","C","D","E","F"}; 

        if (base == 1)
            System.out.println("The value is: " + num);
        else
        {

            while (num > 0)
            {

                if ((num % base) > 9)
                {
                    value = hex[(num % base) - 10] + value;
                    num = num / base; 
                }
                else
                {
                value = (num % base) + value;
                num = num / base;
                }

            }
            System.out.println("The value is: " + value);
        }

        if (kboard.hasNextLine())
        {
            System.out.println("\n__________________________________________________\nNow you wanna see me do it again? :D\nYes or No?\n__________________________________________________");
            String answer = kboard.next();
            
            if (answer.equals("Yes") || answer.equals("yes"))
            {
                calculator();
            }
            else
            {
                System.out.println("\nWelp ok :( ");
                System.exit(0);
            }
        }
        
        kboard.close();
    }
}


