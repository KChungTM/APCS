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

        //popup = new JFrame();
        //popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
        //popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
        //popup.add(popupText);
        //popup.pack();
        //popup.setLocationRelativeTo(null);

        butt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                /*
                JFrame popup = new JFrame();
                JLabel popupText = new JLabel("Get ready in...",null,JLabel.CENTER);
                popupText.setPreferredSize(new Dimension(150,80));   //resizes PopUP
                popup.add(popupText);
                popup.pack();
                popup.setLocationRelativeTo(null);
                popup.setVisible(true);

                for (int i = 3; i > -1; i--)
                {
                    popupText.setText(i+"");

                    try{Thread.sleep(1500);}
                    catch(Exception e)
                    {

                    }
                }
                */
            
                Icon myImgIcon = new ImageIcon("C:/Users/Kennedy/Desktop/APCS/Graphics/Roblox.mp4");
                JLabel label = new JLabel(myImgIcon);
                label.setPreferredSize(new Dimension(500,500));    

                JFrame f = new JFrame("Animation");
                f.add(label);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setLocationRelativeTo(null);
                f.setVisible(true);
            }
        });       
    }
} 


//https://gfycat.com/fittingmaturegrizzlybear