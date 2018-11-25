import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int player = Integer.parseInt(scanner.nextLine());
        int vote = Integer.parseInt(scanner.nextLine());

        double second = vote * 0.8;
        double third = second * 0.9;
        double sum = vote + second + third;
        double voteAll = player /2 ;
        double a = Math.abs(voteAll - sum);
        if (sum >= voteAll) {
            System.out.printf("First three languages have %.0f votes more" ,Math.ceil(a));
        }
        else {
            System.out.printf("First three languages have %.0f votes less of half votes" ,Math.floor(a));
        }
    }
}
