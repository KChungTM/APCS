import java.io.*; //make sure you import at the beginning
import java.util.*; 
public class Lesson7Circle 
{
    public static void main (String[] args)
    {
            Scanner areaOfCircle = new Scanner(System.in);
            Scanner radiusOfCircle = new Scanner(System.in);

            System.out.print("What is the area? ");
            double area = areaOfCircle.nextInt();
            System.out.print("The radius of the circle is: " + Math.sqrt(area/Math.PI));
    }





}