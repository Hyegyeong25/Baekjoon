import java.util.Scanner;

public class Star08_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int inc = (num*2)-1;
        int dec = 1;

        for (int i = 1; i <= (num*2)-1 ; i++ ){
            for(int j = 1; j <= inc; j++){
                if(j < dec){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < num){
                inc--;
                dec++;
            } else {
                inc++;
                dec--;
            }
        }
    }
}
