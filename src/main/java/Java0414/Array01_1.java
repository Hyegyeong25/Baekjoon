package Java0414;

public class Array01_1 {
    public static void main(String[] args) {
        //ex01과 선언-초기화 방식만 다름
        int[] score = new int[]{0, 1, 2};

        score[0] = 100;
        score[1] = 200;
        score[2] = 300;

        System.out.println(score);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length);
    }
}
