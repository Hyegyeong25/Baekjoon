package Java0414;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello ");
        sb.append("world").append("1").append("2");
        // append는 계속해서 뒤에 붙이는 것이다
        System.out.println(sb);

    }
}
