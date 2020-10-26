import javax.swing.*;
import java.util.*;

public class SWorker2 extends SwingWorker<Boolean, Integer> {

    JLabel texto1, resultado;
    public int cantidad, time;

    protected Boolean doInBackground() {

        for(int i = 1; i <= cantidad; i++) {

            try { Thread.sleep(time); } catch (Exception e) { }
            resultado.setText(Integer.toString(i));

        }

        return true;
    }

    protected void done() {
        texto1.setText("");
    }



}