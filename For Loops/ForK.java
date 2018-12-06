import java.util.Scanner;

public class ForK
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter the first integer: ");
        int firNum = kboard.nextInt();
        System.out.println("Please enter the second integer: ");
        int secNum = kboard.nextInt();
        int GCD = 0;

        for (int i = 1; i < (firNum+secNum)/2; i++)
        {
            if ((firNum % i) == 0 && (secNum % i) == 0)
                GCD = i;
        }
        System.out.println("\nThe Greatest Common Divisor is: " + GCD);
    }
}