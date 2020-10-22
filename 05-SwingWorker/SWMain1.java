import javax.swing.*;
import java.awt.event.*;

public class SWMain1 {
    SWorker1 sw1;

    public void show(){
        JFrame v = new JFrame("Swing Worker");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            //TODO: handle exception
        }

        JButton btnStart = new JButton("Start");
        JButton btnReset = new JButton("Reset");
        JButton btnStop = new JButton("Stop");
        btnStop.setEnabled(false);
        JLabel texto1 = new JLabel("No se ha iniciado el Thread");
        JLabel tResultado = new JLabel("0");
        JProgressBar pb = new JProgressBar();
        
        
        btnStart.setBounds(10, 10, 70, 25);
        texto1.setBounds(10, 40, 160, 20);
        btnReset.setBounds(90, 10, 70, 25);
        btnReset.setEnabled(false); 
        btnStop.setBounds(200, 10, 70, 20);
        tResultado.setBounds(170, 10, 40, 20);
        pb.setBounds(10, 70, 160, 20);

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sw1 = new SWorker1();
                sw1.texto1 = texto1;
                sw1.tResultado = tResultado;
                sw1.pb = pb;
                sw1.btnReset = btnReset;
                sw1.execute();
                btnStart.setEnabled(false);
                btnStop.setEnabled(true);
            }
        });

        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnStart.setEnabled(true);
                btnReset.setEnabled(false);
                texto1.setText("No se ha iniciado el thread");
                tResultado.setText("0");
            }
        });

        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sw1.stopHilo();
                btnStop.setEnabled(false);
                // btnStart.setEnabled(true);
            }
        });

        

        v.add(btnStart);
        v.add(btnReset);
        v.add(btnStop);
        v.add(texto1);
        v.add(tResultado);
        v.add(pb);

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