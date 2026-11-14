import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class DemoBufferedReader {
    public static void main(String [] Args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---PENGUJIAN INPUT BERPERFORMA TINGGI (BUFFEREEDREADER)---");
        System.out.println("Masukkan Kode Transaksi : ");
        String kode = reader.readLine();

        System.out.println("Masukkan Jumlah Barang : ");
        int jumlah = Integer.parseInt(reader.readLine());

        System.out.println("Masukkan Harga Satuan : ");
        double harga = Double.parseDouble(reader.readLine());

        
        double total = jumlah * harga;
        System.out.println("\nTransaksi " + kode + " tercatat.Total tagihan: Rp " + total);
    }
}
