import javax.swing.*;


public class SMain {
    

    public void show() {
        JFrame v = new JFrame("Sandwich Mini");

        SBtns btnPan = new SBtns("btnPan", "images/bread.png");
        btnPan.initValues();

        SUser user =  new SUser("User", "images/user.png");
        user.initValues();

        JLabel lpan = new JLabel(new ImageIcon(this.getClass().getResource("images/bread.png")));

        SContenedor cPan = new SContenedor("0");
        cPan.initValues();

        SBtns btnHam = new SBtns("BtnHam", "images/ham.png");
        btnHam.initValues();

        JLabel lham = new JLabel(new ImageIcon(this.getClass().getResource("images/ham.png")));
        
        SContenedor cHam = new SContenedor("0");
        cHam.initValues();

        JLabel lpan2 = new JLabel(new ImageIcon(this.getClass().getResource("images/bread.png")));


        btnPan.objCont = cPan;
        btnHam.objCont = cHam;

        btnPan.setBounds(10, 10, 35, 35);
        user.setBounds(10, 45, 40, 40);
        lpan.setBounds(10, 80, 35, 35);
        cPan.setBounds(40, 95, 30, 20);
        btnHam.setBounds(45, 10, 35, 35); 
        lham.setBounds(55, 80, 35, 35);
        cHam.setBounds(85, 95, 30, 20);
        lpan2.setBounds(100, 80, 35, 35);

        btnPan.addActionListener(btnPan);
        btnHam.addActionListener(btnHam);

        v.add(btnPan);
        v.add(user);
        v.add(lpan);
        v.add(cPan);
        v.add(btnHam);
        v.add(lham);
        v.add(cHam);
        v.add(lpan2);

        v.setSize(300, 220);
        v.setResizable(false);
        v.setLayout(null);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
        v.setVisible(true);
    }
    public static void main(String[] args) {
        SMain s = new SMain();

        s.show();
    }

}
