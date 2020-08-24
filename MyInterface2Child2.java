public class MyInterface2Child2 implements Runnable {
 
    

    private int cantidadTotal = 10;
 
    public void run() {

        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " solicita quitar un valor");
            quitarValor();
            System.out.println("");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Da accedo de manera ordenada a los threads
    private synchronized void quitarValor() {
        System.out.println(Thread.currentThread().getName() + " solicitud aceptada");
        cantidadTotal--;
        System.out.println(Thread.currentThread().getName() + " le quito valor a la cantidad total y ahora tenemos " + cantidadTotal);
    }


}