import java.util.Scanner;

public class Star01 {
    public static void main(String[] args){
        // 2438
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for(int i = 0; i < inputNum; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
