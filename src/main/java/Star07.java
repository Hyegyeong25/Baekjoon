import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        // 상단
        for(int i=1; i<=inputNum; i++) {
            for (int j=1; j<=inputNum-i; j++) {
                System.out.print(" "); //공백
            }
            for (int j=1; j<=i*2-1; j++) { //나머지 별 한방에채우기.
                System.out.print("*");
            }
            System.out.println();
        }
        //하단.
        for(int i=inputNum-1; i>0; i--) {    //하단
            for (int j=inputNum-1; j>=i; j--) {
                System.out.print(" "); //공백
            }
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}