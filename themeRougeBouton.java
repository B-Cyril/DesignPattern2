import javax.swing.*;
import java.awt.*;
/**
 * Created by Cyril on 07/01/2017.
 */

public class themeRougeBouton extends JButton implements InterfaceBouton{
    public JButton createButton() {
        JButton but = new JButton("themeRouge");
        but.setBackground(Color.RED);
        return but;
    }
}