import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Screen extends JPanel 
{
    private GridBagLayout layout;
    private GridBagConstraints c;

    public Screen() 
    {
        layout = new GridBagLayout();
        c = new GridBagConstraints();

        this.setLayout(layout);
        this.setBackground(Color.WHITE);
    }

}