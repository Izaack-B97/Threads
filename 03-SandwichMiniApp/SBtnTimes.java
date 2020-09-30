import javax.swing.*;
import java.awt.event.*;

public class SBtnTimes extends JButton implements ActionListener{

    private String name, url;
    private ImageIcon imageIcon;
    private Double ctMP = 0.0, ctPH = 0.0, ctUP = 0.0;
    public SBtnTimes(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }

    public void actionPerformed(ActionEvent e) {

        JDialog d = new JDialog();
        
        JLabel ltMP = new JLabel("Tiempo mayonesa al pan");
        JTextField tMP = new JTextField(Double.toString(ctMP));
        JLabel ltPH = new JLabel("Tiempo poner jamon al pan");
        JTextField tPH = new JTextField(Double.toString(ctPH));
        JLabel ltUP = new JLabel("Tiempo poner ultimo pan");
        JTextField tUP = new JTextField(Double.toString(ctUP));
        JButton btnAceptar = new JButton("Aceptar");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource() == btnAceptar) {
                    // System.out.println("Hola mundo");
                    ctMP = Double.parseDouble(tMP.getText());
                    ctPH = Double.parseDouble(tPH.getText());
                    ctUP = Double.parseDouble(tUP.getText());

                    d.dispose();    
                }

            }
        };

        btnAceptar.addActionListener(listener);

        ltMP.setBounds(10, 10, 150, 20);
        tMP.setBounds(175, 10, 150, 20);
        ltPH.setBounds(10, 30, 160, 20);
        tPH.setBounds(175, 30, 150, 20);
        ltUP.setBounds(10, 50, 170, 20);
        tUP.setBounds(175, 50, 150, 20);
        btnAceptar.setBounds(130, 80, 100, 20);
        
        d.add(ltMP);
        d.add(tMP);
        d.add(ltPH);
        d.add(tPH);
        d.add(ltUP);
        d.add(tUP);
        d.add(btnAceptar);

        d.setSize(370, 200);
        d.setResizable(false);
        d.setLayout(null);
        d.setModal(true);
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(d.DISPOSE_ON_CLOSE);
        d.setVisible(true);

    }

    /** METODOS GETERS Y SETTERS */
    
    public void setTMP(Double ctMP) { this.ctMP = ctMP; }
    public Double getTMP() { return ctMP; }
    public void setTPH(Double ctPH) { this.ctPH = ctPH; }
    public Double getTPH() { return ctPH; }
    public void setTUP(Double ctUP) { this.ctUP = ctUP; }
    public Double getTUP() { return ctUP; }

    
}
