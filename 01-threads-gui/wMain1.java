import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wMain1 {

    public void show() {
        JFrame v1 = new JFrame("Mi ventana 1");

        Font f1 = new Font("Courier New", 1, 14);

        wMain1_btn btn1 = new wMain1_btn("Click me !");
        btn1.initValues();
        btn1.setFont(f1);
        btn1.setBounds(10, 10, 150, 20); // (x, y, width, height)

        wMain1_btn btn2 = new wMain1_btn("Start");
        btn2.initValues();
        btn2.setBounds(10, 40, 150, 20);

        JButton btnReanudar =  new JButton("P/R");
        btnReanudar.setBounds(170, 40, 70, 20);

        JButton btnStop = new JButton("Stop");
        btnStop.setBounds(170, 10, 70, 20);

        // ActionsListener
        ActionListener listener = new ActionListener() { 
            // Clase anonima
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btn1) {
                    // System.out.println("Click en el btn1 !");
                    btn1.setEnabled(false);
                    Thread t1 = new Thread(btn1);
                    t1.start();
                } 

                if(e.getSource() == btn2) {
                    System.out.println("Click en el btn2 !");
                } 

                if (e.getSource() == btnReanudar) {

                }

                if (e.getSource() == btnStop) {
                    btn1.stopHilo();
                }
            }

        };

        // Agregamos el listener a los botones
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btnReanudar.addActionListener(listener);
        btnStop.addActionListener(listener);

        // Agregamos el boton al frame
        v1.add(btn1); 
        v1.add(btn2);
        v1.add(btnReanudar);
        v1.add(btnStop);

        v1.setSize(300, 300);
        v1.setResizable(false); // No puedes cambiar el size
        v1.setLayout(null);
        v1.setLocationRelativeTo(null); // Centro de la pantalla
        v1.setDefaultCloseOperation(v1.EXIT_ON_CLOSE); // No deja ninguna operacion colgada
        v1.setVisible(true);
    }
    
    
    public static void main(String[] args) {

        wMain1 m = new wMain1();
        m.show();

    }

}