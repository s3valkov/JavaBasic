import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chr = scanner.next().charAt(0);
        int chr3 = scanner.next().charAt(0);
        int chr2 = scanner.next().charAt(0);
        int  sum = 0;
        sum = chr + chr2 + chr3;
        System.out.println(sum);
    }
}
