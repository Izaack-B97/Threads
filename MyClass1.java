// Los threads nos ayudaran a hacer las animaciones
public class MyClass1 { 
    
     /**
         Una es extendiendo de la clase Thread y 
         * y otra desde la interface Runnable() pasandole
         * un thread como parametro a la instancia
         */

    public static void main(String[] args) {
        MyClass2 mc = new MyClass2();

        // Este metodo hace correr el Thread
        mc.start();
        
        // Thread en una interface
        MyClass3 mc3 = new MyClass3();
        Thread th = new Thread(mc3);
        th.start();
    }   
}