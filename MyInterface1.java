public class MyInterface1 {
    
    public static void main (String[] args) {

        MyInterfaceChild1 mic1 = new MyInterfaceChild1();
        
        mic1.name = "Pepe";
        mic1.time = 500;
        
        Thread t1 = new Thread(mic1);
        t1.start();

        MyInterfaceChild1 mic2 = new MyInterfaceChild1();
        
        mic2.name = "Chuy";
        mic2.time = 250;
        
        Thread t2 = new Thread(mic2);
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Fin al Thread Main! :D");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}