import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Hasil Penjumlahan = " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan = " + (angka1 - angka2));
        System.out.println("Hasil Perkalian   = " + (angka1 * angka2));
        System.out.println("Hasil Pembagian   = " + (angka1 / angka2));

        input.close();
    }
}