import java.util.Scanner;

public class ChungKennedyPlanetWeight
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
        String choice = kboard.nextLine();
        System.out.println("How much do you weigh?");
        double weight = kboard.nextInt();

        switch (choice)
        {
            case "1":
            case "Mercury":
                System.out.println("Your weight on Mercury is: " + (weight * 0.38));
                break;
            case "2":
            case "Venus":
                    System.out.println("Your weight on Mercury is: " + (weight * 0.904));
                    break;
            case "3":
            case "Mars":
                        System.out.println("Your weight on Mercury is: " + (weight * 0.));
                        break;
            case "4":
            case "Jupiter":
                System.out.println("Your weight on Mercury is: " + (weight * 2.526));
                break;
            case "5":
            case "Saturn":
                    System.out.println("Your weight on Mercury is: " + (weight * 1.065));
                    break;
            case "6":
            case "Uranus":
                System.out.println("Your weight on Mercury is: " + (weight * 0.886));
                break;
            case "7":
            case "Neptune":
                System.out.println("Your weight on Mercury is: " + (weight * 1.14));
                break;
            default:
            {
                System.out.println("Hey buster! What you put there wasn't on the list >:o\n");
                
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    System.exit(0);
                }
                
                calculator();
            }
        }
    }
}