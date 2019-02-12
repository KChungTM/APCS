import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid;

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

	public ArrayList<Actor> getActors()
	{
		hitList = getGrid().getNeighbors(getLocation());
	}

	public void processActors()
	{
		for (Actor actors : hitList)
		{
			actors.removeSelfFromGrid();
		}
	}

	public void act()
	{	
		if(hitList.isEmpty())
		{
			hitList.getActors();
		}
		else
		{
			if (turnCounter == 3)
			{
				processActors();
				turnCounter = 0;
				hitList.clear();
			}
			else
			{
				turnCounter++;
			}
		}		
	}
}
