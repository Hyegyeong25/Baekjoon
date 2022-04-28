import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int min = 1000000, max = -1000000;

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);

    }
}
