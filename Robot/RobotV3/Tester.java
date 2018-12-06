public class Tester
{
    public static void main(String[] args)
    {
        int[] intHall = {1, 1, 2, 2};
        Robot myRobot = new Robot(intHall);
        System.out.println("The robot cleared the hall in: " + myRobot.clearHall() + " moves");
    }
}