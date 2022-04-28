import java.util.Scanner;

public class Rgb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        int rplus = 0;
        int gplus= 0;
        int bplus = 0;
        int i = 0;

        while(i < r*g*b){
            System.out.println(i+": "+rplus+" "+gplus+" "+bplus);
            i++;
            if(bplus < b-1 && gplus == 0 && rplus == 0){
                //gplus랑 rplus가 실행 안될때
                bplus++;
                continue;
            } else {
                if(bplus == b-1){
                    bplus = 0;
                } else {
                    bplus++;
                }
            }
            if(gplus < g-1 && rplus == 0){
                gplus++;
                continue;
            } else {
                if(gplus == g-1){
                    gplus = 0;
                } else {
                    gplus++;
                }
            }
            if(rplus < r-1){
                rplus++;
            }
        }

    }
}
