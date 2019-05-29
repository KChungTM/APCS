import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class gameFrame extends JFrame
{
	private Toolkit tk;
	private Dimension screenDimension;

	public gameFrame()
	{
		super("Quest for Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

		tk = Toolkit.getDefaultToolkit();

		screenDimension = new Dimension((int)(tk.getScreenSize().getWidth()*0.9), (int)(tk.getScreenSize().getHeight() * 0.8));
		
		setSize(screenDimension);
		setLocationRelativeTo(null);
		setResizable(true);

		initGame();

		setVisible(true);
	}

	public void initGame()
	{
		add(new componentFrame(screenDimension));
	}
}
