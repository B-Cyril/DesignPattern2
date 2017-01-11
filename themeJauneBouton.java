import javax.swing.*;
import java.awt.*;

/**
 * Created by Cyril on 07/01/2017.
 */

public class themeJauneBouton extends JButton implements InterfaceBouton {
    public JButton createButton() {
        JButton but =  new JButton("themeJaune");
        but.setBackground(Color.YELLOW);
        return but;
    }
}

