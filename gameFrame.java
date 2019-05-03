import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class gameFrame extends JFrame implements WindowListener
{
	public gameFrame()
	{
		super("Quest for Bread");
		addWindowListener(this);
		initBattle();

		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void initBattle()
	{
		BattleScreen screen = new BattleScreen();
		add(screen.addMoneyCount());
	}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}
