import javax.swing.*;
import java.awt.event.*;

public class SWMain {

  public void show() {

    JFrame v = new JFrame("Sandwich v2");

    try {
      JFrame.setDefaultLookAndFeelDecorated(true);
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch(Exception e) {}

    SWBtns btnPan = new SWBtns("images/bread.png");
    btnPan.initValues();
    JLabel lpan = new JLabel(new ImageIcon(this.getClass().getResource("images/bread.png")));
    SWContenedor cPan = new SWContenedor("0");
    cPan.initValues();

    SWBtns btnHam = new SWBtns("images/ham.png");
    btnHam.initValues();
    JLabel lham = new JLabel(new ImageIcon(this.getClass().getResource("images/ham.png")));
    SWContenedor cHam = new SWContenedor("0");
    cHam.initValues();

    SWBtns btnSandwich = new SWBtns("images/sandwich2.png");
    btnSandwich.initValues();
    JLabel lsandwich = new JLabel("Cantidad de sandwiches a hacer: ");
    SWContenedor cSandwich = new SWContenedor("0");
    cSandwich.initValues();

    JButton btnStart = new JButton(new ImageIcon(this.getClass().getResource("images/start.png")));
    JButton btnReset = new JButton(new ImageIcon(this.getClass().getResource("images/reset.png")));

    JLabel user1 = new JLabel(new ImageIcon(this.getClass().getResource("images/user.png")));
    JLabel sandwich1 = new JLabel(new ImageIcon(this.getClass().getResource("images/sandwich.png")));
    SWContenedor cSandwich1 = new SWContenedor("0");
    cSandwich1.initValues();
    JLabel user2 = new JLabel(new ImageIcon(this.getClass().getResource("images/user.png")));
    JLabel sandwich2 = new JLabel(new ImageIcon(this.getClass().getResource("images/sandwich.png")));
    SWContenedor cSandwich2 = new SWContenedor("0");
    cSandwich2.initValues();

    btnPan.objContenedor = cPan;
    btnHam.objContenedor = cHam;
    btnSandwich.objContenedor = cSandwich;

    btnPan.addActionListener(btnPan);
    btnHam.addActionListener(btnHam);
    btnSandwich.addActionListener(btnSandwich);

    btnPan.setBounds(10,10,35,35);
    lpan.setBounds(10,45,35,35);
    cPan.setBounds(40,60,30,20);

    btnHam.setBounds(45,10,35,35);
    lham.setBounds(55,45,35,35);
    cHam.setBounds(85,60,30,20);

    btnSandwich.setBounds(80,10,35,35);
    lsandwich.setBounds(10,170,180,20);
    cSandwich.setBounds(190,170,40,20);

    btnStart.setBounds(115,10,35,35);
    btnReset.setBounds(150,10,35,35);

    user1.setBounds(10,85,40,40);
    sandwich1.setBounds(55,90,35,35);
    cSandwich1.setBounds(95,100,30,20);
    user2.setBounds(10,130,40,40);
    sandwich2.setBounds(55,135,35,35);
    cSandwich2.setBounds(95,145,30,20);

    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          Resultados resultados = new Resultados();
          boolean bandera1, bandera2;  

          SWorker u1 = new SWorker("User1");
          u1.cSandwich = cSandwich;
          u1.cPan = cPan;
          u1.cHam = cHam;
          u1.cSandwichT = cSandwich1;
          u1.time = 1000;
          u1.resultados = resultados;
          u1.execute();

          SWorker u2 = new SWorker("User2");
          u2.cSandwich = cSandwich;
          u2.cPan = cPan;
          u2.cHam = cHam;
          u2.cSandwichT = cSandwich2;
          u2.time = 500;
          u2.resultados = resultados;
          u2.execute();
      }
    });

    btnReset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cPan.setCantidad(0);
        cPan.setText("0");
        cHam.setCantidad(0);
        cHam.setText("0");
        cSandwich.setCantidad(0);
        cSandwich.setText("0");
        cSandwich1.setCantidad(0);
        cSandwich1.setText("0");
        cSandwich2.setCantidad(0);
        cSandwich2.setText("0");
      }
    });

    v.add(btnPan);
    v.add(lpan);
    v.add(cPan);
    v.add(btnHam);
    v.add(lham);
    v.add(cHam);
    v.add(btnSandwich);
    v.add(lsandwich);
    v.add(cSandwich);
    v.add(btnStart);
    v.add(btnReset);
    v.add(user1);
    v.add(sandwich1);
    v.add(cSandwich1);
    v.add(user2);
    v.add(sandwich2);
    v.add(cSandwich2);

    v.setSize(300,300);
    v.setResizable(false);
    v.setLayout(null);
    v.setLocationRelativeTo(null);
    v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
    v.setVisible(true);

  } //end show

  public static void main(String[] args) {
    SWMain sw = new SWMain();
    sw.show();
  }

}
