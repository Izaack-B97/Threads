import javax.swing.*;

public class KResultado {

    private boolean statusM = false, statusL = false;
    public JLabel resultado;
    public KMonito monito, monito2;
    public KBtn btnStart;
    
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
        else if (statusL) { resultado.setText("Gano Link"); }
        else if (statusM == statusL) { resultado.setText("Empate"); }

        monito.stopHilo();
        monito2.stopHilo();

        System.out.println("Mario: " + statusM + " Link: " + statusL);

        // Habilitamos el boton start
        btnStart.setEnabled(true);

        statusM = false;
        statusL = false;
    }

    

}