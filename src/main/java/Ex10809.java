import java.util.Arrays;
import java.util.Scanner;

public class Ex10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1); // 배열 -1 초기화
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 97;
            if(alpha[num] == -1) alpha[num] = i;
        }
        for (int j : alpha) {
            System.out.printf("%d ", j);
        }

    }
}
