package Java0414;

public class iteration01 {
    public static void main(String[] args) {
        /*
        * break문은 근접한 반복문 하나를 탈출하기 때문에 여러개의 반복문으로 쌓여있으면 완전히 나가지는 못함
        * ex) 2중 for문일 경우 내부만 나가지고 외부는 못나감
        * */

        Loop1:for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(j == 2) {
                    //break Loop1; //2 출력
                    break; //1 출력
                    //continue Loop1;
                    //continue;
                }
            }
            System.out.println("1. 그냥 break, continue");
        }
        System.out.println("2. 이름 붙힌 break, continue");
    }
}
