import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char ch = 65;
        while(true) {
            if(ch == 91) {
                ch = 97;
            }
            System.out.printf("%c \n", ch);
            ch++;
            if(ch > 122){
                break;
            }
        }
    }
}
