import javax.swing.*;

public class wMain1_btn extends JButton implements Runnable {
    
    private String name;
    private boolean pausar, stop;
    
    public wMain1_btn(String name) {
        this.name = name;
    }
    
    public void initValues() {
        this.setText(name);
    }

    // Start run   
    public void run() {
        for (int i = 0; i <= 10; i++) {
            this.setText(Integer.toString(i));
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}

            try {
                synchronized(this) {
                    while(pausar) {
                        wait();
                    }

                    if(stop){
                        break;
                    }
                }
            } catch (Exception e) {}
        }

        this.setText(name);
        this.setEnabled(true);
    }
    // end run

    public synchronized void pausarHilo() {
        pausar = true;
    }

    public synchronized void reanudarHilo() {
        pausar = false; notify();
    }

    public synchronized void stopHilo() {
        stop = true;
        pausar = false;
        notify();
    }

}