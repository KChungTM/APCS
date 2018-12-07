public class RoboTester
{
    public static void main(String[] args)
    {
        clumsyBot joomba = new clumsyBot();
        int steps = joomba.clearHall();
        System.out.println("Clumsy Bot cleared the hall in " + steps + " moves.");
    }
}
