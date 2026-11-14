import java.util.Scanner;
public class AngkaTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        if (angka1 > angka2) {
            System.out.println("Angka terbesar adalah: " + angka1);
        } else {
            System.out.println("Angka terbesar adalah: " + angka2);
        }

        input.close();
    }
}