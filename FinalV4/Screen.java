import javax.swing.JLayeredPane;
import javax.imageio.ImageIO;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;

// Contains all the graphics of the game

public class Screen extends JLayeredPane 
{
	private GridBagLayout layout;
   	private GridBagConstraints c;
	private BufferedImage bg;
	private Dimension screenDim;

    	public Screen(Dimension screen) throws IOException 
	{
		layout = new GridBagLayout();
		c = new GridBagConstraints();
		screenDim = screen;

		//Read/Write Tutorial from Earlier in the Year
		bg = resize(ImageIO.read(new File("./background.jpg")));

		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
	}

	public void addUnits()
	{
		return;
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
