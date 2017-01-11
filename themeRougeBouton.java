import javax.swing.*;
import java.awt.*;

public class themeRougeBouton extends JButton implements InterfaceBouton{
    public JButton createButton() {
        JButton but = new JButton("themeRouge");
        but.setBackground(Color.RED);
        return but;
    }
}