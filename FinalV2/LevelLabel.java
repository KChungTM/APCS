import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class LevelLabel extends JLabel
{
	private GridBagConstraints loc;
	private int levelNum;

	public LevelLabel()
	{
		super("Level: Null");
	}

	public LevelLabel(int level)
	{
		super("Level: " + 1);

		loc = new GridBagConstraints();
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

	public GridBagConstraints getLoc()
	{
		loc.gridx = 0;
		loc.gridy = 0;

		return loc;
	}
}
