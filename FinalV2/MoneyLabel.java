import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;

public class MoneyLabel extends JLabel implements gameComponent
{
	private GridBagConstraints loc;
	private int money;
 
	public MoneyLabel()
	{
		super("$:" + 0);

		loc = new GridBagConstraints();

		setFont(this.getFont().deriveFont(25f));
		setForeground(Color.WHITE);

		setPreferredSize(new Dimension(10, 100));
	}

	public void setLabel(int cash)
	{
		setText("$:" + cash);
	}

	public int getLabelContent()
	{
		return money;
	}

	public GridBagConstraints getLoc()
	{
		loc.gridx = 1;
		loc.gridy = 0;

		return loc;
	}
}
