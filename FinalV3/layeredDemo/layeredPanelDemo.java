import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class layeredPanelDemo extends JLayeredPane
{

	private BufferedImage img;

	public layeredPanelDemo() throws IOException
	{
		super();
        	JFrame frame = new JFrame("EPIC");
        	JLabel label = new JLabel("Epic");
		JLabel topLab = new JLabel("Top");
        	JButton butt = new JButton();

        	GridBagLayout layout = new GridBagLayout();
        	GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.BLACK);
		setOpaque(true);

		System.out.println(this.getWidth() + " " + this.getHeight());

		img = ImageIO.read(new File("./download.jpeg"));
		img = resize();

		c.weightx = 0.1;
		c.weighty = 0.1;

		c.gridx = 0;
		c.gridy = 0;
		//addImpl(label, c, 1);
		c.gridx = 0;
		c.gridy = 1;
		addImpl(butt,c, 2);

		frame.add(this);

		frame.setSize(new Dimension(1024,768));

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private BufferedImage resize()
	{	
		Image tmp = img.getScaledInstance(1000,1000, Image.SCALE_SMOOTH); //Gets scaled version
		BufferedImage newImg = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_ARGB); //Creates blank BufferedIMG to write on

		Graphics2D g2d = newImg.createGraphics(); //Creates a graphic on BufferdIMG to draw
		g2d.drawImage(tmp,0,0,null); //Redraws onto BufferedIMG
		g2d.dispose(); //Gets rid of graphic

		return newImg;
	}

	@Override
	protected void paintChildren(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(img, 0,0, null);
	}
}
