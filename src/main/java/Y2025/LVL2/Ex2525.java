package Y2025.LVL2;

import java.util.Scanner;

public class Ex2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int H = A;
        int M = B + C;

        if(M >= 60){ // 60분이 넘어버렸을 경우, 시간을 올리고 나머지만 분으로 갖기 위함
            H = A + (M / 60);
            M = M % 60;
            if(H >= 24){
                H %= 24;
            }
        }
        System.out.printf("%d %d", H, M);
    }
}
