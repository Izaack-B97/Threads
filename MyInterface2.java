public class MyInterface2 {
    
    // Sincronizacion de threads
    public static void main (String[] args) {

        MyInterface2Child2 mic1 = new MyInterface2Child2();
        
        Thread pepe = new Thread(mic1, "Pepe");
        Thread chuy = new Thread(mic1, "Chuy");

        pepe.start();
        chuy.start();
        
    }

}