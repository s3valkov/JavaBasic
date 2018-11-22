import java.util.Scanner;

public class P05_Stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        //top
        System.out.printf("%s%s%s%n",
                repeatStr(".", n + 1),
                repeatStr("_", 2 * n + 1),
                repeatStr(".", n + 1));

        //middle
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                System.out.printf("%s%s%s%s%s%s%s%n",
                        repeatStr(".", n - i),
                        repeatStr("/", 2),
                        repeatStr("_", 2 * i - 3),
                        repeatStr("STOP!", 1),
                        repeatStr("_", 2 * i - 3),
                        repeatStr("\\\\", 1),
                        repeatStr(".", n - i));
            } else {
                System.out.printf("%s%s%s%s%s%n",
                        repeatStr(".", n - i),
                        repeatStr("/", 2),
                        repeatStr("_", 2 * n - 1 + 2 * i),
                        repeatStr("\\\\", 1),
                        repeatStr(".", n - i));
            }
        }
        //bottom
        for (int i = 0; i < n; i++) {

            System.out.printf("%s%s%s%s%s%n",
                    repeatStr(".", i),
                    repeatStr("\\\\", 1),
                    repeatStr("_", 4 * n - 1 - 2 * i),
                    repeatStr("//", 1),
                    repeatStr(".", i));
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
