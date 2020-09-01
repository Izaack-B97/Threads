public class SPR1 {

    public static void main(String[] args) {

        SPR1_th1 s1 =  new SPR1_th1();

        Thread t1 = new Thread(s1);
        t1.start();

        // try {
        //     Thread.sleep(20000);
        //     System.out.print("Pausando hilo . . .");
        //     s1.pausarHilo();

        //     Thread.sleep(3000);
        //     System.out.print("Reanudando hilo . . .");
        //     s1.reanudarHilo();

        //     Thread.sleep(20000);
        //     System.out.print("Pausando hilo . . .");
        //     s1.pausarHilo();

        //     Thread.sleep(3000);
        //     System.out.print("Reanudando hilo . . .");
        //     s1.reanudarHilo();

        //     Thread.sleep(20000);
        //     System.out.print("Pausando hilo . . .");
        //     s1.pausarHilo();

        //     Thread.sleep(30000);
        //     System.out.print("Stopping hilo . . .");
        //     s1.stopHilo();

        //     System.out.println("Adios al main !");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}