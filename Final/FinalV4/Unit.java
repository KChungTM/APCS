import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Unit extends JLabel
{
	private int xLoc;
	private int attackDmg;
	private int health;
	private int speed;
	
	public Unit(ImageIcon pic)
	{
		super(pic);
		xLoc = 0;
		attackDmg = 10;
		health = 50;
		speed = 1;
	}

	public Unit(String text)
	{
		super(text);
		xLoc = 0;
		attackDmg = 10;
		health = 50;
		speed = 1;
	}

	public void setLoc(int distance)
	{
		xLoc = distance + xLoc;
	}

	public int getLoc()
	{
		return (int)(this.getBounds().getX());
	}

	public void setAD(int value)
	{
		attackDmg = value;
	}

	public int getAD()
	{
		return attackDmg;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int ad)
	{
		health = health - ad; 
	}

	public int getSpeed()
	{
		return speed;
	}
}
