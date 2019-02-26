import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockDropper extends Critter
{
    public RockDropper(Color color)
    {   
        super();
        setColor(color);
    }
    
    public void makeMove(Location loc)
    {
        Location preloc = getLocation();

        if (loc == null || loc == getLocation())
        {}
            else
        {
            moveTo(loc);
            Rock newRock = new Rock(getColor());
            newRock.putSelfInGrid(getGrid(), preloc);		
        }
    }
}
