import java.util.Scanner;

public class ForE
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Please enter an integer: ");
        int num = kboard.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            if (i == 10)
                System.out.println(i + "   " + (num *i));
            else
                System.out.println(i + "    " + (num *i));
        }
    }
}