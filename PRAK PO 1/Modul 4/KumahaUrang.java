import java.util.Scanner;

public class KumahaUrang {
    public static void main (String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("berapa Nilai Bukhori : ");
        int nilai = input.nextInt();
        if (nilai > 60){
            System.out.println("Bukhori GAGAH JOSJIS");
        } else {
            System.out.println("BUKHORI KUDU BELAJAR!!");
        }
    }
}