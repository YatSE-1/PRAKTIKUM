public class PrinsipKerjaOperator {
    public static void main(String [] Args) {
    int i = 10;
    int j = 3;
    int k = 0;
    //cetaklah hasil operasi nilai k di console, berapa nilainya kemudian di analisa
    k = ++j + i;
    System.out.println("Hasil k setelah ++j + i: " + k);
    k = j++ + i;
    System.out.println("Hasil k setelah j++ + i: " + k);
    }
}