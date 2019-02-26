import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;


public class RadioactiveRock extends Rock
{
	private int turnCounter;
	private ArrayList<Actor> hitList;

	public RadioactiveRock()
	{
		setColor(Color.GREEN);
	}

	public RadioactiveRock(Color color)
	{
		setColor(Color.GREEN);	
	}

	public void getActors()
	{
		hitList = getGrid().getNeighbors(getLocation());
	}

	public void processActors()
	{
		for (Actor actors : hitList)
		{
			if (!(actors instanceof RadioactiveRock))
				actors.removeSelfFromGrid();
		}
	}

	public ArrayList<Location> getEmptyAdjacentLocations()
	{
		return getGrid().getEmptyAdjacentLocations(getLocation());
	}

	public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }

	public void act()
	{	
		if(hitList == null)
		{
			getActors();
		}
		else
		{
			if(hitList.isEmpty())
			{
				getActors();
			}
			else
			{
				if (turnCounter == 2)
				{
					getActors();
					processActors();
					turnCounter = 0;
					hitList.clear();
				}
				else
				{
					turnCounter++;
				}
			}
			if (getEmptyAdjacentLocations().size() != 0)
			{
				RadioactiveRock newRock = new RadioactiveRock();
				newRock.putSelfInGrid(getGrid(), selectMoveLocation(getEmptyAdjacentLocations()));
			}	
		}	
	}
}
