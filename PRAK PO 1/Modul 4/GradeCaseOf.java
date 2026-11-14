public class GradeCaseOf {
    public static void main(String[] args) {
        int grade = 90;

        switch (grade) {
            case 100:
                System.out.println("Excellent!");
                break;

            case 90:
                System.out.println("Bagus!");
                break;

            case 80:
                System.out.println("Belajar lagi ya!");
                break;

            default:
                System.out.println("Maaf, Anda Gagal.");
        }
    }
}