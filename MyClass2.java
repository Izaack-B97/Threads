public class MyClass2 extends Thread {
    
    Thread t;

    public MyClass2(String name) {
        t = new Thread(this, name);
    }
    
    // El Thread se va a ejecutar con el metodo run
    public void run() {
        for(int i = 0; i <=10; i++) {
            
            System.out.println("Hijo: " + t + " --> " + i);
            
            try {
                t.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    } 
}