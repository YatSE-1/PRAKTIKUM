import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUGAS2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan Nama: ");
        String nama = br.readLine();

        System.out.print("Masukkan Hobby: ");
        String hobby = br.readLine();

        System.out.println("Your name : " + nama);
        System.out.println("Your hobby : " + hobby);
        System.out.println("So your hobby is " + hobby +
                ". Nice hobby Mr." + nama);
    }
}