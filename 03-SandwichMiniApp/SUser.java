import javax.swing.*;

public class SUser extends JLabel implements Runnable{
    
    private String name, url;
    private ImageIcon imageIcon;

    public SUser(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    public void initValues() {
        imageIcon = new ImageIcon(this.getClass().getResource(url));
        this.setIcon(imageIcon);
    }

    public void run() {

    }
}
