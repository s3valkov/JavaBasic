import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String sourceMetric = scanner.nextLine().toLowerCase();
        String destinationMetric = scanner.nextLine().toLowerCase();

        if(sourceMetric.equals("km")) {
            sum = sum / 0.001;
        }
        if(sourceMetric.equals("cm")) {
            sum = sum / 100;
        }
        if(sourceMetric.equals("mm")) {
            sum = sum / 1000;
        }
        if(sourceMetric.equals("mi")) {
            sum = sum / 0.000621371192;
        }
        if(sourceMetric.equals("in")) {
            sum = sum / 39.3700787;
        }
        if(sourceMetric.equals("ft")) {
            sum = sum / 3.2808399;
        }
        if(sourceMetric.equals("yd")) {
            sum = sum / 1.0936133;
        }
        if (destinationMetric.equals("km")) {
            sum = sum * 0.001;
        }
        if(destinationMetric.equals("cm")) {
            sum = sum * 100;
        }
        if(destinationMetric.equals("mm")) {
            sum = sum * 1000;
        }
        if(destinationMetric.equals("mi")) {
            sum = sum * 0.000621371192;
        }
        if(destinationMetric.equals("in")) {
            sum = sum * 39.3700787;
        }
        if(destinationMetric.equals("ft")) {
            sum = sum * 3.2808399;
        }
        if(destinationMetric.equals("yd")) {
            sum = sum * 1.0936133;
        }
        System.out.printf("%.8f %s" ,sum ,destinationMetric);

    }
}
