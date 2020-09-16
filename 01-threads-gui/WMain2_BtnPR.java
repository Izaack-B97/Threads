import javax.swing.*;
import java.awt.event.*;

public class WMain2_BtnPR extends JButton implements ActionListener {

    private String name;
    public int status = 0;
    public WMain2_Btn btn1;

    public WMain2_BtnPR (String name) {
        this.name = name;
    }

    public void initValues () {
        this.setText(name);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(status);
        if(status == 0) {
            btn1.pausarHilo();
            status = 1;
        } else {
            btn1.reanudarHilo();
            status = 0;
        }
    }

    

}