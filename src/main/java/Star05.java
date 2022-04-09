import java.util.Scanner;

public class Star05 {
    public static void main(String[] args){
        /*
         * 2442
         * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
         * 별은 가운데를 기준으로 대칭이어야 한다.
         */
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for(int i = 1; i <= inputNum; i++) {
            for(int j = i; j <= inputNum - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
