import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

// Used my Christmas Graphic File
// for setting GridBagLayout

public class UnitPanel extends JPanel
{
	private GridBagLayout layout;
	private GridBagConstraints c;
	private JButton button;
	private JLabel unitCost;
	private MoneyLabel moneyCount;
	private int cost;


	public UnitPanel(int unitNum, Dimension panelDim, MoneyLabel moneyCounter)
	{
		super();

		layout = new GridBagLayout();
		c = new GridBagConstraints();
		moneyCount = moneyCounter;
		cost = unitNum * 50;

		setLayout(layout);
		setBackground(Color.WHITE);

		//c.anchor = GridBagConstraints.CENTER;

		button = new JButton(unitNum + "");

		//Adding ActionListener to Button

		button.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							if(cost<=moneyCount.getMoney())
							{
								moneyCount.subtractMoney(cost);
								System.out.println("Subtracting: " + cost);
							}
						}
					});

		unitCost = new JLabel("$" + cost + "");

		    // Got ".setFont() and .deriveFont from StackOverflow example 
		    // of changing JComponents
		unitCost.setFont(unitCost.getFont().deriveFont((float)(panelDim.getWidth()/75)));
		unitCost.setForeground(Color.BLACK);

		//Adds Unit Button
		c.ipadx = (int)(panelDim.getWidth()*0.10);
		c.ipady = (int)(panelDim.getHeight()*0.05);
		c.gridx = 0;
		c.gridy = 0;
		this.add(button, c);

		//Adds Unit Cost Label
		c.ipadx = 0;
		c.ipady = 0;
		c.gridx = 0;
		c.gridy = 1;
		this.add(unitCost, c);
	}
}
