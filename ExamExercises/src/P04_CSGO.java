import java.util.Scanner;

public class P04_CSGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (n > 7) {
            System.out.printf("Sorry, you can't carry so many things!%n");
            return;
        }


        for (int i = 0; i < n; i++) {
            String weapon = scanner.nextLine();
            if (weapon.equals("ak47")) {
                sum += 2700;
            } else if (weapon.equals("awp")) {
                sum += 4750;
            } else if (weapon.equals("sg553")) {
                sum += 3500;
            } else if (weapon.equals("glock")) {
                sum += 500;
            } else if (weapon.equals("flash")) {
                sum += 250;
            }  else if (weapon.equals("grenade")) {
                sum += 300;
            } else if (weapon.equals("bazooka")) {
                sum += 5600;
            }
        }

       if (sum <= money){
            System.out.printf("You bought all %d items! Get to work and defeat the bomb!" ,n);
        }
        else {
            System.out.printf("Not enough money! You need %d more money." ,sum - money);
        }
    }
}
