import java.util.Scanner;

public class ForI
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int num = kboard.nextInt();

        if (num <= 0)
        {
            System.out.println("Number is not prime.");
            System.exit(0);
        }
        else
        {
            for (int i = 2; i <= num/2; i++)
            {
                if (num % i == 0)
                {
                    System.out.println("Number is not prime.");
                    System.exit(0);
                }
                    
            }
        }
        System.out.println("Number is prime.");
    }
}