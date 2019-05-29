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

		screenDimension = new Dimension(1024, 768);
		
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
