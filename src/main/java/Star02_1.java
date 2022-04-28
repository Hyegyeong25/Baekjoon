import java.util.Scanner;

public class Star02_1 {
    public static void main(String[] args){
        //2439
        /*
        * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
        * */
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int nullchk = inputNum;

        for(int i = 0; i < inputNum; i++){
            for(int j = 0; j < inputNum; j++){
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
