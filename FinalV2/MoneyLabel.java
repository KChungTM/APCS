import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class MoneyLabel extends JLabel
{
	private GridBagConstraints c;
	private int money;
 
	public MoneyLabel()
	{
		super("$:" + 0);

		c = new GridBagConstraints();

		setFont(this.getFont().deriveFont(25f));
		setForeground(Color.WHITE);
	}

	public void setLabel(int cash)
	{
		setText("$:" + cash);
	}

	public int getLabelContent()
	{
		return money;
	}

	public GridBagConstraints getConstraints()
	{
		c.weightx = 0.30;
		return c;
	}
}
