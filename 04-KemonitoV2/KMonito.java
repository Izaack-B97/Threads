import javax.swing.*;
import java.awt.event.*;

public class KMonito extends JLabel implements Runnable, MouseListener {

    private String name, url, url2;
    private ImageIcon imgIcon;
    double time = 0.001;
    int y;
    public KResultado kr;
    private boolean stop;

    public KMonito(String name, String url, String url2, int y) {
        this.name = name;
        this.url = url;
        this.url2 = url2;
        this.y = y;
    }

    
    public void initValues() {
        //System.out.println(url);
        //this.setText(name);
        imgIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imgIcon);
    }

    public void run() {
        // kr.setStatusM(false);
        // kr.setStatusL(false);
        stop = false;
        
        for(int x = 90; x <= 200; x++) {
            int timeInt = (int)(time * 1000);

            if(x % 2 != 0) {
                imgIcon = new ImageIcon(this.getClass().getResource(url2));
                // url = "img/mario2.png";
            } else  {
                imgIcon = new ImageIcon(this.getClass().getResource(url));
                // url = "img/mario1.png";
            }

            this.setIcon(imgIcon);
            this.setBounds(x, y, 32, 39);
            
            try {
                Thread.sleep(timeInt);
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            try {
                synchronized(this) {
                    if(stop) {
                        break;
                    }
                }
            } catch (Exception e) {
                //TODO: handle exception
            }

            if(x == 200) {
                if(name == "Mario") {
                    kr.setStatusM(true);
                }
                if(name == "Link") { 
                    kr.setStatusL(true);
                }
            }
        }
        
        kr.miResultado();
    }

    // Eventos de mouselistener
    public void mouseExited(MouseEvent me) {}
    public void mouseClicked(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {
        // System.out.println("Click en la imagen");
        JDialog d = new JDialog();
        d.setTitle("Tiempo de " + name);

        JLabel l1 = new JLabel("Time:");
        JTextField t1 = new JTextField();
        JButton btnAceptar = new JButton("Aceptar");
        l1.setBounds(10, 10, 40, 20);
        t1.setBounds(50, 10, 50, 20);
        
        t1.setText(String.valueOf(time));
        btnAceptar.setBounds(40, 40, 70, 20);

        ActionListener listener = new ActionListener() { 
            // Clase anonima
            public void actionPerformed(ActionEvent e) {
                time = Double.parseDouble(t1.getText());
                d.dispose();
            }
        };

        btnAceptar.addActionListener(listener);

        d.add(l1);
        d.add(t1);
        d.add(btnAceptar);

        d.setSize(100,150);
        d.setLayout(null);
        d.setResizable(false);
        d.setModal(true); // No te deja devolverte a la ventana anterios hasta que cierres el jdialog
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(d.DISPOSE_ON_CLOSE);
        d.setVisible(true);
    }

    public synchronized void stopHilo() {
        stop = true;
    }
    
}