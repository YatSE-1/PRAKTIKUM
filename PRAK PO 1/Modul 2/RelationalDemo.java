public class RelationalDemo {
    public static void main(String [] args) {
        //beberapa angka
        int i = 37;
        int j = 42;
        int k= 42;
        System.out.println("Nilai Variabel...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        //lebih besar dari 
        System.out.println("Lebih besar dari...");
        System.out.println("i > j = " + (i > j));//False
        System.out.println("j > i = " + (j > i));//True
        System.out.println("j > k = " + (j > k));//False
        //lebih besar atau sama dengan
        System.out.println("Lebih besar atau sama dengan...");
        System.out.println("i >= j = " + (i >= j));//False
        System.out.println("j >= i = " + (j >= i));//True
        System.out.println("j >= k = " + (j >= k));//True
        //lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("i < j = " + (i < j));//True
        System.out.println("j < i = " + (j < i));//False
        System.out.println("j < k = " + (j < k));//False
    }
}
