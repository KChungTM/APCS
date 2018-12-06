import java.util.Scanner;

public class ChungKennedyScrollingText 
{
    public static void main(String[] args)
    {
        Scanner boi = new Scanner(System.in);
        System.out.println("What's your name sonny?");
        String username = boi.nextLine();
        int counter = 30000;
        System.out.println("\n" +"\n" +"\n" +"\n");

        while(counter != 0)
        {
            try 
            {
                Thread.sleep(5);
                System.out.print(username);
                Thread.sleep(5);
                System.out.print(" is ");
                Thread.sleep(5);
                System.out.print("a big baller. ");
            }
            catch (InterruptedException e)
            {
                System.out.println("Oopsies, something went wrong :(");
            }
            counter = counter - 1;
        }
        userKeyboard();
    }
    public static void userKeyboard() 
    {
        Scanner keyboard = new Scanner(System.in);
        String command = keyboard.next();
        if (command.equalsIgnoreCase(command))
            System.exit(0);
    }
}
