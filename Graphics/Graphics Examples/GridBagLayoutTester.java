import javax.swing.*;  // for JFrame
import java.awt.*;

public class GridBagLayoutTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Frame");
        JPanel panel = new JPanel();
        JButton butt1 = new JButton("Button 1");
        JButton butt2 = new JButton("Button 2");
        JButton butt3 = new JButton("Button 3");
        
        GridBagConstraints gbc = new GridBagConstraints();

        frame.setSize(500,500);

        panel.setLayout(new GridBagLayout());
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);            //gaps between button and borders

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(butt1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(butt2, gbc);

        gbc.gridwidth = 2;          //sets how many blocks it spans
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(butt3, gbc);


        frame.add(panel);
        frame.pack();                           //No white space
        frame.setLocationRelativeTo(null);      //always put after pack()
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}