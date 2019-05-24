import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Color;

public class componentFrame extends JPanel
{
	private GridBagLayout layout;	
	private Dimension panelDim;	
	
	public componentFrame(Dimension dim)
	{
		super();
		
		layout = new GridBagLayout();

		panelDim = new Dimension((int)(dim.getWidth()-10), (int)(dim.getHeight()-30));

		setLayout(layout);
		setPreferredSize(panelDim);	
		setBackground(Color.RED);

		addComponents();
	}

	public void addComponents()
	{
		this.add(getTopPanel());
	}

	public JPanel getTopPanel()
	{
		JPanel topPane = new JPanel();
		topPane.setLayout(layout);
		topPane.setBackground(Color.BLUE);
	
		LevelLabel levelCounter = new LevelLabel(1);
		MoneyLabel moneyCounter = new MoneyLabel();

		topPane.add(levelCounter, levelCounter.getLoc());
		topPane.add(moneyCounter, moneyCounter.getLoc());

		//topPane.updateUI();		
	
		return topPane;
	}
}
