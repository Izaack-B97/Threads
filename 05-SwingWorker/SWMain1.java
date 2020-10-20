import javax.swing.*;
import java.awt.event.*;

public class SWMain1 {

    public void show(){
        JFrame v = new JFrame("Swing Worker");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            //TODO: handle exception
        }

        JButton btnStart = new JButton("Start");
        JLabel texto1 = new JLabel("No se ha iniciado el Thread");
        
        btnStart.setBounds(10, 10, 70, 25);
        texto1.setBounds(10, 40, 160, 20);

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SWorker1 sw1 = new SWorker1();
                sw1.texto1 = texto1;
                sw1.execute();
            }
        });

        v.add(btnStart);
        v.add(texto1);

        v.setSize(300, 300);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String [] args) {
        SWMain1 sw = new SWMain1();
        sw.show();
    }

}