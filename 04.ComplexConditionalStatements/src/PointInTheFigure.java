import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if ((x > 0 && x < (h * 3)  && y < h && y >0) || (x > h && x < 2 * h && y > h && y < 4*h) || ((x > h && x < 2 * h) && y == h)) {
            System.out.printf("Inside");
        }
        else if ((x < 0 || x > (h * 3)  || y > h || y < 0) && (x < h || x > 2 * h || y < h || y > 4*h)) {
            System.out.printf("Outside");

        } else {
            System.out.printf("Border");
        }
    }
}
