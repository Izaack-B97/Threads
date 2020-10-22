import javax.swing.*;
import java.util.List;

public class SWorker1 extends SwingWorker<Boolean, Integer> {

    public JLabel texto1, tResultado;
    public JProgressBar pb;
    public JButton btnReset;
    private boolean stop;

    protected Boolean doInBackground() {
        System.out.println("Thread doInBackgound(): " + Thread.currentThread().getName());
        texto1.setText("Thread iniciado");

        for(int i = 0; i <= 10; i++) {
            //System.out.print(i + ", ");            
            tResultado.setText(String.valueOf(i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }

            try {
                if(stop) { break; }
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            if(i == 3) { publish(i); }
            if(i == 6) { publish(i); }
            if(i == 10) { publish(i); }

        }

        return true;
    }

    protected void process(List<Integer> value) {
        System.out.println("Thread process(): " + Thread.currentThread().getName());
        for(int number : value) {
            // System.out.print(number + ", ");
            pb.setValue(number * 10);
        }
    }

    protected void done() {
        System.out.println("Thread done(): " + Thread.currentThread().getName());
        btnReset.setEnabled(true);
        try {
            texto1.setText("Fin del Thread, Valor: " + get());
            System.out.println("Valor regresado: " + get());
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public synchronized void stopHilo() { stop = true; }

}
