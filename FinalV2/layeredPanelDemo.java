import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.Color;

public class layeredPanelDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("EPIC");
        JLayeredPane lp = new JLayeredPane();
        JLabel label = new JLabel("Epic");
        JButton butt = new JButton();

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        label.setForeground(Color.RED);
        butt.setBackground(Color.BLACK);

        frame.setSize(new Dimension(1000,1000));
        frame.setLocationRelativeTo(null);

        lp.setBackground(Color.RED);

        lp.setPreferredSize(new Dimension(300,300));
        lp.setOpaque(true);

        lp.add(butt, new Integer(2));
        lp.add(label, new Integer(2));

        frame.add(lp);

        frame.setVisible(true);
    }
}