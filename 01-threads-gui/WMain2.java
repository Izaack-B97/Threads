import javax.swing.*;


public class WMain2 {

    public void show() {
        JFrame v1 = new JFrame("Mi Ventana 2");

        WMain2_Btn btn1 = new WMain2_Btn("Click me !");
        btn1.initValues();
        btn1.setBounds(10, 10, 70, 20);
        
        btn1.addActionListener(btn1);

        WMain2_Btn btn2 = new WMain2_Btn("Start");
        btn2.initValues();
        btn2.setBounds(10, 40, 70, 20);

        btn2.addActionListener(btn2);

        WMain2_BtnPR btnPR = new WMain2_BtnPR("PR");
        btnPR.initValues();
        btnPR.setBounds(90, 10, 70, 20);
        btnPR.setEnabled(false);
        btnPR.addActionListener(btnPR);

        WMain2_BtnStop btnStop = new WMain2_BtnStop("Stop");
        btnStop.initValues();
        btnStop.setBounds(170, 10, 70, 20);
        btnStop.setEnabled(false);
        btnStop.addActionListener(btnStop);

        btn1.btnPR = btnPR;
        btn1.btnStop = btnStop;
        btnPR.btn1 = btn1;
        btnStop.btn1 = btn1;
        btnStop.btnPR = btnPR;

        v1.add(btn1);
        v1.add(btn2);
        v1.add(btnPR);
        v1.add(btnStop);

        v1.setSize(300, 300);
        v1.setResizable(false);
        v1.setLayout(null);
        v1.setLocationRelativeTo(null);
        v1.setDefaultCloseOperation(v1.EXIT_ON_CLOSE);

        v1.setVisible(true);
    }
    
    public static void main (String[] args) {
        WMain2 w = new WMain2();
        w.show();
    }

}