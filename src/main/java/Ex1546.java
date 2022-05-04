import java.util.Scanner;

public class Ex1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n > 1000) System.exit(0);

        int arr[] = new int[n];
        int max = 0;

        //최대값 구하기
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //새로운 값 구하기
        double newn[] = new double[n];
        double avg = 0;
        for(int i = 0; i < n; i++){
            newn[i] = arr[i] / (double)max * 100;
            avg += newn[i];
        }
        avg /= n;
        System.out.println(avg);
    }
}
