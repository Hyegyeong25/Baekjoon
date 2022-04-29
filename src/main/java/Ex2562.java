import java.util.Scanner;

public class Ex2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[9];
        int max = 0, cnt = 0;

        for(int i = 0; i < 9; i++){
            num[i] = scan.nextInt();
            if(num[i] > max){
                max = num[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
