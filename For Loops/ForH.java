import java.util.Scanner;

public class ForH
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("PLease enter an integer: ");
        int num = kboard.nextInt();
        long sum = 1;

        for (int i = num ; i > 0; i--)
            sum = sum * i;
        
        System.out.println("Factorial of " + num + " is " + sum);
    }
}