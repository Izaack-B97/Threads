public class MyClass2 extends Thread {
    
    Thread t;

    public MyClass2() {
        t = new Thread(this, "Hijo 1");
    }
    
    // El Thread se va a ejecutar con el metodo run
    public void run() {
        System.out.println("Hijo" + t);
    } 
}