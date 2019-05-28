import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Color;

public class componentFrame extends JPanel
{
	private GridBagLayout layout;	
	private GridBagConstraints c;
	private Dimension panelDim;	
	
	public componentFrame(Dimension dim)
	{
		super();
		
		layout = new GridBagLayout();
		c = new GridBagConstraints();

		c.weightx = 0.1;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.BOTH;

		panelDim = new Dimension((int)(dim.getWidth()-10), (int)(dim.getHeight()-30));

		this.setLayout(layout);
		setPreferredSize(panelDim);	
		setBackground(Color.RED);

		addComponents();
	}

	public void addComponents()
	{
		//Add Top Panel
		c.gridy = 0;
		c.ipady = (int)(panelDim.getHeight()*0.05);
		this.add(getTopPanel(), c);

		//Add Screen
		c.ipady = (int)(panelDim.getHeight()*0.75);
		c.gridy = 1;
		this.add(getScreen(), c);

		//Add Bottom Panel
		c.ipady = (int)(panelDim.getHeight()*0.05);
		c.gridy = 2;
		this.add(getBottomPanel(), c);
	}

	public JPanel getTopPanel()
	{
		JPanel topPane = new JPanel();
		topPane.setLayout(layout);
		topPane.setBackground(Color.BLACK);
	
		LevelLabel levelCounter = new LevelLabel(1);
		MoneyLabel moneyCounter = new MoneyLabel();

		topPane.add(levelCounter, levelCounter.getConstraints());
		topPane.add(moneyCounter, moneyCounter.getConstraints());
	
		//Location of Top Panel	

		return topPane;
	}

	public Screen getScreen()
	{
		Screen gameScreen = new Screen();

		return gameScreen;
	}

	public JPanel getBottomPanel()
	{
		JPanel botPane = new JPanel();
		botPane.setLayout(layout);
		botPane.setBackground(Color.BLACK);

		for(int i = 0; i < 5; i++)
		{
			c.gridx = i;
			UnitPanel unitPane = new UnitPanel(i+1, panelDim);
			botPane.add(unitPane, c);
		}

		c.gridx = 0;

		return botPane;
	}
}
