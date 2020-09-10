import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wMain1 {

    boolean status = true;
    boolean status2 = true;

    public void show() {
        JFrame v1 = new JFrame("Mi ventana 1");

        Font f1 = new Font("Courier New", 1, 14);

        wMain1_btn btn1 = new wMain1_btn("Click me !");
        btn1.initValues();
        btn1.setFont(f1);
        btn1.setBounds(10, 10, 150, 20); // (x, y, width, height)

        wMain1_btn btn2 = new wMain1_btn("Start");
        btn2.initValues();
        btn2.setBounds(10, 80, 150, 20);

        JButton btnReanudar =  new JButton("P/R");
        btnReanudar.setBounds(170, 40, 100, 20);
        btnReanudar.setEnabled(false);

        JButton btnStop = new JButton("Stop");
        btnStop.setBounds(170, 10, 100, 20);
        btnStop.setEnabled(false);

        btn1.btnReanudar = btnReanudar;
        btn1.btnStop = btnStop;

        /**
         * TODO: Ejemplo del profesot
         * btn2.btnReanudar = btnPR;
         * btn2.btnStop = btnStopStart;
         */
        
        // Todo el rollo del segundo grupo de botones
        JButton btnPR = new JButton("PR Start");
        btnPR.setBounds( 170, 80, 100, 20);
        btnPR.setEnabled(false);

        JButton btnStopStart = new JButton("Stop Start");
        btnStopStart.setBounds(170, 110, 100, 20);
        btnStopStart.setEnabled(false);

        btn2.btnPR = btnPR;
        btn2.btnStopStart = btnStopStart;
        // Fin del rollo del boton 2

        // ActionsListener
        ActionListener listener = new ActionListener() { 
            // Clase anonima
            public void actionPerformed(ActionEvent e) {
                /** El rollo para el primer grupo de botones */
                if(e.getSource() == btn1) {
                    // System.out.println("Click en el btn1 !");
                    btn1.setEnabled(false);
                    Thread t1 = new Thread(btn1);
                    t1.start();

                    btnReanudar.setEnabled(true);
                    btnStop.setEnabled(true);
                } 

                if (e.getSource() == btnReanudar) {
                    if (status) {
                        btn1.pausarHilo();
                        status = false;
                    } else {
                        btn1.reanudarHilo();
                        status = true;
                    }
                }

                if (e.getSource() == btnStop) {
                    btn1.stopHilo();
                    status = true;
                }

                
                /** El rollo para el segundo grupo de  botones */
                if(e.getSource() == btn2) {
                    // System.out.println("Click en el btn2 !");
                    btn2.setEnabled(false);
                    Thread t = new Thread(btn2);
                    t.start();

                    btnPR.setEnabled(true);
                    btnStopStart.setEnabled(true);
                } 

                if (e.getSource() == btnPR) {
                    // System.out.println("btnPR");
                    if (status2) {
                        btn2.pausarHilo();
                        status2 = false;
                    } else {
                        btn2.reanudarHilo();
                        status2 = true;
                    }
                }

                if(e.getSource( ) == btnStopStart) {
                    // System.out.println("btnStopStart");
                    btn2.stopHilo();
                    status2 = true;
                }

            }

        };

        // Agregamos el listener a los botones
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btnReanudar.addActionListener(listener);
        btnStop.addActionListener(listener);
        btnPR.addActionListener(listener);
        btnStopStart.addActionListener(listener);

        // Agregamos el boton al frame
        v1.add(btn1); 
        v1.add(btn2);
        v1.add(btnReanudar);
        v1.add(btnStop);
        v1.add(btnPR);
        v1.add(btnStopStart);

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