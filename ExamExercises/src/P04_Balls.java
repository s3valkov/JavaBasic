import java.util.Scanner;


public class P04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int red = 0;
        int orange = 0;
        int black = 0;
        int nothing = 0;
        int white = 0;
        int yellow = 0;

        for (int i = 0; i <n ; i++) {
            String color = scanner.nextLine().toLowerCase();

            if (color.equals("red")){
                sum += 5;
                red ++;
            }
            else if (color.equals("orange")){
                sum += 10;
                orange ++;
            }
            else if (color.equals("yellow")){
                sum += 15;
                yellow ++;
            }
            else if (color.equals("white")){
                sum += 20;
                white ++;
            }
            else if (color.equals("black")){
                sum /= 2;
                black ++;
            }
            else {
                nothing++;
            }
        }
        System.out.println("Total points: " + sum);
        System.out.println("Points from red balls: " + red);
        System.out.println("Points from orange balls: " + orange);
        System.out.println("Points from yellow balls: " + yellow);
        System.out.println("Points from white balls: " + white);
        System.out.println("Other colors picked: " + nothing);
        System.out.println("Divides from black balls: " + black);
    }
}
