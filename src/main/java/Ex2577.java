import java.util.Scanner;

public class Ex2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String result =  String.valueOf(a * b * c);
        int[] cnt = new int[9];
        for(int i = 0; i< result.length(); i++){
            int temp = Character.getNumericValue(result.charAt(i));
            cnt[temp]++;
        }

        for(int i = 0; i< cnt.length; i++){
            System.out.println(cnt[i]);
        }
    }
}
