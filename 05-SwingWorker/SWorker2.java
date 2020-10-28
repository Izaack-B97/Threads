import javax.swing.*;
import java.util.*;

public class SWorker2 extends SwingWorker<Boolean, Integer> {
    public String name;
    JLabel texto1, resultado, resultadoT;
    public int cantidad, time;
    public SWContenedor swContenedor;

    public SWorker2(String name) {
        this.name = name;
    }

    protected Boolean doInBackground() {

        for(int i = 1; i <= cantidad; i++) {

            try { Thread.sleep(time); } catch (Exception e) { }
            resultado.setText(Integer.toString(i));

            publish(1);
        }

        return true;
    }

    protected void process(List<Integer> value) {
        for(int number : value) {
            swContenedor.setCantidad(number);
            resultadoT.setText(Integer.toString(swContenedor.getCantidad()));
        }
    }   

    protected void done() {
        texto1.setText(texto1.getText() + this.name + " ");
    }



}