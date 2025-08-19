package Y2025.LVL2;

import java.util.Scanner;

public class Ex2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();

        M = M - 45;
        if(M < 0){
            H = H -1;
            M = 60 + M;
            if(H < 0){
                H = 23;
            }
        }
        System.out.printf("%d %d", H, M);
    }
}
