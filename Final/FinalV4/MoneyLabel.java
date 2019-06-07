import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;

public class MoneyLabel extends JLabel implements Runnable
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

	
	public void subtractMoney(int amount)
	{
		money = money-amount;
		setText("$:" + money);
	}
	

	public int getMoney()
	{
		return money;
	}

	public GridBagConstraints getConstraints()
	{
		c.weightx = 0.30;
		return c;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(50);
				if(money<10000)
					money++;
				this.setText("$:" + money);
			}
			catch(Exception e)  {};

<<<<<<< HEAD:FinalV4/MoneyLabel.java
			if(money%10 == 0)
				System.out.println("running: " + money);
=======
			//if(money%10 == 0)
			//	System.out.println("running: " + money);
>>>>>>> 66a773b17dee3b602334d22fabadf6b19337e7b2:Final/FinalV4/MoneyLabel.java
		}
	}
}
