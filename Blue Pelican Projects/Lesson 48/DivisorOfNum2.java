// With Recursion!
// All the way down
// Max Integer I Could Get To: ~26.5 million without chaning allocation

// Un-Optimized Time: ~13.840s
// Optimized Time : ~13.828s
// Super Optimized Time : 0.00890 s

// Specs
// ------
// CPU: AMD Ryzen 5 2600x (6 cores) @ 3.20 GHz 3.42 GHz
//      About 10 months old
// Ram? If it has any impact: 16 GB of DDR4
// OS: Windows 10
import java.util.Scanner;

public class DivisorOfNum2
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        long n = kboard.nextLong();
        long halfN = n / 2;
        long d = 1;
        long sqrt = (long)Math.sqrt(n);
        System.out.println(sqrt);
        

        System.out.println("Which method would you like to see?: ");
        System.out.println("1. : Un-Optimized");
        System.out.println("2. : Optimized");
        System.out.println("3. : Super Optimized!");
        System.out.println("4 : Recursion");
        System.out.println("Please enter the integer corresponding to your choice!");
        System.out.print("Your Choice: ");

        int userInput = kboard.nextInt();

        switch(userInput)
        {
            case 1:
                UnOptimized(n,d);
                break;
            case 2:
                Optimized(n,d,halfN);
                break;
            case 3:
                superOptimized(n,d);
                break;
            case 4:
                recursion(n,d, sqrt);
                break;
            default:
                System.out.println("Bruh >:/");
                System.exit(0);
        }
    }

    public static void UnOptimized(long n, long d)
    {
        long start = System.nanoTime();

        do
        {
            if( n % d == 0 ) //test for divisibility by d
            {
                System.out.print(d + " ");
                d++;
            }
            else
                d++;
        }
        while( d <= n / 2 );

        System.out.print(n); 
        System.out.println(" ");

        long end = System.nanoTime();

        System.out.println("Elapsed Time: " + ((end - start)/1000000000.0) + "s");
    }

    public static void Optimized(long n, long d, long halfN)
    {
        long start = System.nanoTime();

        do
        {
            if( n % d == 0 ) //test for divisibility by d
            {
                System.out.print(d + " ");
                d++;
            }
                d++;
        }
        while( d <= halfN );

        System.out.print(n); 
        System.out.println(" ");

        long end = System.nanoTime();

        System.out.println("Elapsed Time: " + ((end - start)/1000000000.0) + "s");
    }

    public static void superOptimized(long n, long d)
    {
        long start = System.nanoTime();

        do
        {
            if( n % d == 0 ) //test for divisibility by d
            {
                System.out.print(d + " ");
                System.out.print(n/d + " ");
                d++;
            }
            else
                d++;
        }
        while(d <= Math.sqrt(n));
        System.out.println(" ");

        long end = System.nanoTime();

        System.out.println("Elapsed Time: " + ((end - start)/1000000000.0) + "s");
    }

    public static void recursion(long n, long d, long sqrt)
    {
        
        if (d > sqrt)
            return;
        else if(n%d == 0)
        {
            System.out.print(d + " ");
            System.out.print(n/d + " ");
            recursion(n, d+1,sqrt);
        }
        else
            recursion(n,d+1,sqrt);
    }
}



//7000000000
//2000000000