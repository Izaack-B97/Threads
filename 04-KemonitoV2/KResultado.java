import javax.swing.*;

public class KResultado {

    private boolean statusM, statusL;
    public JLabel resultado;
    
    public void setStatusM(boolean status) {
        this.statusM = status;
    }

    public void setStatusL(boolean status) {
        this.statusM = status;
    }

    public void miResultado() {
        if (statusM) { resultado.setText("Gano Mario"); }
        if (statusL) { resultado.setText("Gano Link"); }
        if (statusM == statusL) { resultado.setText("Empate"); }
    }

}