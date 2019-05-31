import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class LevelLabel extends JLabel
{
	private GridBagConstraints c;
	private int levelNum;

	public LevelLabel()
	{
		super("Level: Null");
	}

	public LevelLabel(int level)
	{
		super("Level: " + 1);

		c = new GridBagConstraints();
		levelNum = 1;

		setFont(this.getFont().deriveFont(25f));
		setForeground(Color.WHITE);
	}

	public void setLabel(int level)
	{
		setText("Level: " + level); 
	}

	public int getLabelContent()
	{
		return levelNum; 
	}

	public GridBagConstraints getConstraints()
	{
		c.weightx = 0.70;
		return c;
	}

}
