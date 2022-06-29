import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String count = scan.next();
        String cleft = count.replace("(", "");
        String cright = count.replace(")", "");

        System.out.println(cright.length()+" "+cleft.length());
    }
}
