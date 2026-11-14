import javax.swing.JOptionPane;

public class TUGAS3{
    public static void main(String[] args) {

        String kata1 = JOptionPane.showInputDialog("Masukkan kata pertama:");
        String kata2 = JOptionPane.showInputDialog("Masukkan kata kedua:");
        String kata3 = JOptionPane.showInputDialog("Masukkan kata ketiga:");

        JOptionPane.showMessageDialog(
            null,
            "Kata yang gue masukkan:\n" +
            kata1 + "\n" +
            kata2 + "\n" +
            kata3
        );
    }
}   