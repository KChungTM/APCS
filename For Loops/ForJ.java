import java.util.Scanner;

public class ForJ
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter a binary value: ");
        long binary = kboard.nextLong();
        long sum = 0;

        for (int i = 0; binary > 0; i++) // i represents the power
        {
           sum = (long)(sum + (binary % 10)*Math.pow(2, i)); // Finds the place and multiplies by power of 2. Then goes onto the next place over and repeats
           binary = binary / 10; // Then goes onto the next place over and repeats
        }
        System.out.println(sum);
    }
}
