import java.util.concurrent.*;

public class EService {

    public void myExecute() {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Grupo de Threads
        
        executor.execute(() -> myRun1("user 1",150));
        executor.execute(() -> myRun1("user 2",200));
        executor.execute(() -> myRun1("user 3",100));
        executor.execute(() -> myRun2());
        
        int timeX = 3000;
        
        xecutor.execute(() -> {
            try {
                Thread.sleep(timeX);
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("Fin de todo jeje! XD " + Thread.currentThread().getName());
        });
        
        executor.shutdown(); // Apaga todos los threads
    }


    private void myRun1(String name, int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println(name + ": " + Thread.currentThread().getName());
    }

    private void myRun2() {
        for(int i =1; i<= 10; i++) {
            System.out.print(i + ", ");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}