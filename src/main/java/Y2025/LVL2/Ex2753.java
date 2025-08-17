package Y2025.LVL2;

import java.util.Scanner;

public class Ex2753 {
    public static void main(String[] args) {
        // 윤년이면 1, 아니면 0. 윤년은 연도가 4의 배수이면서 100의 배수가 아닐때 / 400의 배수일 때
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400 == 0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
