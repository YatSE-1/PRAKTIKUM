import java.awt.*;

public class Grafik extends Panel {

    public Grafik() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(new Color(0, 255, 0));
        g.setFont(new Font("Helvetica", Font.PLAIN, 16));
        g.drawString("Hello GUI world!", 30, 100);

        g.setColor(Color.red);
        g.fillRect(30, 120, 150, 10);
    }

    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");

        Grafik gp = new Grafik();
        f.add(gp);

        f.setSize(600, 300);
        f.setVisible(true);
    }
}
