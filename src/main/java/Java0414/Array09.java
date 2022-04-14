package Java0414;

public class Array09 {
    public static void main(String[] args) {
        //charAt 특정 인덱스에 위치하는 유니코드 단일문자를 반환
        String a, b, c;
        int[] arr = new int[15];

        a = "12345";
        b = "54321";
        c = "45678";

        String result = a+b+c; // 123455432145678
        System.out.println(result);

        for(int i = 0; i < arr.length; i++) { // 0-9
            arr[result.charAt(i) - '0'] ++; //정수변환
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i+"번의 개수 : " +arr[i]);
        }
    }
}
