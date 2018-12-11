import javax.swing.*;  // for JFrame
import java.awt.*;

public class ebicDance
{
    public static void main(String[] args)
    {
        JFrame win;
        JButton butt;
        JPanel panel;
        Graphics g;

        GridBagConstraints gbc = new GridBagConstraints();

        win = new JFrame("VERY EBIC"); 
        win.setLayout(new GridBagLayout()); 
        win.setSize(700,500);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        butt = new JButton("Click Me");
        butt.setPreferredSize(new Dimension(200,75));
        gbc.gridx = 50;
        gbc.gridy = 50;

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        
        panel.add(butt);
        win.add(panel);

        
        win.setVisible(true);
    }
}