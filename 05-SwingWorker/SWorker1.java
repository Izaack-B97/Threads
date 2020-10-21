import javax.swing.*;
import java.util.List;

public class SWorker1 extends SwingWorker<Boolean, Integer> {

    public JLabel texto1, tResultado;

    protected Boolean doInBackground() {
        System.out.println("Thread doInBackgound(): " + Thread.currentThread().getName());

        for(int i = 0; i <= 10; i++) {
            //System.out.print(i + ", ");
            tResultado.setText(String.valueOf(i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            publish(i);
        }

        return true;
    }

    protected void process(List<Integer> value) {
        System.out.println("Thread process(): " + Thread.currentThread().getName());
        for(int number : value) {
            System.out.print(number + ", ");
        }
    }

    protected void done() {
        System.out.println("Thread done(): " + Thread.currentThread().getName());
        try {
            texto1.setText("Fin del Thread, Valor: " + get());
            System.out.println("Valor regresado: " + get());
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    

}
