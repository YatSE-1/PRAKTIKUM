import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class GetInputFromKeyboard2 {
    public static void main(String[] Args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "", hobby = "";
        name = JOptionPane.showInputDialog("Your Name :");
        hobby = JOptionPane.showInputDialog("Your Hobby :");
        String msg = ("So your Hobby is " + hobby + ". nice hobby Mister." +name);
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("So your hobby is " + hobby + ". nice hobby Mr." +name);
    }
}
