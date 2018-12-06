//Hi Mr.Joo! I combined both in one project!
import java.util.Scanner; //imports scanners
import java.util.InputMismatchException; //imports the gui
public class ChungKennedyGettingLoopy //name of program
{
    public static void main(String[] args) //First print, starting screen
    {
        Questionaire();
    }
    public static void Questionaire()
    {
        Scanner assignmentChecker = new Scanner(System.in);
        System.out.println("\nWhich assignment do you want?");
        System.out.println("1. Modified EvenOrOdd\n2. Scrolling Text");
        System.out.println("------------------------");
        String assignment = assignmentChecker.nextLine();
        if (assignment.equalsIgnoreCase("Modified EvenOrOdd"))
        {
                System.out.println("Teleporting in: ");
                try
                {
                    Thread.sleep(200);
                    System.out.println("3");
                    Thread.sleep(200);
                    System.out.println("2");
                    Thread.sleep(200);
                    System.out.println("1");
                    Thread.sleep(200);
                    ModifiedEvenOrOdd();
                }
                catch(InterruptedException e)
                {
                    System.out.println("Rut Roh Raggy");
                }
        }
            
        else if (assignment.equalsIgnoreCase("Scrolling Text"))
        {
            System.out.println("Teleporting in: ");
            try
            {
                Thread.sleep(200);
                System.out.println("3");
                Thread.sleep(200);
                System.out.println("2");
                Thread.sleep(200);
                System.out.println("1");
                Thread.sleep(200);
                ScrollingText();
            }
            catch(InterruptedException e)
            {
                System.out.println("Rut Roh Raggy");
            }
        } 
        else
        {
            System.out.println("\n Dang nabit! Put in a valid assignment -.-");
            Questionaire();
        }
    }
    public static void ModifiedEvenOrOdd()
    {
        Scanner integerCounter = new Scanner(System.in);

        int meme = 0; // sets the loop control 
        while(meme < 3) //does the following until meme <3 :D
        {
            try //tries the following
            {
            System.out.print("Enter an integer: ");
            int i = integerCounter.nextInt();
                if ((i % 2 <= -1) || (i % 2 >= 1))
                {
                System.out.println("The integer " + i + " is odd.\n");
                }
                else
                {
                System.out.println("The integer " + i + " is even.\n");
                }
            }
            catch(InputMismatchException e) //used to catch error
            {
                System.out.println("Please enter a valid integer...");
                break; //breaks the program if an invalid input is input
            }
            meme = meme + 1; //increment to close loop
            
        } //close while loop
        Questionaire();
    }
    public static void ScrollingText() //Scrolling Text Class
    {
        Scanner boi = new Scanner(System.in);
        System.out.println("What's your name sonny?");
        String username = boi.nextLine();
        try
        {
            if ((username.matches(".*\\d.*"))) //checks the string for integers
            {
                System.out.println("Hey! That's either just numbers or your AOL username pal. >:(\n");
                ScrollingText();
            }
            else
            {
            
                int counter = 30000;
                System.out.println("\n" +"\n" +"\n" +"\n");

                while(counter != 0)
                {
                    Thread.sleep(5);
                    System.out.print(username);
                    Thread.sleep(5);
                    System.out.print(" is ");
                    Thread.sleep(5);
                    System.out.print("a big baller.        \n");

                    counter = counter - 1;
                }
            }
            Questionaire();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thats an oof");
        }

    }

}