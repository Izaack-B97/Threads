import javax.swing.*;

public class KResultado {

    private boolean statusM, statusL;
    public JLabel resultado;
    public KMonito monito, monito2;
    
    public void setStatusM(boolean status) {
        this.statusM = status;
        // System.out.println(this.statusM);
    }

    public void setStatusL(boolean status) {
        this.statusL = status;
        // System.out.println(this.statusL);
    }

    public void miResultado() {
        if (statusM) { resultado.setText("Gano Mario"); }
        if (statusL) { resultado.setText("Gano Link"); }
        if (statusM == statusL) { resultado.setText("Empate"); }

        monito.stopHilo();
        monito2.stopHilo();
    }

    

}