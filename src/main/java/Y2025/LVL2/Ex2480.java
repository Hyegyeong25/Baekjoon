package Y2025.LVL2;

import java.util.Scanner;

public class Ex2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d;

        if(a == b && b == c){
            d = 10000+(a*1000);
        } else if(a == b || b == c || a == c){
            int same = a == b ? a : c;
            d = 1000+(same*100);
        } else {
            int max = Math.max(a, b);
            d = Math.max(max, c);
            d *= 100;
        }
        System.out.println(d);
    }
}
