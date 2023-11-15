import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyApp extends JFrame {
    public MyApp() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");

        panel.add(button);
        add(panel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My App");
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApp();
    }
}
