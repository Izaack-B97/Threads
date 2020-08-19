// Los threads nos ayudaran a hacer las animaciones
public class MyClass1 { 
    
     /**
        Una es extendiendo de la clase Thread y 
        *  otra desde la interface Runnable() pasandole
        * uyn thread como parametro a la instancia
    */

    // public static void main(String[] args) {
    //     MyClass2 mc = new MyClass2();

    //     // Este metodo hace correr el Thread
    //     mc.start();
        
    //     // Thread en una interface
    //     MyClass3 mc3 = new MyClass3();
    //     Thread th = new Thread(mc3);
    //     th.start();    
    // }   

    public static void main(String[] args) {
        
        /**
         Una es extendiendo de la clase Thread y 
         * y otra desde la interface Runnable() pasandole
         * un thread como parametro a la instancia
         */

        Thread t = Thread.currentThread(); // Nos dice que thread se esta ejecutando
        System.out.println("Thread Actual: \n" + t);
        t.setName("Principal");
        System.out.println("Despues del cambio: \n" + t);

        MyClass2 mc = new MyClass2("Hijo 1", 1000);
        mc.start();

        MyClass2 mc2 = new MyClass2("Hijo 2", 2000);
        mc2.start();
        
        try {
            // Join le indica que termine el proceso de un Thread 
            // para continuar con el otro proceso
            mc.join();
            mc2.join();

            System.out.print("Esperando a que finalize el programa");

            for(int i = 0 ; i <=3; i++) {
                t.sleep(2000);
                System.out.print(" . ");
            }

            System.out.println("\nBye! :( ");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}