import javax.swing.JLayeredPane;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

// Contains all the graphics of the game

public class Screen extends JLayeredPane implements Runnable
{
	private BufferedImage bg;
	private Dimension screenDim;
	private MoneyLabel moneyCount;
	private GTower gtower;
	private BTower btower;
	private ImageIcon ogjoo, ogbot, joo, bot, baddie;

    	public Screen(Dimension screen, MoneyLabel moneyCounter) throws IOException 
	{
		screenDim = screen;
		moneyCount = moneyCounter;
		gtower = new GTower();
		btower = new BTower();

		joo = new ImageIcon("./Sprites/Unit5-1.png");
		bot = new ImageIcon("./Sprites/Unit4-1.png");
		ogjoo = new ImageIcon("./Sprites/Unit5.png");
		ogbot = new ImageIcon("./Sprites/Unit4.png");
		baddie = new ImageIcon("./Sprites/Baddie.png");

		//Read/Write Tutorial from Earlier in the Year
		bg = resize(ImageIO.read(new File("./backgrounds/backgroundV2.jpg")));

		//Adds money cheat for ease
		JButton moneyCheat = new JButton("");
		moneyCheat.setFont(moneyCheat.getFont().deriveFont((float)(20)));
		moneyCheat.setFocusPainted(false);

		
		
		moneyCheat.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
									moneyCount.subtractMoney(-1000);
									System.out.println("Adding" + 1000);	
							}
						});

		moneyCheat.setBounds(470,100,100,100);
		moneyCheat.setOpaque(false);
		moneyCheat.setContentAreaFilled(false);
		moneyCheat.setBorderPainted(false);
		moneyCheat.setBorderPainted(false);

		this.add(moneyCheat,POPUP_LAYER);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);

		gtower.setBounds(800,150,200,200);
		this.add(gtower, MODAL_LAYER);
		btower.setBounds(130,150,200,200);
		this.add(btower, MODAL_LAYER);
	}

	public void addUnit(Unit unit)
	{
		unit.setBounds(850,400,200,200);
		this.add(unit, FRAME_CONTENT_LAYER);
	}

	public void addBUnit(Unit unit)
	{
		unit.setBounds(160,400,200,200);
		this.add(unit, FRAME_CONTENT_LAYER);
	}

	public void run()
	{	
		double time = System.currentTimeMillis();
		System.out.println(time);	
		System.out.println(btower.getAD());

		master:
		while(true)
		{		
			if (System.currentTimeMillis() - time > 6000)
			{
				this.addBUnit(new basicBaddie(baddie));
				time = System.currentTimeMillis();
			}

			try
			{			
				Thread.sleep(1000);
				Component[] comps = getComponentsInLayer(FRAME_CONTENT_LAYER);

				System.out.println("New Iteration");
				System.out.println("-------------");
				//System.out.print(comps);



				Unit[] units = new Unit[comps.length];

				for(int i = 0; i<comps.length; i++)
				{
					units[i] = (Unit)(comps[i]);
				}
				
				//----------------------------------------

				//Win Condition
				if(btower.getHealth() <= 0 || gtower.getHealth() <= 0)
				{
					System.out.println("Congrats you won!");
					System.exit(0);
					
				}
				else
				{
					btower.setText(btower.getHealth() + "/200");
					gtower.setText(gtower.getHealth() + "/200");
				}
				
				//Action
				outer:
				for(Unit unit1: units)
				{
						if(unit1.getLoc() > 720 && unit1 instanceof BUnit)
						{
							System.out.println(gtower.getHealth());
							gtower.setHealth(unit1.getAD());
						}
						else if (unit1.getLoc() < 210 && unit1 instanceof GUnit)
						{
							System.out.println(btower.getHealth());
							btower.setHealth(unit1.getAD());
						}
						else
						{
							if(units.length == 1)
								moveUnit(unit1);
							else if (closestUnit(unit1, units))
							{
								inner:
								for(Unit unit2: units)
								{

									System.out.println(unit1.getText() + " " + unit2.getText());
									System.out.println(unit1.getLoc() - unit2.getLoc());

									if (unit1 == unit2)
										continue inner;
									if(unit1 instanceof GUnit && unit2 instanceof BUnit)
									{
										if(unit1.getLoc() - unit2.getLoc() <= 50)
										{
											if(unit1 instanceof Bot)
											{
												unit1.setIcon(bot);
												Thread.sleep(1500);
											}
											else if(unit1 instanceof Joo)
											{
												unit1.setIcon(joo);
												Thread.sleep(1500);
											}

											System.out.println(unit1.getText() + " bopped " + unit2.getText());
											System.out.println(unit2.getText() + ": " + unit2.getHealth());
											unit2.setHealth(unit1.getAD());

											if(unit1 instanceof Bot)
											{
												unit1.setIcon(ogbot);
											}
											else if(unit1 instanceof Joo)
											{
												unit1.setIcon(ogjoo);
											}

											if(unit2.getHealth() <= 0)
											{
												this.remove(this.getIndexOf(unit2));
											}
										}
										else
											moveUnit(unit1);
										break;
									}
									else if(unit1 instanceof BUnit && unit2 instanceof GUnit)
									{
										if(unit2.getLoc() - unit1.getLoc() <= 50)
										{
											System.out.println(unit1.getText() + " bopped " + unit2.getText());
											System.out.println(unit2.getText() + ": " + unit2.getHealth());
											unit2.setHealth(unit1.getAD());

											if(unit2.getHealth() <= 0)
											{
												this.remove(this.getIndexOf(unit2));
											}
										}
										else
											moveUnit(unit1);
										break;
									}
								}
							}
							else
								moveUnit(unit1);
						}
				}
			}
			catch(Exception e) {}
		}
	}

	public void moveUnit(Unit unit)
	{
		if(unit instanceof GUnit && !(unit instanceof GTower))
		{
			if(unit.getBounds().getX()>200)
			{
				unit.setBounds((int)(unit.getLoc() - 50), (int)(unit.getBounds().getY()),200,200);
				System.out.println(unit.getLoc() + "," + unit.getBounds().getY());
			}
		}
		else if (unit instanceof BUnit && !(unit instanceof BTower))
		{
			if (unit.getBounds().getX()<800)
			{
				unit.setBounds((int)(unit.getLoc() + 50), (int)(unit.getBounds().getY()),200,200);
				System.out.println(unit.getLoc() + "," + unit.getBounds().getY());
			}
		}
	}

	public boolean closestUnit(Unit unit, Unit[] unitList)
	{
		for(Unit enemyUnit: unitList)
		{
			if (unit instanceof GUnit)
			{
				if(enemyUnit instanceof BUnit)
				{
					if(unit.getLoc() - enemyUnit.getLoc() <= 50)
						return true;
				}	
			}
			else
			{
				if(enemyUnit instanceof GUnit)
				{
					if(enemyUnit.getLoc() - unit.getLoc() <= 50)
						return true;
				}
			}
		}
		return false;
	}


	//Resizes image by rewriting it onto 
	//a new BufferedImage object.
	//Taken from MemoryNotFound
	//https://memorynotfound.com/java-resize-image-fixed-width-height-example/

	private BufferedImage resize(Image img)
	{
		Image bigImg = img.getScaledInstance((int)screenDim.getWidth(), (int)(screenDim.getHeight()*0.75), Image.SCALE_SMOOTH);
		BufferedImage newImg = new BufferedImage((int)screenDim.getWidth(), (int)(screenDim.getHeight()*0.75),BufferedImage.TYPE_3BYTE_BGR);

		Graphics2D g2d = newImg.createGraphics();
		g2d.drawImage(bigImg,0,0,null);
		g2d.dispose();
		return newImg;
	}

	//Overriding the paint method of JComponent
	//Taken from StackOverflow.
	//https://stackoverflow.com/questions/19125707/simplest-way-to-set-image-as-jpanel-background
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(bg, 0, 0, null);
	}

}
