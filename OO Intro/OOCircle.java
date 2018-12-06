public class OOCircle
{
    public static void main( String args[] )
    {
        Circle cir1 = new Circle(35.5);
        System.out.println( cir1.diameter()); // should give 71.0 as the answer.
    }   
}

class Circle
{
    public double radius;

    public Circle(double r) //method to set radius to value passed
    {
        radius = r;
    }

    public double diameter() //diameter method
    {
        double diameter;
        diameter = radius * 2;
        return diameter;
    }
}