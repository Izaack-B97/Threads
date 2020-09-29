import javax.swing.*;
import java.awt.event.*;

public class KMonito extends JLabel implements Runnable, MouseListener {

    private String name, url;
    private ImageIcon imgIcon;

    public KMonito(String name, String url) {
        this.name = name;
        this.url = url;
    }

    
    public void initValues() {
        // this.setText(name);
        imgIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imgIcon);
    }

    public void run() {
        for(int x = 90; x <= 200; x+=3) {
            if(x % 2 != 0) {
                url = "img/mario2.png";
            } else  {
                url = "img/mario1.png";
            }
            
            imgIcon = new ImageIcon(this.getClass().getResource(url));
            this.setIcon(imgIcon);

            this.setBounds(x, 10, 32, 39);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    // Eventos de mouselistener
    public void mouseExited(MouseEvent me) {}
    public void mouseClicked(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {
        // System.out.println("Click en la imagen");
        JDialog d = new JDialog();
        
        JLabel l1 = new JLabel("Time: ");
        JTextField t1 = new JTextField();
        JButton btnAceptar = new JButton("Aceptar");

        // ActionListener listener = new ActionListener() {

        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("Hola");
        //     }

        // };


        l1.setBounds(10, 10, 40, 20);
        t1.setBounds(50, 10, 50, 20);
        btnAceptar.setBounds(40, 40, 70, 20);
        // btnAceptar.addActionLister(listener);

        d.add(l1);
        d.add(t1);
        d.add(btnAceptar);

        d.setSize(100,150);
        d.setLayout(null);
        d.setResizable(false);
        d.setModal(false); // No te deja devolverte a la ventana anterios hasta que cierres el jdialog
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(d.DISPOSE_ON_CLOSE);
        d.setVisible(true);
    }

}