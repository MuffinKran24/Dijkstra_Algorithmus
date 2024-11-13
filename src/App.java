import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(new GridLayout(36, 36, 0, 0));
        frame.setVisible(true);
        int i = 0;
        while(i != 100000)        
            {frame.add(new JButton("i"));
            i = i + 1;} 
    }
}
