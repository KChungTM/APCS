public class clumsyBot extends Robot
{
    private int counter;

    public clumsyBot()
    {
        counter = 0;
    }

    public void move()
    {
        if (getHall()[getPos()] > 0)
        {
            getHall()[getPos()]--;
            counter++;
        }
        else
        {
            if (counter%3==0)
                    getHall()[getPos()] = getHall()[getPos()] + 1;
            else
            {
                if ( ! forwardMoveBlocked() )
                {
                    if (getDirection())
                    {   setPos(getPos()+1);   }
                    else
                    {   setPos(getPos()-1);   }
                }
                else
                {
                    setDirection(!getDirection());  // switch directions
                }
                counter++;
            }
        }
    }
}