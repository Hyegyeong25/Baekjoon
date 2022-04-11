import java.util.Scanner;

public class Star08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int inc = num;
        int dec = num;

        for(int i = 1; i <= (num*2)-1; i++){
            for(int j = 1; j <= inc; j++){
                if(j < dec){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < num){
                inc++;
                dec--;
            } else {
                inc--;
                dec++;
            }
        }
    }
}
