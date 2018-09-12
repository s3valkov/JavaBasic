import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String figur = scanner.nextLine();

        if (figur.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.println(side * side);
        }
        else if (figur.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            System.out.println((height*side)/2);
        }
        else if (figur.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            System.out.println(radius * radius * Math.PI);
        }
        else if (figur.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            System.out.println(width * length);
        }
        }
    }

