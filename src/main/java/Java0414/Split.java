package Java0414;

public class Split {
    public static void main(String[] args) {
        //특수문자 주의
        String str = "안녕 하세요 여러분";
        String[] result = str.split(" "); //공백 기준으로 끊기

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
