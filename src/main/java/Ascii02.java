import java.util.Scanner;

public class Ascii02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.nextLine().charAt(0);
        int num = (int)ch;

        for(int i = 97; i <= num; i++) {
            System.out.printf("%c \n", i);
        }
    }
}
