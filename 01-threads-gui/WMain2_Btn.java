import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class WMain2_Btn extends JButton implements Runnable, ActionListener{
    private String name;
    private boolean pausar, stop;
    public WMain2_BtnPR btnPR;
    public WMain2_BtnStop btnStop;

    public WMain2_Btn(String name) {
        this.name = name;
    }

    public void initValues() {
        this.setText(name);
    }

    public void run() {
        System.out.println("Iniciando hilo . . .");
        stop = false;

        for (int i = 0; i <= 10; i ++) {
            this.setText(Integer.toString(i));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error " + e);
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
                System.out.println("Error " + e);
            }
        }
        this.setEnabled(true);
        this.setText(name);
        btnPR.setEnabled(false);
        btnStop.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        // System.out.println("Click en " + name);
        this.setEnabled(false);
        btnPR.setEnabled(true);
        btnStop.setEnabled(true);
        Thread t = new Thread(this, name);
        t.start();
    }

    public synchronized void pausarHilo() {
        System.out.println("pausando hilo");
        pausar = true;
    }

    public synchronized void reanudarHilo() {
        System.out.println("reanuando hilo");
        pausar = false;
        notify();
    }

    public synchronized void stopHilo() {
        System.out.println("parando hilo");
        stop = true;
        pausar = false;
        notify();
    }

}