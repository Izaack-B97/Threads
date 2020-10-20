import javax.swing.*;

public class SWorker1 extends SwingWorker<Boolean, Void> {

    public JLabel texto1;

    protected Boolean doInBackground() {
        try {
            Thread.sleep(3000);
            System.out.println("Thread doInBackgound(): " + Thread.currentThread().getName());
        } catch (Exception e) {
            //TODO: handle exception
        }
        return true;
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
