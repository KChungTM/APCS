import javax.swing.*;  // for JFrame
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ebicDance
{
    public static void main(String[] args)
    {
        JFrame frame;
        JPanel panel;
        JButton butt;

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(30,30,30,30);

        frame = new JFrame("VERY EPIC");

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        butt = new JButton("Click Here...You Won't");
        butt.setPreferredSize(new Dimension(275,185));  //resizes JFrame

        panel.add(butt, gbc);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	/*
        JFrame popup = new JFrame();
        JLabel popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
        popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
        popup.add(popupText);
        popup.pack();
        popup.setLocationRelativeTo(null);
	*/

        butt.addActionListener(new ActionListener()
        {
	    JLabel popupText;

            public void actionPerformed(ActionEvent a)
            {
		
		JFrame popup = new JFrame();
                popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
                popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
                popup.add(popupText);
                popup.pack();
                popup.setLocationRelativeTo(null);
                popup.setVisible(true);

		/*
		popupText.setText(""+ 1);
		System.out.println("ming stop");

		popupText.setText(""+ 2);
		System.out.println("YoU bEtTeR sToP");
		//Thread.sleep(1500);
		popupText.setText(""+ 3);
*/
		//}

		ActionListener setLabel = new ActionListener() {
			int num = 3;
			public void actionPerformed(ActionEvent kenneedsglasses) {
				System.out.println(num);			
				popupText.setText(num + "");
				num--;
			}
		};
		
		int delay = 1500;
		new Timer(delay, setLabel);
		//This runs too much
		
	    } 
        });

    }
} 


//https://gfycat.com/fittingmaturegrizzlybear
