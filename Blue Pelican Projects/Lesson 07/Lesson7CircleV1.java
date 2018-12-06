import java.io.*; //make sure you import at the beginning
import java.util.*; 
public class Lesson7CircleV1 
{
    public static void main (String[] args)
    {
            Scanner SReader = new Scanner(System.in); //sets the scanner
            
            System.out.print("Do you have area or radius? "); //prints questions
            String answer1 = SReader.nextLine(); //scans next line
            if ( answer1.equals("area")) //conditional
            {
                    System.out.print("What is the area? \n");
                    double area2 = SReader.nextDouble();
                    System.out.print("The radius of the circle is: " + Math.sqrt(area2/Math.PI) + "\n");
                    
            }
            else if ( answer1.equals("radius"))
            {
                System.out.print("\nWhat is the radius? \n");
                int radius2 = SReader.nextInt();
                System.out.print("The area of the circle is: " + (radius2 * radius2) * Math.PI + "\n");
            }
            else
            {
                System.out.print("Invalid Input"); 
            }
            
            

        
    }
}