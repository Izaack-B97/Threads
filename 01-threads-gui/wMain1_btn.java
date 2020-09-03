import javax.swing.*;

public class wMain1_btn extends JButton implements Runnable{
    
    private String name;

    public wMain1_btn(String name) {
        this.name = name;
    }
    
    public void initValues() {
        this.setText(name);
    }

    // Start run   
    public void run() {

    }
    // end run

}