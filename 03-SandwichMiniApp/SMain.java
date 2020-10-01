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

        SBtns btnSandwiches = new SBtns("BtnSandwiches", "images/sandwich2.png");
        btnSandwiches.initValues();
        JLabel lsandwiches = new JLabel("Pedidos de Sandwich: ");
        SContenedor cSandwiches = new SContenedor("0");
        cSandwiches.initValues();

        SBtnTimes btnTimes =  new SBtnTimes("BtnTimes", "images/stopwatch.png");
        btnTimes.initValues();

        SBtnReset btnReset = new SBtnReset("BtnReset", "images/reset.png");
        btnReset.initValues();

        SBtnStart btnStart = new SBtnStart("BtnStart", "images/start.png");
        btnStart.initValues();

        btnStart.user = user;

        btnPan.objCont = cPan;
        btnHam.objCont = cHam;
        btnSandwiches.objCont = cSandwiches;

        btnReset.cPan = cPan;
        btnReset.cHam = cHam;
        btnReset.cSandwiches = cSandwiches;
        btnReset.btnTimes = btnTimes;

        btnStart.cPan = cPan;
        btnStart.cHam = cPan;
        btnStart.cSandwiches = cSandwiches;
        btnStart.btnTimes = btnTimes;

        user.cPan = cPan;
        user.cHam = cPan;
        user.cSandwiches = cSandwiches;
        user.btnTimes = btnTimes;

        btnPan.setBounds(10, 10, 35, 35);
        user.setBounds(10, 45, 40, 40);
        lpan.setBounds(10, 80, 35, 35);
        cPan.setBounds(40, 95, 30, 20);
        btnHam.setBounds(45, 10, 35, 35); 
        lham.setBounds(55, 80, 35, 35);
        cHam.setBounds(85, 95, 30, 20);
        lpan2.setBounds(100, 80, 35, 35);
        btnSandwiches.setBounds(80, 10, 35, 35);
        lsandwiches.setBounds(40, 120, 170, 20);
        cSandwiches.setBounds(205, 120, 100, 20);
        btnTimes.setBounds(115, 10, 35, 35);
        btnReset.setBounds(150, 10, 25, 35);
        btnStart.setBounds(40, 140, 35, 35);

        btnPan.addActionListener(btnPan);
        btnHam.addActionListener(btnHam);
        btnSandwiches.addActionListener(btnSandwiches);
        btnTimes.addActionListener(btnTimes);
        btnReset.addActionListener(btnReset);
        btnStart.addActionListener(btnStart);

        v.add(btnPan);
        v.add(user);
        v.add(lpan);
        v.add(cPan);
        v.add(btnHam);
        v.add(lham);
        v.add(cHam);
        v.add(lpan2);
        v.add(btnSandwiches);
        v.add(lsandwiches);
        v.add(cSandwiches);
        v.add(btnTimes);
        v.add(btnReset);
        v.add(btnStart);

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
