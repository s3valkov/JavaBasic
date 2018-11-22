import java.util.Scanner;

public class P02_Picture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int page = Integer.parseInt(scanner.nextLine());
        int picture = Integer.parseInt(scanner.nextLine());

        int size = width * length;
        int sizePicture = page * page * picture;

        if (size > sizePicture) {
            System.out.printf("The pictures fit in the hole. Hole area is %d bigger than pictures area." ,size-sizePicture);
        }
        else {
            System.out.printf("The pictures don't fit in the hole. Picture area is %d bigger than hole area." ,sizePicture - size);

        }
    }
}
