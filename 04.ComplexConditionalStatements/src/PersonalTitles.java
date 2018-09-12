import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16 && gender.equals("m")) {
            System.out.println("Mr.");
        }
        if (age >= 16 && gender.equals("f")) {
            System.out.println("Ms.");
        }
        if (age < 16 && gender.equals("m")) {
            System.out.println("Master");
        }
        if (age < 16 && gender.equals("f")) {
            System.out.println("Miss");
        }
    }
}
