import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
	private Screen gameScreen;
	private ImageIcon pic;
	private ImageIcon inGame;


	public UnitPanel(int unitNum, Dimension panelDim, MoneyLabel moneyCounter, Screen screen)
	{
		super();

		layout = new GridBagLayout();
		c = new GridBagConstraints();
		moneyCount = moneyCounter;
		cost = unitNum * 50;
		gameScreen = screen;

		setLayout(layout);
		setBackground(Color.WHITE);

		Border border = new LineBorder(Color.BLACK, 3);
		

		//c.anchor = GridBagConstraints.CENTER;

		

		switch(cost)
		{
			case(50):
				pic = new ImageIcon("./ButtonPics/Unit1.png");
				inGame = new ImageIcon("./Sprites/Unit1.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
				break;
			case(100):
				pic = new ImageIcon("./ButtonPics/Unit2.png");
				inGame = new ImageIcon("./Sprites/Unit2.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
				break;
			case(150):
				pic = new ImageIcon("./ButtonPics/Unit3.png");
				inGame = new ImageIcon("./Sprites/Unit3.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
				break;
			case(200):
				pic = new ImageIcon("./ButtonPics/Unit4.png");
				inGame = new ImageIcon("./Sprites/Unit4.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
				break;
			case(250):
				pic = new ImageIcon("./ButtonPics/Unit5-1.png");
				inGame = new ImageIcon("./Sprites/Unit5.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
				break;
			default:
				pic = new ImageIcon("./ButtonPics/Unit1.png");
				inGame = new ImageIcon("./Sprites/Unit5.png");
				button = new JButton(pic);
				button.setBackground(Color.WHITE);
				button.setOpaque(true);
				button.setBorder(border);
		}

		unitCost = new JLabel("$" + cost + "");

		    // Got ".setFont() and .deriveFont from StackOverflow example 
		    // of changing JComponents
		unitCost.setFont(unitCost.getFont().deriveFont((float)(panelDim.getWidth()/80)));
		unitCost.setForeground(Color.BLACK);

		//System.out.println((int)(panelDim.getWidth()*0.10) + " " + (int)(panelDim.getHeight()*0.05));

		//Adds Unit Button
		c.ipadx = (int)(panelDim.getWidth()*0.15);
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

		//Adding ActionListener to Button
		button.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							if(cost<=moneyCount.getMoney())
							{
								moneyCount.subtractMoney(cost);
								System.out.println("Subtracting: " + cost);

								switch(cost)
								{
									case(50):
										gameScreen.addUnit(new basicUnit(inGame));
										break;
									case(100):
										gameScreen.addUnit(new Soldier(inGame));
									case(150):
										gameScreen.addUnit(new Tank(inGame));
										break;
									case(200):
										gameScreen.addUnit(new Bot(inGame));
										break;
									case(250):
										gameScreen.addUnit(new Joo(inGame));
										break;
									default:
										gameScreen.addUnit(new basicUnit(inGame));
										break;
										
								}
							}
						}
					});
	}
}
