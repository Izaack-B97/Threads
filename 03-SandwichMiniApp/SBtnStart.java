import javax.swing.*;
import java.awt.event.*;

public class SBtnStart extends JButton implements ActionListener{
    private String name, url;
    private ImageIcon imageIcon;
    public SContenedor cPan, cHam, cSandwiches;
    public SBtnTimes btnTimes;
    public SUser user;


    public SBtnStart(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }

    public void actionPerformed(ActionEvent e) {
        if (cPan.getCantidad() >= 2 && cHam.getCantidad() >= 1 &&
            cSandwiches.getCantidad() >= 1 && btnTimes.getTMP() > 0 &&
            btnTimes.getTMP() > 0 &&  btnTimes.getTUP() > 0) {
            // *********************************************
            // System.out.println("Hay recursos");

            Thread t = new Thread(user);
            t.start();

        } else {
            System.out.println("No hay recursos o los tiempos son cero !");
        }

    }   
}
