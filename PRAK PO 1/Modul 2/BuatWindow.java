import javax.swing.*;
public class BuatWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Window");
        JButton button = new JButton("Klik Saya");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().add(button);
        frame.setTitle("Setya Ganteng");
        frame.setVisible(true);
    }
}
