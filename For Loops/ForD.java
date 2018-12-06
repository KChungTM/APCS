import java.util.Scanner;

public class ForD
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Please enter an integer: ");
        int num = kboard.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i + "    " + (num *i));
        }
    }
}