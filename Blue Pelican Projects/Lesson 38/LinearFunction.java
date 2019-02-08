public class LinearFunction
{
    private double Slope;
    private double YIntercept;
    
    public LinearFunction(double slope, double yIntc)
    {
        Slope = slope;
        YIntercept = yIntc;
    }
    public double getSlope()
    {
        return Slope;
    }

    public double getYintercept()
    {
        return YIntercept;
    }

    public double getRoot()
    {
        return (-YIntercept/Slope);
    }

    public double getYvalue(double x)
    {
        return (Slope*x+YIntercept);
    }

    public double getXvalue(double y)
    {
        return ((y-YIntercept)/Slope);
    }
}