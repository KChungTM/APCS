import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

public class gameFrame extends JFrame
{
	private Toolkit tk;
	private Dimension screenDimension;

	public gameFrame() throws IOException
	{
		super("Quest for Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

		tk = Toolkit.getDefaultToolkit();

		screenDimension = new Dimension(1024, 768);
		
		setSize(screenDimension);
		setLocationRelativeTo(null);
		setResizable(false);

		initGame();

		setVisible(true);
	}

	public void initGame() throws IOException
	{
		add(new componentFrame(screenDimension));
	}
}
