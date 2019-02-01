import info.gridworld.actor.Bug;

public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;

    public SpiralBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn();
            turn();
            sideLength++;
            steps = 0;
        }
    }
}