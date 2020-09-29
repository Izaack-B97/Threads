import javax.swing.*;
import java.awt.event.*;

public class SBtns extends JButton implements ActionListener{
    
    private String name, url;
    private ImageIcon imageIcon;
    public SContenedor objCont;

    public SBtns(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }


    public void actionPerformed(ActionEvent e) {
        int c = objCont.getCantidad();
        c++;
        objCont.setCantidad(c);
        objCont.setText(Integer.toString(objCont.getCantidad()));
    }

}
