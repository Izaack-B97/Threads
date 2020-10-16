import javax.swing.*;

public class KMain {

    public void show() {
        JFrame v = new JFrame("Kemonito");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            //TODO: handle exception
        }

        v.setSize(300, 300);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);

        KBtn btnStart = new KBtn("Start");
        btnStart.setBounds(10, 10, 70, 20);
        btnStart.initValues();
        btnStart.addActionListener(btnStart);

        KMonito monito = new KMonito("Mario", "img/mario1.png", "img/mario2.png", 10);
        monito.setBounds(90, 10, 32, 39);
        monito.initValues();
        monito.addMouseListener(monito);

        KMonito monito2 = new KMonito("Link", "img/link1.png", "img/link2.png", 55);
        monito2.setBounds(90, 55, 32, 39);
        monito2.initValues();
        monito2.addMouseListener(monito2);

        JLabel resultado = new JLabel("Resultado: ");
        resultado.setBounds(10, 100, 120, 20);

        btnStart.monito = monito;
        btnStart.monito2 = monito2;
        
        v.add(btnStart);
        v.add(monito);
        v.add(monito2);
        v.add(resultado);

        v.setVisible(true);
    }

    public static void main (String[] args) {
        KMain k = new KMain();
        k.show();
    }

}