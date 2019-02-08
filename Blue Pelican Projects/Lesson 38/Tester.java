import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);

        System.out.print("What is the slope of your line? ");
        double slope = kbReader.nextDouble( );

        System.out.print("What is the y-intercept of your line? ");
        double yIntc = kbReader.nextDouble( );

        LinearFunction line = new LinearFunction(slope, yIntc);

        System.out.println("\nSlope of this line is: " + line.getSlope( ));
        System.out.println("Y-intercept of this line is: " + line.getYintercept( ));
        System.out.println("Root of this line is: " + line.getRoot( ));

        System.out.print("\nWhat is an x value for which you wish to solve for y? ");
        double x = kbReader.nextDouble( );

        double yValue = line.getYvalue(x);

        System.out.println("The y value corresponding to x = " + x + " is " + yValue);

        System.out.print("\nWhat is a y value for which you wish to solve for x? ");
        double y = kbReader.nextDouble( );
        
        double xValue = line.getXvalue(y);
        
        System.out.println("The x value corresponding to y = " + y + " is " + xValue);
    }
}