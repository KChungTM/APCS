import javax.swing.*;  // for JFrame
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;
import java.util.Timer;

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

        butt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click)
            {
                JFrame popup = new JFrame();
                JLabel popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
                Timer timer1 = new Timer();

                popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
                popup.add(popupText);
                popup.pack();
                popup.setLocationRelativeTo(null);
                popup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                popup.setVisible(true);

                /*
                ActionListener setLabel = new ActionListener()      //creates method that sets label
                {
                    int num = 3;
                    public void actionPerformed(ActionEvent timer)
                    {
                        System.out.println(num);			
                        popupText.setText(num + "");
                        num--;
                    }
                };
                */

                TimerTask tt = new TimerTask()
                {
                    int countdown = 3;
                    public void run()
                    {
                        System.out.println(countdown);			
                        popupText.setText(countdown + "");
                        countdown--; 
                        if (countdown == 0)
                        {
                            timer1.cancel();
                            popup.setVisible(false);
                        }
                    }
                };

                timer1.schedule(tt, 1, 1500);    
            }
        });
        try
        {
            Thread.sleep(4500);
        }
        catch(Throwable e){}

        System.out.println("hi");
        butt.setVisible(false);
    }
}
    


/*
        butt.addActionListener(new ActionListener()
        {
	        JLabel popupText;

                public void actionPerformed(ActionEvent )
                {
		            JFrame popup = new JFrame();
                    popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
                    popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
                    popup.add(popupText);
                    popup.pack();
                    popup.setLocationRelativeTo(null);
                    popup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    popup.setVisible(true);


                    ActionListener setLabel = new ActionListener()
                    {
			            int num = 3;
                        public void actionPerformed(ActionEvent kenneedsglasses)
                        {
				            System.out.println(num);			
				            popupText.setText(num + "");
				            num--;
			            }
		            };
		
		            int delay = 1500;
		            new Timer(delay, setLabel).start();
		            //This runs too much
		
	            } 
        });

    }
} 


*/
//https://gfycat.com/fittingmaturegrizzlybear
