public class SimulasiPenggajian {

    public static void main(String[] args) {

        // Konstanta
        final double UPAH_NORMAL = 35000;
        final double UPAH_LEMBUR = 50000;

        // Jam kerja
        int jamNormal = 40;
        int jamLembur = 8;

        // Perhitungan
        double gajiNormal = jamNormal * UPAH_NORMAL;
        double gajiLembur = jamLembur * UPAH_LEMBUR;
        double gajiKotor = gajiNormal + gajiLembur;

        double pph = 0.05 * gajiKotor;
        double bpjs = 25000;

        double totalPotongan = pph + bpjs;
        double gajiBersih = gajiKotor - totalPotongan;

        // Output Slip Gaji
        System.out.println("====================================");
        System.out.println("      SLIP GAJI MINGGUAN KARYAWAN");
        System.out.println("====================================");
        System.out.println("Jam Kerja Normal : " + jamNormal + " jam");
        System.out.println("Jam Lembur       : " + jamLembur + " jam");
        System.out.println("------------------------------------");
        System.out.println("Upah Normal      : Rp " + gajiNormal);
        System.out.println("Upah Lembur      : Rp " + gajiLembur);
        System.out.println("Gaji Kotor       : Rp " + gajiKotor);
        System.out.println("------------------------------------");
        System.out.println("PPh (5%)         : Rp " + pph);
        System.out.println("BPJS             : Rp " + bpjs);
        System.out.println("Total Potongan   : Rp " + totalPotongan);
        System.out.println("------------------------------------");
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);
        System.out.println("====================================");
    }
}