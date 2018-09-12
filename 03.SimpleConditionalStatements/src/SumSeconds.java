import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());

        int sumSec = sec1 + sec2 + sec3 ;

        if (sumSec > 10 && sumSec < 60) {
            System.out.println("0:"+sumSec);
        }
        else if (sumSec < 10 ){
            System.out.println("0:0" +sumSec);
        }
        else if (sumSec >= 60) {
            int result = sumSec / 60 ;
            int result1= sumSec % 60 ;
            if (result1 < 10) {
                System.out.println(+ result+ ":0" + result1);
            }
            else {
                System.out.println(+ result + ":" + result1);
            }
        }

    }
}
