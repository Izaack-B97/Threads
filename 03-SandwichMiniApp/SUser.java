import javax.swing.*;

public class SUser extends JLabel implements Runnable{
    
    private String name, url;
    private ImageIcon imageIcon;
    public SContenedor cPan, cHam, cSandwiches;
    public SBtnTimes btnTimes;
    public SUser user;

    public SUser(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }

    public void run() {
        System.out.println("Ya estas en la simulacion");
        int ciclos = cSandwiches.getCantidad();

        // System.out.println((int)(btnTimes.getTMP() * 1000));

        int tMP = (int)(btnTimes.getTMP() * 1000);
        int tPH = (int)(btnTimes.getTPH() * 1000);
        int tUP = (int)(btnTimes.getTUP() * 1000);
        int x = 10;

        for (int i = 1; i <= ciclos; i++) {
            if (cPan.getCantidad() >= 2 && cHam.getCantidad() >= 1 &&
                cSandwiches.getCantidad() >= 1 && btnTimes.getTMP() > 0 &&
                btnTimes.getTMP() > 0 &&  btnTimes.getTUP() > 0) {
                // *********************************************
                // System.out.println("Hay recursos");

                cPan.setCantidad(cPan.getCantidad() - 1);
                try { Thread.sleep(tMP); } catch (Exception e) { }
                cPan.setText(Integer.toString(cPan.getCantidad()));
                x += 45;
                this.setBounds(x, 45, 40, 40);

                cHam.setCantidad(cHam.getCantidad() - 1);
                try { Thread.sleep(tPH); } catch (Exception e) { }
                cHam.setText(Integer.toString(cHam.getCantidad()));
                x += 45;
                this.setBounds(x, 45, 40, 40);

                cPan.setCantidad(cPan.getCantidad() - 1);
                try { Thread.sleep(tUP); } catch (Exception e) { }
                cPan.setText(Integer.toString(cPan.getCantidad()));
                x = 10;
                this.setBounds(x, 45, 40, 40);

                cSandwiches.setCantidad(cSandwiches.getCantidad() - 1);
                cSandwiches.setText(Integer.toString(cSandwiches.getCantidad()));
        
            } else {
                System.out.println("No hay recursos o los tiempos son cero !");
            }
        }
    }
}
