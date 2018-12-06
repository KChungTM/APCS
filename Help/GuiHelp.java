//© A+ Computer Science  -  www.apluscompsci.com

//gui example

import javax.swing.JOptionPane;

public class GuiHelp
{
	public static void main(String args[])
	{
		int one, two, total;

		one = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
		two = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));

		total = one + two;

		JOptionPane.showMessageDialog(null,"Total ::" + total);

		System.out.println(total);
	}
}