import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException; 
import java.util.Scanner;

public class gameFrame extends JFrame
{
	private Toolkit tk;
	private Dimension screenDimension;
	private componentFrame cFrame;
	private Thread moneyIncrease;
	private Thread unitMovement;

	public gameFrame() throws IOException
	{
		super("Quest for Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

		tk = Toolkit.getDefaultToolkit();
		Scanner kb = new Scanner(System.in);

		screenDimension = new Dimension(1024, 768);
		
		setSize(screenDimension);
		setLocationRelativeTo(null);
		setResizable(false);		
	
		initGame();

		setVisible(true);

		try
		{
			Thread.sleep(100);
		}
		catch(Exception e) {}

		initGameProcesses();
	}

	public void initGame() throws IOException
	{
		cFrame = new componentFrame(screenDimension);
		add(cFrame);
	}

	public void initGameProcesses() throws IOException
	{
		moneyIncrease = cFrame.getMoneyThread();
		unitMovement = cFrame.getUnitMovementThread();
		
		moneyIncrease.start();
		unitMovement.start();
	}
}
