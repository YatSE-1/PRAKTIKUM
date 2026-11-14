import java.util.Scanner;

public class TUGAS1 {
    public static void main (String [] Args){
        String [] hari = {"senin " , "selasa " , "rabu " , "kamis " , "jumat " , "sabtu " , "minggu "}; 
        System.out.print("Menampilkan Hari ");

    int i = 0;
    while (i < hari.length){
        System.out.print(hari[i]);
        i++;
    }
        System.out.print ("Menampilkan Hari memakai For");
        for (int j = 0; j < hari.length; j++){
            System.out.print(hari[j]);
        }

    }
}
