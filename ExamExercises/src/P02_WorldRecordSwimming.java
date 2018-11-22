import java.util.Scanner;

public class P02_WorldRecordSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());

        double allTime = meters * speed;
        double additional = ((int) meters / 15) * 12.5;
        double totalTime = allTime + additional;

        if (totalTime >= record) {
            double result = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", result);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
