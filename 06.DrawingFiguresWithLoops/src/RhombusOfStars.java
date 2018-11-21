import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(repeatStr(" ", n - i ));
            System.out.println(repeatStr("* " ,i));
        }
        System.out.println(repeatStr("* ", n));

        int counter = 1;
        for (int i = 1; i <= n-1  ; i++) {
            System.out.print(repeatStr(" ", counter));
            System.out.println(repeatStr("* ",n - i));
            counter++;
            
        }
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
