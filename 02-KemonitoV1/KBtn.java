import javax.swing.*;
import java.awt.event.*;


public class KBtn extends JButton implements ActionListener {

    private String name;
    public KMonito monito;

    public KBtn(String name) {
        this.name = name;
    }

    public void initValues() {
        this.setText(name);
    }

    public void actionPerformed(ActionEvent e) {
        Thread t = new Thread(monito, name);
        t.start();
    }

}