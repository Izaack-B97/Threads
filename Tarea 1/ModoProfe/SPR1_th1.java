public class SPR1_th1 implements Runnable {

    boolean pausar, stop;

    public void run() {
        for(int i = 1; i <= 100; i++) {
            if(i < 10) {
                System.out.print("0");
            }
            System.out.print(i + " ");

            if(i % 10 == 0) {
                System.out.println("");
            }
        
            try { Thread.sleep(500); } catch (Exception e) { }

            try {
                synchronized(this) {
                    while(pausar) {
                        wait();
                    }

                    if(stop) {
                        break;
                    }
                }
            } catch (Exception e) { }
        }
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