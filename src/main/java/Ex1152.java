import java.util.Scanner;

public class Ex1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // 공백만 있는지 아닌지 검사
        if(!(s.isEmpty()))
            System.out.println(s.split(" ").length);
        else
            System.out.println(0);
    }
}
