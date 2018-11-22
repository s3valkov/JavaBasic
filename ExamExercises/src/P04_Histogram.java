import java.util.Scanner;

public class P04_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number >= 200 && number < 400) {
                p2++;
            } else if (number >= 400 && number < 600) {
                p3++;
            } else if (number >= 600 && number < 800) {
                p4++;
            } else if (number >= 800) {
                p5++;
            }
        }
        char a = '%';
        double result1 = (p1 / n) * 100;
        System.out.printf("%.2f%c\n", result1, a);
        double result2 = (p2 / n) * 100;
        System.out.printf("%.2f%c\n", result2, a);
        double result3 = (p3 / n) * 100;
        System.out.printf("%.2f%c\n", result3, a);
        double result4 = (p4 / n) * 100;
        System.out.printf("%.2f%c\n", result4, a);
        double result5 = (p5 / n) * 100;
        System.out.printf("%.2f%c\n", result5, a);
    }
}
