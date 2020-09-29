import javax.swing.*;

public class KMain {

    public void show() {
        JFrame v = new JFrame("Kemonito");

        v.setSize(300, 300);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);

        KBtn btnStart = new KBtn("Start");
        btnStart.setBounds(10, 10, 70, 20);
        btnStart.initValues();
        btnStart.addActionListener(btnStart);

        KMonito monito = new KMonito("0", "img/mario1.png");
        monito.setBounds(90, 10, 32, 39);
        monito.initValues();
        monito.addMouseListener(monito);

        btnStart.monito = monito;

        v.add(btnStart);
        v.add(monito);

        v.setVisible(true);

    }

    public static void main (String[] args) {
        KMain k = new KMain();
        k.show();
    }

}