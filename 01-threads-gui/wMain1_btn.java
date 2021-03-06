import javax.swing.*;

public class wMain1_btn extends JButton implements Runnable {
    
    private String name;
    private boolean pausar, stop;
    public JButton btnReanudar, btnStop, btnPR, btnStopStart;

    public wMain1_btn(String name) {
        this.name = name;
    }
    
    public void initValues() {
        this.setText(name);
    }

    // Start run   
    public void run() {
        stop = false;
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
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("dfdfd");
            }
        }

        this.setText(name);
        this.setEnabled(true);
        
        if(this.getText() == "Click me !") {
            btnReanudar.setEnabled(false);
            btnStop.setEnabled(false);
        } 

        if(this.getText() == "Start") {
            btnStopStart.setEnabled(false);
            btnPR.setEnabled(false);
        }

        System.out.println(Thread.currentThread().getName());
    }
    // end run

    public synchronized void pausarHilo() {
        pausar = true;
        System.out.println("Pause");
    }

    public synchronized void reanudarHilo() {
        pausar = false; notify();
        System.out.println("Reanudar");
    }

    public synchronized void stopHilo() {
        stop = true;
        pausar = false;
        notify();
        System.out.println("Stop");
    
    }

}