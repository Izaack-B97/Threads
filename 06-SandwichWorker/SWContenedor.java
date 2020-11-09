import javax.swing.*;

public class SWContenedor extends JLabel {

  private String name;
  private int cantidad = 0;

  public SWContenedor(String name) {
    this.name = name;
  }

  public void initValues() {
    this.setText(name);
  }

  public void setCantidad(int cantidad) { this.cantidad = cantidad; }
  public int getCantidad() { return cantidad; }

}
