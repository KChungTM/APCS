import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class BattleScreen
{	
	private JPanel panel;
	private GridBagLayout layout;
	private GridBagConstraints c;

	public BattleScreen()
	{
		panel = new JPanel();
		layout = new GridBagLayout();
		c = new GridBagConstraints();

		panel.setLayout(layout);
	}
	
	public JLabel addMoneyCount()
	{
		JLabel moneyLabel = new JLabel("0");
		layout.setConstraints(moneyLabel, c);
		return moneyLabel;
	}
}
