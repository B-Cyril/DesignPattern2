import javax.swing.*;
import java.awt.*;


public class themeJauneBouton extends JButton implements InterfaceBouton {
    public JButton createButton() {
        JButton but =  new JButton("themeJaune");
        but.setBackground(Color.YELLOW);
        return but;
    }
}

