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
	
                final JFrame popup = new JFrame();
                final JLabel popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
                final Timer timer1 = new Timer();

                popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
                popup.add(popupText);
                popup.pack();
                popup.setLocationRelativeTo(null);
                popup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                popup.setVisible(true);

                TimerTask tt = new TimerTask()
                {
                    int countdown = 3;
                    public void run()
                    {
                        System.out.println(countdown);			
                        popupText.setText(countdown + "");
                        countdown--; 
                        if (countdown == -1)
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


//lmao hi ken

