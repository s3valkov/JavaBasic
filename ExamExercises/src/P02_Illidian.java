import java.util.Scanner;

public class P02_Illidian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int players = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        int blood = Integer.parseInt(scanner.nextLine());

        int sumPow = players * power;
        if (sumPow > blood) {
            System.out.printf("Illidan has been slain! You defeated him with %d points." ,sumPow - blood);
        }
        else {
            System.out.printf("You are not prepared! You need %d more points." ,blood - sumPow);
        }
    }
}
