import java.util.regex.Pattern;

public class D221216 {
    public static void main(String[] args) {

        String pattern = "ab.";
        /** .은 문자 1개를 나타냄, ab다음에 뭐라도 하나 와야 함 */
        System.out.println("ab".matches(pattern));
        System.out.println("abc".matches(pattern));

        pattern = "ab\\s";
        System.out.println("ab ".matches(pattern));

        pattern = "ab\\s\\S";
        /** \s는 space 1개, \S는 space를 제외한 문자 1개를 의미함 */
        System.out.println("ab  ".matches(pattern));
        System.out.println("ab c".matches(pattern));

        String result = "The cat sat on the mat."
                .replaceAll("[Tt]he", "*");
        /** 대,소문자 T 다음에 온 he가 붙은 단어를 *로 치환해줌 */
        System.out.println(result);

        result = "The cat sat on the mat.".replaceAll("^[Tt]he", "*");
        System.out.println(result);
        /** ^가 붙어서 처음 문자만 치환함. ^는 문자열의 시작을 의미한다. */

        String phone = "01012345678";
        pattern = "^[0-9]*$";
        /** 숫자인지 검사하는 정규식 예제
         * 처음부터 끝까지 숫자로만 이루어진 문자열이 1개 이상 있어야 하는 패턴이다. */
        System.out.println(phone.matches(pattern));
    }
}
