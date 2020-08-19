public class MyClass2 extends Thread {
    
    Thread t;
    int time; 

    public MyClass2(String name, int time) {
        t = new Thread(this, name);
        this.time = time;
    }
    
    // El Thread se va a ejecutar con el metodo run
    public void run() {
        for(int i = 1; i <=10; i++) {
            
            System.out.println("Hijo: " + t + " --> " + i);
            
            try {
                t.sleep(time);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    } 
}