
import javax.swing.*;
import java.awt.event.*;

public class EMain2 {


    public void show() {
        
    JFrame v = new JFrame("Executor Service #1");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {}

        JButton btnStart = new JButton("Start");
        JLabel texto1 = new JLabel("0");
        JLabel texto2 = new JLabel("0");
        JLabel texto3 = new JLabel("0");
        JLabel texto4 = new JLabel("10");

        btnStart.setBounds(10, 10, 70, 25);
        texto1.setBounds(10, 40, 40, 20);
        texto2.setBounds(10, 60, 40, 20);
        texto3.setBounds(10, 80, 40, 20);
        texto4.setBounds(10, 100, 40, 20);

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnStart.setEnabled(false);
                EService2 es = new EService2();
                es.texto1 = texto1;
                es.texto2 = texto2;
                es.texto3 = texto3;
                es.texto4 = texto4;
                es.btnStart = btnStart;

                es.myExecute();
            }
        });

        v.add(btnStart);
        v.add(texto1);
        v.add(texto2);
        v.add(texto3);
        v.add(texto4);


        v.setSize(300,300);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        v.setVisible(true);
    }


    public static void main(String[] args) {
        EMain2 e= new EMain2();
        e.show();
    }

}