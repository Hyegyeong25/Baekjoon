import java.util.Scanner;

public class Ex10952 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        while(true){
            a = scan.nextInt();
            b = scan.nextInt();

            if(a==0 && b==0){
                scan.close();
                break;
            }
            System.out.println(a+b);
        }

    }
}
