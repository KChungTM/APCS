import javax.swing.JLayeredPane;
import javax.imageio.ImageIO;
import javax.swing.JButton;
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

    	public Screen(Dimension screen, MoneyLabel moneyCounter) throws IOException 
	{
		screenDim = screen;
		moneyCount = moneyCounter;

		//Read/Write Tutorial from Earlier in the Year
		bg = resize(ImageIO.read(new File("./background.jpg")));

		//Adds money cheat for ease
		JButton moneyCheat = new JButton(";-;");

		
		
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
		moneyCheat.setBorderColor(Color.WHITE);
		moneyCheat.setBorderPainted(false);

		this.add(moneyCheat,POPUP_LAYER);

		this.setBackground(Color.WHITE);
		this.setOpaque(true);
	}

	public void addUnit(Unit unit)
	{
		unit.setBounds(820,400,200,200);
		this.add(unit, FRAME_CONTENT_LAYER);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
				Component[] comps = getComponentsInLayer(FRAME_CONTENT_LAYER);
				//System.out.print(comps);

				System.out.println("fgdgfdgdg");

				for(Component comp: comps)
				{
					if(comp.getBounds().getX()>200)
					{
						comp.setBounds((int)(comp.getBounds().getX() - 50), (int)(comp.getBounds().getY()),200,200);
						System.out.println("wtf");
					}
				}
			}
			catch(Exception e) {}
		}
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
