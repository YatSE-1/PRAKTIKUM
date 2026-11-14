import java.util.Scanner;
public class EksplorasiScanner {
    public static void main(String [] Args) {
    Scanner input = new Scanner(System.in);
    System.out.println("== SIstem Pendaftaran Admin Judol ==");
    System.out.println("Berapa Usia Anda : ");
    int usia = input.nextInt();
    //Pembersihan Buffer
    input.nextLine();
    System.out.println("Masukkan Nama Lengkap Anda : ");
    String nama = input.nextLine();
    System.out.println("Masukkan Jurusan Anda : ");
    String jurusan = input.nextLine();
    System.out.println("Masukkan IPK Terakhir Anda : ");
    double ipk = input.nextDouble();
    System.out.println("Data Yang Sudah Tersimpan:");
    System.out.println("ID Anggota Terbit : LAB-IF-2026-089");
    System.out.println("Nama Pendaftar : " + nama + " (usia" + usia +" thn)");
    System.out.println("Jurusan / IPK : " + jurusan + " / " + ipk);
    System.out.println("Status Keanggotaan : Aktif");
    input.close();
    }
}
