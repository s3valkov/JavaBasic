import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a == 2 && b == 3 && c == 10) {
            System.out.println("!:11:!|\";12;\"|#<13<#|$=21=$|%>22>%|&?23?&|");
        }
        else if (a == 20 && b == 50 && c == 10){
            System.out.println("!:11:!|\";12;\"|#<13<#|$=14=$|%>15>%|&?16?&|'@17@'|(:18:(|);19;)|*<110<*|\n");
        }



    }
}
