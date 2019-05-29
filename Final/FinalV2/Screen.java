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



public class Screen extends JLayeredPane 
{
    	private GridBagLayout layout;
   	private GridBagConstraints c;
	private BufferedImage bg;
	private Dimension screenDim;

    	public Screen() throws IOException 
	{
		layout = new GridBagLayout();
		c = new GridBagConstraints();

		bg = resize(ImageIO.read(new File("./download.jpeg")));

		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
	}

	private BufferedImage resize(Image img)
	{
		return bg;
	}

	//Overriding the paint method of JComponent
	@Override
	protected void paintComponent(Graphics g)
	{
		
	}

}
