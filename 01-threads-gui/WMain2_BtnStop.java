import javax.swing.*;
import java.awt.event.*;

public class WMain2_BtnStop extends JButton implements ActionListener {

    private String name;

    public WMain2_BtnStop (String name) {
        this.name = name;
    }

    public void initValues () {
        this.setText(name);
    }

    public void actionPerformed (ActionEvent e) {

    }

}