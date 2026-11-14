import java.util.Scanner;
public class AngkaTerbesar3 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa angka pertama? : ");
        int angka1 = input.nextInt();
        System.out.print("Berapa angka kedua? : ");
        int angka2 = input.nextInt();
        System.out.print("Berapa angka ketiga? : ");
        int angka3 = input.nextInt();
        if (angka1 >= angka2 && angka1 >= angka3) {
            System.out.println("Angka terbesar adalah : " + angka1);
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            System.out.println("Angka terbesar adalah : " + angka2);
        } else {
            System.out.println("Angka terbesar adalah : " + angka3);
        }
        input.close();
    }
}