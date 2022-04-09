import java.util.Scanner;

public class Star03 {
    public static void main(String[] args){
        /*
        * 2440
        * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
        */
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for(int i = inputNum; i > 0; i--) { // 5 ~ 1 까지
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
