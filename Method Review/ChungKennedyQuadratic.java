public class ChungKennedyQuadratic
{
    public static void main(String[] args)
    {
        try
        {
            double a = Double.parseDouble(args[0]); // gets the a,b,c values from the Shell Args
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            
            double [] roots = quadratic(a, b, c);
            String root1 = ""+ roots[0];
            String root2 = "" + roots[1];

            if (root1.equals("NaN"))
                root1 = "Imaginary Number";
            if (root2.equals("NaN"))
                root2 = "Imaginary Number";

            System.out.println("The roots are: " + root1 + ", " + root2); //defines what to print
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter like this: java ChungKennedyQuadratic \"a\" + \"b\" + \"c\"");
        }
          
    }
    public static double[] quadratic(double a, double b, double c)
    { 
        double [] roots = new double[2]; // array for the roots

        double sqrtRoot = Math.sqrt(Math.pow(b, 2) - (4 * a * c)); //radical

        roots[0] = ((-b + sqrtRoot) / (2 * a)); //addition
        roots[1] = ((-b - sqrtRoot) / (2 * a)); //substraction 

        return roots; //returns roots array
    }
}
