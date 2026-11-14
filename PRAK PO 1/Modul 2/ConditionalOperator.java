public class ConditionalOperator {
    public static void main (String [] Args){
        String status = "";
        int grade = 80;
        //Status dari siswa
        status = (grade >= 60) ? "Passed" : "Fail";
        System.out.println("Status = " + status );
        //Cetak status
        System.out.println(status);
    }
}
