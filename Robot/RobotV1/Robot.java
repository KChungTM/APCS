public class Robot
{
	private int[] hall;
	private int pos;
	private boolean facingRight;

	public Robot(int[] Hall)
	{
		hall = Hall;
		pos = 1;
		facingRight = true;
	}

	private boolean forwardMoveBlocked()
	{
		if (pos == hall.length-1 && facingRight == true || pos == 0 && facingRight == false)
		{
			return true; //Needs to change direction
		}
		else 
		{
			return false; //Does no need to change direction
		}
	}

	private void move()
	{
		if (hall[pos] > 0)
			hall[pos]--;
		else
		{
			if (forwardMoveBlocked() == true)
			{
				if (facingRight == true)
					facingRight = false;
				else if (facingRight == false)
					facingRight = true;
			}
			else
			{
				if (facingRight == true)
					pos++;
				else if (facingRight == false)
					pos--;
			}
		}	
	}

	public int clearHall()
	{
		int moves = 0;
		
		while(!hallIsClear())
		{
			move();
			moves++;
        }
        return moves;
	}

	private boolean hallIsClear()
	{
		for (int i = 0; i < hall.length; i++)
		{
			if (hall[i] > 0)
			{
				return false;
			}
		}
		return true;
	}
}
	
	
	
