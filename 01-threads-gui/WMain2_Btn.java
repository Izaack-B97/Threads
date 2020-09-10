import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class WMain2_Btn extends JButton implements Runnable, ActionListener{
    private String name;

    public WMain2_Btn(String name) {
        this.name = name;
    }

    public void initValues() {
        this.setText(name);
    }

    public void run() {

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Click en " + name);
    }

}