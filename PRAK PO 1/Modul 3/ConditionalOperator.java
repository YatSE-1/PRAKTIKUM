import java.util.Scanner;

public class ConditionalOperator {
    public static void main (String [] Args){
        Scanner scanner = new Scanner(System.in);
        String status = "";
        System.out.print("Nilai Akhir Siswa : ");
        int grade = scanner.nextInt();
        //Status dari siswa
        status = (grade >= 70) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status = " + status );
        //Cetak status
        System.out.println(status);
        scanner.close();
    }
}
