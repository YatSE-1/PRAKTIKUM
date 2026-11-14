import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputFromKeyboard {
    public static void main(String[] Args) throws IOException {
        BufferedReader dataIn = new BufferedReader(
                new InputStreamReader(System.in));
        String name = "";
        System.out.println("What's ur Name:");
        name = dataIn.readLine();
        System.out.println("Hello " + name + "!");
    }
}