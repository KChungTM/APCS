import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter the number of items in each tile!");
        System.out.println("Please enter in this format: \"a\",\"b\",\"c\"");
        System.out.println("---------------------------------------------------");

        String[] stringHall = kboard.nextLine().split(" ");
        int[] intHall = new int[stringHall.length];

        for (int i = 0; i<stringHall.length; i++)
            intHall[i] = Integer.parseInt(stringHall[i]);

        Robot myRobot = new Robot(intHall);
        System.out.println("The robot cleared the hall in: " + myRobot.clearHall() + " moves");
    }
}