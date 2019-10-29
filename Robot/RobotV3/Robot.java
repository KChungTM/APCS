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
			return false; //Does not need to change direction
		}
	}

	private void move()
	{
        //System.out.print(pos + ",");
        //System.out.print(hall[pos] + ",");
        //System.out.print(facingRight + ",");
        //System.out.print(forwardMoveBlocked() + ",");

        if (hall[pos] > 0)
        {
            hall[pos]--;
        }
        if (hall[pos] == 0)
        {
            if (forwardMoveBlocked())
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
            		//System.out.print(moves + "  ");
			moves++;
        	}
        
        //for (int i = 0; i<hall.length; i++)
        //{
        //    System.out.println(hall[i]);
        //`}
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
	
	
	
