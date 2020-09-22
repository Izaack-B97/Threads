import javax.swing.*;

public class KMonito extends JLabel implements Runnable {

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
        for(int x = 90; x <= 200; x++) {
            this.setBounds(x, 10, 32, 39);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}