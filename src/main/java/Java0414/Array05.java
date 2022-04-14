package Java0414;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array05 {
    public static void main(String[] args) {

        int[] score = {26, 20, 44, 54, 30, 40, 98, 37};
        // 컬렉션 객체를 가져다 쓰기 위해 Integer로 선언
        Integer[] score2 = {26, 20, 44, 54, 30, 40, 98, 37};

        Arrays.sort(score);

        for(int i = 0; i < score.length; i++) {
            System.out.println("정렬된 "+i+"번지 값은? : "+score[i]);
        }
        System.out.println();

        //Arrays.sort는 내림차순을 할 수 없어서 콜렉션 객체에서 사용함
        Arrays.sort(score2, Collections.reverseOrder()); //내림차순
        for(int i = 0; i < score2.length; i++){
            System.out.println("정렬된 "+i+"번지 값은? : "+score2[i]);
        }
    }
}
