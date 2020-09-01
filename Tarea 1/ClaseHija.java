public class ClaseHija implements Runnable{

    private boolean pausar, stop;

    public void run() {
        for(int i = 1; i <= 100; i++) {
            String numero = String.valueOf(i);
          
            if(numero.length() == 1) {
                System.out.print(" 0" + numero);
            } else {
                if(i % 10 == 0) {
                    System.out.println(" " + numero);
                } else {
                    System.out.print(" " + numero);
                }                
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
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
    }

    public synchronized void pausarHilo() {
        pausar = true;
    }

    public synchronized void reanudarHilo() {
        pausar = false;
        notify(); // Despierta al hilo
    }

    public synchronized void stopHilo() {
        stop = true;
        pausar = false;
        notify();
    }

}