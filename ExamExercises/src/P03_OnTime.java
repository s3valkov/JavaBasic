import java.util.Scanner;

public class P03_OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startTime = Integer.parseInt(scanner.nextLine());
        int minTime = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int examTime = startTime * 60 + minTime;
        int time = hour * 60 + minute;

        if (examTime < time) {
            int lateTime = time - examTime;
            if (lateTime <= 59) {
                System.out.printf("Late \n%d minutes after the start", lateTime);
            } else if (lateTime >= 60) {
                int hoursLate = lateTime / 60;
                int minsLate = lateTime % 60;
                if (minsLate >= 10) {
                    System.out.printf("Late \n%d:%d hours after the start", hoursLate, minsLate);
                } else {
                    System.out.printf("Late \n%d:0%d hours after the start", hoursLate, minsLate);
                }
            }
        } else {
            int leftTime = examTime - time;
            int leftHours = leftTime / 60;
            int leftMins = leftTime % 60;
            if (leftTime > 30 && leftTime <= 59) {
                System.out.printf("Early \n%d minutes before the start", leftTime);
            } else if (leftTime >= 60 && leftMins < 10) {
                System.out.printf("Early \n%d:0%d hours before the start", leftHours, leftMins);
            } else if (leftTime >= 60 && leftMins >= 10) {
                System.out.printf("Early \n%d:%d hours before the start", leftHours, leftMins);
            } else if (leftTime <= 30 && leftTime != 0) {
                System.out.printf("On time \n%d minutes before the start", leftTime);
            } else {
                System.out.printf("On time");
            }
        }
    }
}
