import javax.swing.*;
import java.awt.event.*;


public class KBtn extends JButton implements ActionListener {

    private String name;
    public KMonito monito, monito2;

    public KBtn(String name) {
        this.name = name;
    }

    public void initValues() {
        this.setText(name);
    }

    public void actionPerformed(ActionEvent e) {
        this.setEnabled(false);
        Thread t = new Thread(monito, name);
        t.start();
        Thread t2 = new Thread(monito2, name);
        t2.start();
    }

}