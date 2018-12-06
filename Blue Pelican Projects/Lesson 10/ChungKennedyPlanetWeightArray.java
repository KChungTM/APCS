import java.util.Scanner;

public class ChungKennedyPlanetWeightArray
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Hey there! Want to know your weight on other planets?! :D");
        String answer = kboard.nextLine();

        if (answer.contains("yes") || answer.contains("Yes"))
            calculator();
        else
        {
            try
            {
                System.out.println("Umm wasn't really expecting that answer...");
                Thread.sleep(1000);
                System.out.println("I'll just um... exit now...");
                Thread.sleep(1000);
                System.out.println("Bye...");
                System.exit(0);
            }
            catch (InterruptedException e)
            {
                System.exit(0);
            }
        }    
    }

    public static void calculator()
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("    1. Mercury  ");
        System.out.println("    2. Venus  ");
        System.out.println("    3. Mars  ");
        System.out.println("    4. Jupiter  ");
        System.out.println("    5. Saturn  ");
        System.out.println("    6. Uranus  ");
        System.out.println("    7. Neptune  ");
        System.out.println("----------------\n Which planet do you want to check?: ");
        int choice = Integer.parseInt(kboard.nextLine());
        System.out.println("How much do you weigh? (in KG)");
        double weight = kboard.nextInt();
        kboard.nextLine();

        if (weight <= 0)
            System.out.println("Hmmm a negative weight? Ok proceed.");
            
        double[] planetWeight = {0.38, 0.904, 0.38, 2.526, 1.065, 0.886, 1.14};
        String[] planet = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        System.out.println("Your weight on " + planet[choice-1] + " is " + (weight*planetWeight[choice-1]));
                
        try
        {
            Thread.sleep(1000);
            System.out.println("Do you want to calculate your weight again?");
            String answer = kboard.nextLine();

            if (answer.contains("yes") || answer.contains("Yes"))
            {
                Thread.sleep(1000);
                 calculator();
            }
            else
                System.exit(0);
                        
        }
        catch (InterruptedException e)
        {
            System.exit(0);
        }
    }
}