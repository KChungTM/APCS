import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container

public class graphicx2
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;

        Color yellow = new Color(255, 255, 94);
        int screenWidth = 1800;
        int screenHeight = 1200;

        ImageIcon icon = new ImageIcon("Icon.jpg");
      
        win = new JFrame("My First Graphics");  // window setup
        win.setIconImage(icon.getImage());
        win.setSize(screenWidth, screenHeight);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
      
        try {Thread.sleep(400);} catch (Exception e) {}
      
        // background
        g.setColor(new Color(174, 249, 249));
        g.fillRect(0, 0, 1800, 1200);
       
        // head
        g.setColor(yellow);
        g.fillRoundRect(800, 200, 170, 170, 40, 60);

        // eyes
        g.setColor(Color.BLACK);
        g.fillOval(840, 250, 20, 20);
        g.fillOval(900, 250, 20, 20);

        // smile
        g.setColor(Color.BLACK);
        g.fillOval(836, 290, 90, 50);
        g.setColor(yellow);
        g.fillOval(836, 280, 90, 50);

        // left arm
        g.setColor(yellow);
        g.fillRect(670, 390, 80, 200);
        g.fillRect(1020, 390, 80, 200);

        // shirt
        g.setColor(new Color(45,137, 237));
        g.fillRoundRect(750, 370, 270, 300, 40, 60);

        // legs
        g.setColor(new Color(107,186, 65));
        g.fillRect(770, 670, 100, 150);
        g.fillRect(900, 670, 100, 150);

        boolean isGreen = false;
        int rgbVal = 0;

        while(true)
        {
            if (isGreen)
            {
                if(rgbVal<255)
                {
                    g.setColor(new Color(0,rgbVal,0));
                    rgbVal= rgbVal+10;
                }
                else
                {
                    isGreen=!isGreen;
                    rgbVal=0;
                }
            }
            else
            {
                if(rgbVal<255)
                {
                    g.setColor(new Color(rgbVal,0,0));
                    rgbVal= rgbVal+10;
                }
                else
                {
                    isGreen=!isGreen;
                    rgbVal=0;
                }
            }

            try{
                Thread.sleep(100);
                
                g.fillOval(850, 100, 50, 50);

                g.fillOval(1050, 300, 50, 50);

                g.fillOval(1250, 500, 50, 50);

                g.fillOval(1050, 700, 50, 50);

                g.fillOval(850, 900, 50, 50);
        
                g.fillOval(650, 700, 50, 50);

                g.fillOval(450, 500, 50, 50);

                g.fillOval(650, 300, 50, 50);
            }
            catch(Exception e) {} 
        }
    }
}
