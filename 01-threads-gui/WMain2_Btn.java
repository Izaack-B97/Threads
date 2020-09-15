import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class WMain2_Btn extends JButton implements Runnable, ActionListener{
    private String name;
    private boolean pausar, stop;

    public WMain2_Btn(String name) {
        this.name = name;
    }

    public void initValues() {
        this.setText(name);
    }

    public void run() {
        for (int i = 0; i <= 10; i ++) {
            this.setText(Integer.toString(i));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }

            try {
                synchronized(this) {
                    while(pausar) {
                        wait();
                    }

                    if(stop) {
                        break;
                    }
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        this.setEnabled(true);
        this.setText(name);
    }

    public void actionPerformed(ActionEvent e) {
        // System.out.println("Click en " + name);
        this.setEnabled(false);
        Thread t = new Thread(this, name);
        t.start();
    }

    public synchronized void pausarHilo() {
        pausar = true;
    }

    public synchronized void reanudarHilo() {
        pausar = false;
        notify();
    }

    public synchronized void stopHilo() {
        stop = true;
        pausar = false;
        notify();
    }

}