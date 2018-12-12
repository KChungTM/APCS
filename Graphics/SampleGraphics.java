import javax.swing.*;  // for JFrame
import java.awt.*;     // for Graphics and Container

public class SampleGraphics
{  
    public static void main (String[] args)
    {
        JFrame win;                 // JFrame Graphics setup
        Container contentPane;
        Graphics g;
      
        win = new JFrame("My First Graphics");  // window setup
        win.setSize(300,200);
        win.setLocation(100,100);
        win.setVisible(true);
      
        contentPane = win.getContentPane();   // activates graphics in window
        g = contentPane.getGraphics();
      
        //  If you get a blank window, your computer's speed (lack thereof?)
        //  requires this delay in order to give the window time to appear
        //  before attempting to draw on it
         try {Thread.sleep(400);} catch (Exception e) {}
      
        g.drawRect(50,50,100,30);   // draws outline rectangle
      
        g.setColor(Color.GREEN);
       
        g.fillOval(100,150,50,20);  // draws solid ovals and circles
      
        // set color to any RGB value
        g.setColor(new Color(255,20,175));
       
        // draw a triangle
        Polygon tri1 = new Polygon();
        tri1.addPoint(200,100);
        tri1.addPoint(250,150);
        tri1.addPoint(180,180);
        g.fillPolygon(tri1);       // drawPolygon() would create outline only

   }
}