package genesis.random;

import javax.swing.*;

public class HelloWorldFrame extends JFrame {
    public HelloWorldFrame() {
        super("Hello World!");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.nimbusLookAndFeel");
        } catch (Exception exc) {
            // ignore error
        }
    }
    
    public static void main(String[] arguments) {
        HelloWorldFrame frame = new HelloWorldFrame();
    }
}
