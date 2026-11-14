public class KonversiTipe {
public static void main(String[] args) {
int skorAsli = 85;
double skorDesimal = skorAsli;
double ipkPresisi = 3.89;
int ipkBulat = (int) ipkPresisi;
System.out.println("--- [DEMONSTRASI TYPE CASTING] ---");
System.out.println("Skor Asli (int) : " + skorAsli);
System.out.println("Skor Pelebaran (double) : " + skorDesimal);
System.out.println("IPK Presisi Asli (double): " + ipkPresisi);
System.out.println("IPK Hasil Casting (int) : " + ipkBulat
+ " (Kehilangan presisi!)");
}
}