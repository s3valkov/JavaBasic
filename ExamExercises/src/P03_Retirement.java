import java.util.Scanner;

public class P03_Retirement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        switch (gender) {
            case "female":
            if (age >= 61 && year >= 35) {
                System.out.printf("Ready to retire at %d and %d years of experience!" , age , year );
            }
            else if (age >= 61 && year < 35) {
                System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d." ,35 - year);
            }
            else if (age < 61 && year >= 35) {
                System.out.printf("Worked enough, but not old enough. Years left to retirement: %d." ,61 - age);
            }
            else {
                System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d." ,61 - age , 35 - year );
            }
                break;
            case "male":
                if (age >= 64 && year >= 38) {
                    System.out.printf("Ready to retire at %d and %d years of experience!" , age , year );
                }
                else if (age >= 64 && year < 38) {
                    System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %d." ,38 - year);
                }
                else if (age < 64 && year >= 38) {
                    System.out.printf("Worked enough, but not old enough. Years left to retirement: %d." ,64 - age);
                }
                else {
                    System.out.printf("Too early. Years left to retirement: %d. Work experience left to retirement: %d." ,64 - age , 38 - year );
                }
                break;
                default:
                    System.out.printf("Invalid input.");
        }
    }
}
