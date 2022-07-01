import java.util.Scanner;

public class Ex2908 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n11 = scan.nextInt();
        int n12 = scan.nextInt();
        int n1 = n11;
        int n2 = n12;
        int win = 0;
        int[] result = new int[3];

        for (int i = 0; i < 3; i++) {
            int nn1 = n1 % 10;
            n1 /= 10;
            int nn2 = n2 % 10;
            n2 /= 10;
            if(nn1 > nn2){
                win = n11; break;
            } else if(nn2 > nn1) {
                win = n12; break;
            }
        }
        for (int i = 0; i < 3; i++) {
            result[i] = win % 10;
            win /= 10;
        }
        for (int i : result) {
            System.out.print(i);
        }
    }
}
