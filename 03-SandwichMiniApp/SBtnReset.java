import javax.swing.*;
import java.awt.event.*;

public class SBtnReset extends JButton implements ActionListener{
    
    private String name, url;
    private ImageIcon imageIcon;
    public SContenedor cPan, cHam, cSandwiches;
    public SBtnTimes btnTimes;
    
    public SBtnReset(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }

    public void actionPerformed(ActionEvent e) {
        cPan.setCantidad(0);
        cPan.setText("0");
        cHam.setCantidad(0);
        cHam.setText("0");
        cSandwiches.setCantidad(0);
        cSandwiches.setText("0");

        btnTimes.setTMP(0.0);
        btnTimes.setTPH(0.0);
        btnTimes.setTUP(0.0);

    }


}
