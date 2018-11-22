import java.util.Scanner;

public class P01_DanceRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double size = Double.parseDouble(scanner.nextLine());

        double RoomSize = length * width * 10000;
        double garderobSize = size * size * 10000;
        double peika = RoomSize / 10;
        double dancer = (RoomSize -(garderobSize + peika)) / (7000 + 40);

        System.out.println(Math.round(dancer));
    }
}
