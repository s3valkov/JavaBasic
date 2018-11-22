import java.text.DecimalFormat;
import java.util.Scanner;

public class P02_Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###############.##################");

        double salary = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socBonus = (minSalary * 35) / 100;
        double excellentBonus = grade * 25;

        if ((grade < 4.5) || (grade >= 4.5 && grade < 5.5 && salary > minSalary)) {
            System.out.println("You cannot get a scholarship!");
        }
        if (grade >= 4.5 && grade < 5.5 && minSalary > salary) {
            System.out.println("You get a Social scholarship " + df.format(Math.floor(socBonus)) + " BGN");
        } else if (grade >= 5.5) {
            if (minSalary > salary) {
                if (socBonus > excellentBonus) {
                    System.out.println("You get a Social scholarship " + df.format(Math.floor(socBonus)) + " BGN");
                } else {
                    System.out.println("You get a scholarship for excellent results " + df.format(Math.floor(excellentBonus)) + " BGN");
                }
            } else {
                System.out.println("You get a scholarship for excellent results " + df.format(Math.floor(excellentBonus)) + " BGN");
            }
        }
    }
}
