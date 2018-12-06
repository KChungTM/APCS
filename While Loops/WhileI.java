import java.util.Scanner;

public class WhileI 
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = kboard.nextInt();
        System.out.println("Please enter a base: ");
        int base = kboard.nextInt();
        String value = "";
        String[] hex = {"A", "B","C","D","E","F"}; 

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
        System.out.println(value);
    }
}