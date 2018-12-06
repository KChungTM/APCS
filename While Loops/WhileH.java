import java.util.Scanner;

public class WhileH
{
    public static void main(String[] args)
    {
            Scanner kboard = new Scanner(System.in);
            
            System.out.println("Please enter an integer: ");
            int num = kboard.nextInt();
            int i = 1;
            int sum = 0;

            while (i < num)
            {
                if (num % i == 0)
                {
                    sum = sum + i;
                    i++;
                }
                else 
                {
                    i++;
                }
            }
            
            if (sum == num)
                System.out.println(num + " is a perfect number.");
            else
                System.out.println(num + " is not a perfect number.");
    }
}