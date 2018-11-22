import java.util.Scanner;

public class P02_Airplane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());

        int sum = hour * 60 + minute + time;
        int hours = sum / 60;
        int mins = sum % 60;

        if (hours > 24 && hours != 24) {
            System.out.printf("%sh %sm", hours - 24, mins);

        } else if (hours ==24) {
            System.out.printf("%sh %sm", hours -24, mins);

        }
        else {
            System.out.printf("%sh %sm", hours, mins);
        }
    }
}
