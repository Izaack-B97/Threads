public class Main_th1 implements Runnable{

    boolean pausar, stop;

    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }

            try {
                // Sincronizacion por bloques 
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