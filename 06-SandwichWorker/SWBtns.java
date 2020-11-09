import javax.swing.*;
import java.awt.event.*;

public class SWBtns extends JButton implements ActionListener {

  private String url;
  private ImageIcon imageIcon;
  public SWContenedor objContenedor;

  public SWBtns(String url) {
    this.url = url;
  }

  public void initValues() {
    imageIcon = new ImageIcon(this.getClass().getResource(url));
    this.setIcon(imageIcon);
  }

  public void actionPerformed(ActionEvent e) {
    int c = objContenedor.getCantidad();
    c++;
    objContenedor.setCantidad(c);
    objContenedor.setText(Integer.toString(objContenedor.getCantidad()));
  } //end actionPerformed

}
