import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container

public class graphic
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;

        Color yellow = new Color(255, 255, 94);
        int screenWidth = 900;
        int screenHeight = 600;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(screenWidth, screenHeight);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
      
        //  If you get a blank window, your computer's speed (lack thereof?)
        //  requires this delay in order to give the window time to appear
        //  before attempting to draw on it
        try {Thread.sleep(400);} catch (Exception e) {}
      
        // background
        g.setColor(new Color(255,94,94));
        g.fillRect(0, 0, 900, 600);
       
        // head
        g.setColor(yellow);
        g.fillRoundRect(400, 100, 85, 85, 20, 30);

        // eyes
        g.setColor(Color.BLACK);
        g.fillOval(420, 125, 10, 10);
        g.fillOval(450, 125, 10, 10);

        // smile
        g.setColor(Color.BLACK);
        g.fillOval(418, 145, 45, 25);
        g.setColor(yellow);
        g.fillOval(418, 140, 45, 25);

        // left arm
        g.setColor(yellow);
        g.fillRect(335, 195, 40, 100);
        g.fillRect(510, 195, 40, 100);

        // shirt
        g.setColor(new Color(45,137, 237));
        g.fillRoundRect(375, 185, 135, 150, 20, 30);

        // legs
        g.setColor(new Color(107,186, 65));
        g.fillRect(385, 335, 50, 75);
        g.fillRect(450, 335, 50, 75);

        boolean meme = true;
        int x = 10;
        int y = 10;
        boolean goingUp = false;
        boolean goingLeft = false;

        g.fillOval(425, 50, 25, 25);
        g.fillOval(425, 450, 25, 25);
        g.fillOval(575, 250, 25, 25);

        /* Red & Green Lights
        while(meme)
        {
            try{
                g.fillOval(x, y, 50, 50);
                if (goingUp)
                {

                }
                else
                {
                    if(x)
                }
            }
            catch(Exception e) {}
            x+=50;
        }
        */
    }
}