import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Color;

public class JSwingTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Epic");

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        frame.setSize(new Dimension(1000,1000));
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.RED);

        panel.setSize(new Dimension(900,900));
        panel.setLayout(layout);
        panel.setBackground(Color.BLUE);

        panel2.setBackground(Color.GREEN);

        panel2.add(label);

        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;

        panel.add(panel2, c);

        frame.add(panel);

        frame.setVisible(true);
    }
}