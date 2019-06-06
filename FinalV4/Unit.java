import javax.swing.JLabel;

public class Unit extends JLabel
{
	private int xLoc;
	private int attackDmg;
	private int health;
	private int speed;

	public Unit()
	{
		super("haha");
		xLoc = 0;
		attackDmg = 10;
		health = 50;
		speed = 1;
	}

	public void action()
	{
		return;
	}

	public void setLoc(int distance)
	{
		xLoc = distance + xLoc;
	}

	public int getLoc()
	{
		return xLoc;
	}

	public int getAD()
	{
		return attackDmg;
	}

	public int getHealth()
	{
		return health;
	}

	public int getSpeed()
	{
		return speed;
	}
}
