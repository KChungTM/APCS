import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RockEater extends Critter
{
    public RockEater()
    {
        super();
        setColor(Color.PINK);
    }

    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> rockLocation = new ArrayList<Location>(); 
        ArrayList<Location> occupiedLocation = getGrid().getOccupiedLocations();
        
        for(Location loc: occupiedLocation)
        {
            if (getGrid().get(loc) instanceof Rock)
                rockLocation.add(loc);
        }
         
        return rockLocation;
    }
}