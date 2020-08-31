public class MainT1 {
    
    public static void main(String[] args) {

        Main_th1 m1 = new Main_th1();

        Thread t1 = new Thread(m1);
        t1.start();

        try {
            Thread.sleep(2000);
            System.out.println("Pausando el thread . . .");
            m1.pausarHilo();

            Thread.sleep(3000);
            System.out.println("Reanudando el thread . . ");
            m1.reanudarHilo();

            Thread.sleep(3000);
            System.out.println("Pausando el thread . . .");
            m1.pausarHilo();

            Thread.sleep(3000);
            System.out.println("Reanudando el thread . . ");
            m1.reanudarHilo();

            Thread.sleep(2000);
            System.out.println("Pausando el thread . . .");
            m1.pausarHilo();

            Thread.sleep(2000);
            System.out.println("Stopping thread . . .");
            m1.stopHilo();
        } catch (Exception e) {
            //TODO: handle exception
        }

        // wait() -> Pausa un thread
        // notify() -> Despierta al thread
    }

}