import java.util.concurrent.*;
import javax.swing.*;

public class EService2 {

    public JLabel texto1, texto2, texto3, texto4;
    private boolean status1, status2, status3, status4;
    public JButton btnStart;

    public void myExecute() {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.execute(() -> count10(texto1, 1000, "txt1"));
        executor.execute(() -> count10(texto2, 500, "txt2"));
        executor.execute(() -> moveLabel(texto3, 100));

        executor.execute(() -> {
            for(int i = 10; i >= 0; i--) {
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                texto4.setText(Integer.toString(i));
            }
            status4 = true;
            comprobar();
        });

        executor.shutdown();
    }

    private void count10(JLabel texto, int time, String name) {
        for(int i = 1; i <= 10; i ++) {
            try {
                Thread.sleep(time);
            } catch (Exception e) {
                //TODO: handle exception
            }
            texto.setText(Integer.toString(i));
        }

        if(name == "txt1") status1 = true;
        else status2 = true;
        comprobar();
    }

    private void moveLabel(JLabel texto, int time) {
        for(int x = 10; x <= 100; x ++) {
            texto.setBounds(x, 80, 40, 20);
            texto.setText(Integer.toString(x));

            try {
                Thread.sleep(time);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        status3 = true;
        comprobar();
    }


    private void comprobar() {
        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);
        System.out.println(status4);
        System.out.println("---------------------------");
        if(status1 && status2 && status3 && status4) btnStart.setEnabled(true);
    }
}