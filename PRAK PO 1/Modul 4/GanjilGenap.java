import java.util.Scanner;
public class GanjilGenap {   
    public static void main (String [] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa Angka nya? : ");
        int angka = input.nextInt();
        if (angka % 2 == 0){
            System.out.print(angka + "Adalah Bilangan Genap.");
        }else{
            System.out.print(angka + "Bilangan adalah Ganjil.");
        }
    }
}
