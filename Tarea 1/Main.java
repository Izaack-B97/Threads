public class Main {
    
    public static void main (String[] args) {

        ClaseHija ch = new ClaseHija();

        Thread t1 = new Thread(ch);
        t1.start();
    
        try {
            Thread.sleep(20000);
            System.out.println("\nPausando hilo . . .");
            ch.pausarHilo();

            Thread.sleep(2000);
            System.out.println("Reanudando hilo . . .");
            ch.reanudarHilo();
            
            Thread.sleep(20000);
            System.out.println("\nPausando hilo . . .");
            ch.pausarHilo();

            Thread.sleep(2000);
            System.out.println("Reanudando hilo . . .");
            ch.reanudarHilo();

            Thread.sleep(30000);
            System.out.println("Terminando hilo . . .");
            System.out.println("Fin del Thread Principal, Bye ! :(");
            ch.stopHilo();

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }

}