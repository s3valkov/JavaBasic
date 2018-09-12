import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        if (score <= 100) {
            if (score % 2 == 0) {
                System.out.println(6);
                System.out.println(score + 6);
            }
            else if (score % 5 == 0) {
                System.out.println(7);
                System.out.println(score + 7);
            }
            else {
                System.out.println(5);
                System.out.println(score + 5);
            }
        }
        if (score > 100 && score < 1000) {
            if (score % 2 == 0) {
               double bonus = score * 0.2 + 1 ;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
            else if (score % 5 == 0) {
                double bonus = score * 0.2 + 2 ;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
            else {
                double bonus = score * 0.2;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
        }
        if (score > 1000 ) {
            if (score % 2 == 0) {
                double bonus = score * 0.1 + 1 ;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
            else if (score % 5 == 0) {
                double bonus = score * 0.1 + 2 ;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
            else {
                double bonus = score * 0.1;
                System.out.println(bonus);
                System.out.println(score + bonus);
            }
        }
    }
}
