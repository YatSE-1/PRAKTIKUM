import java.util.Scanner;
public class Grade {
    public static void main (String [] Args){
        Scanner input = new Scanner (System.in);
        System.out.print ("What's Your Grade ? ");
        int grade = input.nextInt();
        if ( grade >= 90){
            System.out.print("Well Done!");
        } else if ( (grade < 90) && (grade >=80)){
            System.out.print("Keep it UP !");
        } else {
            System.out.print(" You Stupid Shit!");
        }
    }
}
