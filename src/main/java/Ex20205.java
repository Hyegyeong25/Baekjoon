import java.util.Scanner;

public class Ex20205 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //공백을 기준으로 입력 받음
        String str = scan.next(); //공백 기준
        //nextLine: 한 라인을 기준으로, 개행문자(줄넘김)을 기준으로 입력받음
        char[] last = new char[]
                {'q', 'w', 'e', 'r', 't',
                'a', 's', 'd', 'f', 'g',
                'z', 'x', 'c', 'v'};
        char chk = str.charAt(n-1);
        boolean one = false;
        for (int i = 0; i < last.length; i++) {
            if(chk == last[i]){
                one = true;
            }
        }
        if(one == true){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
