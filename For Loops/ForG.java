import java.util.Scanner;

public class ForG
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        
        System.out.println("Please enter the first integer: ");
        int firstNum = kboard.nextInt();
        System.out.println("Please enter the second integer: ");
        int secondNum = kboard.nextInt();

        int total, evenCount, oddCount;
        total = evenCount = oddCount = 0;

        for (int i = firstNum; i <= secondNum; i++)
        {

            if (i % 2 == 0)
                evenCount++;
            else
                oddCount++;
            
                total = i + total;
        }
        System.out.println("total " + total + "\nEven Count " + evenCount + "\nOdd Count " + oddCount);
    }
}

