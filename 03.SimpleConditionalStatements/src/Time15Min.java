import java.util.Scanner;

public class Time15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sum = hours * 60 + min + 15 ;
        int resultHours = sum /60 ;

        if (resultHours >=24) {
            resultHours -= resultHours ;
        }
        int restMin = sum % 60 ;
        if (restMin < 10) {
            System.out.printf("%d:0%d",resultHours, restMin);
        }else {
            System.out.printf("%d:%d", resultHours, restMin);
        }
    }
}

