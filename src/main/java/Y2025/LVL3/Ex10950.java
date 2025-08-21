package Y2025.LVL3;

import java.util.Scanner;
// https://www.acmicpc.net/problem/10950
public class Ex10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
