public class MyInterfaceChild1 implements Runnable {
    
    public String name;
    public int time;

    public void run() {

         for(int i = 1; i <= 10; i++) {
            System.out.println("Thread " + name + ": " + i);
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                 System.out.println(e);
            }
         }

    }
}