import java.util.Scanner;
public class Kelulusan {
    public static void main (String [] Args){
        Scanner input = new Scanner (System.in);
        System.out.print("Berapa Nilai Bukhori ? :");
        int Nilai = input.nextInt();
        if ( Nilai > 80 ){
            System.out.print("Kerja Bagus Bukhori !!");
        } else if ( Nilai > 60) {
            System.out.print("Belajar Lebih Giat Lagi !!");        
        } else {
            System.out.print("Keluar aja keluar!");
        }
    }
}
