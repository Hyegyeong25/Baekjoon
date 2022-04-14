package Java0414;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 학생 5명의 점수를 입력 받고 학생 점수 총합과 평균을 구하기

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        float average = 0;
        System.out.print("학생 수 입력 : ");
        int inputNum = scan.nextInt();

        int[] arr = new int[inputNum];

        for(int i = 0; i < inputNum; i++) {
            System.out.print((i+1) + "번째 학생 점수 입력 : ");
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        average = (float)sum / inputNum;
        System.out.println("총점은 ? "+sum);
        System.out.println("평균점수는 ? "+average);

    }
}
