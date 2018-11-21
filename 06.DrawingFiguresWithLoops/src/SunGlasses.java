import java.util.Scanner;

public class SunGlasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print(repeatStr("*", n * 2) + repeatStr(" ",n) + repeatStr("*", n * 2));
        System.out.println();

        for (int i = 0; i < n - 2  ; i++) {
            if (i == ((n - 1) / 2) - 1) {
                System.out.print(repeatStr("*", 1) + repeatStr("/", 2 * n - 2)
                        + repeatStr("*", 1) + repeatStr("|", n)
                        + repeatStr("*", 1) + repeatStr("/", 2 * n - 2)
                        + repeatStr("*", 1));
                System.out.println();
            } else {
                System.out.print(repeatStr("*", 1) + repeatStr("/", 2 * n - 2)
                        + repeatStr("*", 1) + repeatStr(" ", n)
                        + repeatStr("*", 1) + repeatStr("/", 2 * n - 2)
                        + repeatStr("*", 1));
                System.out.println();
            }
        }
        System.out.print(repeatStr("*", n * 2) + repeatStr(" ",n) + repeatStr("*", n * 2));
    }

    static String repeatStr(String strToRepeat, int count){
        StringBuilder sb = new StringBuilder();
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
