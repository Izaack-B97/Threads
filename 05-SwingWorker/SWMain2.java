import javax.swing.*;
import java.awt.event.*;

public class SWMain2 {

    SWContenedor swContenedor = new SWContenedor();

    public void show() {
        JFrame v = new JFrame("Contenedores");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            //TODO: handle exception
        }

        JButton  btnStart = new JButton("Start");
        JLabel texto1 = new JLabel("Thread End: ");
        JLabel resultado1 = new JLabel("0");
        JLabel resultado2 = new JLabel("0");
        JLabel resultadoT = new JLabel("0");


        btnStart.setBounds(10, 10, 70, 25);
        texto1.setBounds(10, 40, 200, 20);
        resultado1.setBounds(10, 70, 40, 25);
        resultado2.setBounds(10, 100, 40, 25);
        resultadoT.setBounds(40, 70, 200, 20);

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                swContenedor.setCantidad2(0);
                texto1.setText("Thread end: ");

                SWorker2 swUser1 = new SWorker2("User 1");
                swUser1.texto1 = texto1;
                swUser1.resultado = resultado1;
                swUser1.cantidad = 7;
                swUser1.time = 1000;
                swUser1.swContenedor = swContenedor;
                swUser1.resultadoT = resultadoT;
                swUser1.execute();

                SWorker2 swUser2 = new SWorker2("User 2");
                swUser2.texto1 = texto1;
                swUser2.resultado = resultado2;
                swUser2.cantidad = 5;
                swUser2.time = 1500;
                swUser2.swContenedor = swContenedor;
                swUser2.resultadoT = resultadoT;
                swUser2.execute();
            }
        });

        v.add(btnStart);
        v.add(texto1);
        v.add(resultado1);
        v.add(resultado2);
        v.add(resultadoT);

        v.setSize(300, 300);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        v.setVisible(true);

    }

    public static void main(String[] args) {
        SWMain2 sw = new SWMain2();
        sw.show();
    }

}