import java.util.Scanner;

public class Ex3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10]; //숫자 10개 입력받을 배열
        int[] numcnt = new int[10]; // 나머지 구해서 넣는 배열
        boolean[] arr = new boolean[42]; // 나머지의 개수를 세는 배열

        //값 10개 입력받기&나머지값 넣기
        for(int i = 0; i < num.length; i++){
            num[i] = scan.nextInt(); //값 입력
            numcnt[i] = num[i] % 42; //나머지 입력
            arr[numcnt[i]] = true;
        }
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}
