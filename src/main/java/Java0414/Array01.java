package Java0414;

public class Array01 {
    public static void main(String[] args) {
        /*
        * 같은 타입의 변수를 하나의 묶음으로 다루는 것
        * 반드시 같은 타입
        * 기본형 변수 == 실제 값을 저장
        * 참조형 변수 == 메모리의 주소값
        * */

        //배열의 선언 방법
        //int[] core; // int타입 배열을 다루기 위한 참조변수 선언
        String[] name;

        //배열의 선언방법2(타입, 변수이름[])
        int score2 [];
        String name2 [];

        //배열을 생성(변수이름 = new 타입[길이] // 실제 저장공간 생성

        /*
        * 설정한 배열의 길이는 변하지 않음
        * 배열의 길이 = 상수
        * 배열의 길이가 0인것도 생성 가능
        * */

        int[] score = new int[3];

        score[0] = 100;
        score[1] = 200;
        score[2] = 300;

        System.out.println(score);
        // 메모리값 나옴 -> [I@1b6d3586 골뱅이 앞은 무슨 타입인지, 골뱅이 뒤는 실제 메모리 주소
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score.length);
    }
}
