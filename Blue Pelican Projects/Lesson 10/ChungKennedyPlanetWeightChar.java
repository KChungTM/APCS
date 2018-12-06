import java.util.Scanner;

public class ChungKennedyPlanetWeightChar
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

        System.out.println("    Mercury  ");
        System.out.println("    Venus  ");
        System.out.println("    Mars  ");
        System.out.println("    Jupiter  ");
        System.out.println("    Saturn  ");
        System.out.println("    Uranus  ");
        System.out.println("    Neptune  ");
        System.out.println("----------------\nWhich planet do you want to check?: ");
        String choice = kboard.nextLine();
        char chr = choice.charAt(0);
        System.out.println("How much do you weigh? (in KG)");
        double weight = kboard.nextInt();
        kboard.nextLine();

        if (weight <= 0)
            System.out.println("Hmmm a negative weight? Ok proceed.");
            
        switch (chr)
        {
            case 'M':
            case 'm':
                System.out.println("Your weight on Mercury is: " + (weight * 0.38));
                break;
            case 'V':
            case 'v':
                    System.out.println("Your weight on Mercury is: " + (weight * 0.904));
                    break;
            case 'R':
            case 'r':
                        System.out.println("Your weight on Mercury is: " + (weight * 0.));
                        break;
            case 'J':
            case 'j':
                System.out.println("Your weight on Mercury is: " + (weight * 2.526));
                break;
            case 'S':
            case 's':
                    System.out.println("Your weight on Mercury is: " + (weight * 1.065));
                    break;
            case 'U':
            case 'u':
                System.out.println("Your weight on Mercury is: " + (weight * 0.886));
                break;
            case 'N':
            case 'n':
                System.out.println("Your weight on Mercury is: " + (weight * 1.14));
                break;
            default:
                System.out.println("Hey buster! What you put there wasn't on the list >:o\n");
        }

        System.out.println("");
        
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
