package Y2025.LVL2;

import java.util.Scanner;

public class Ex9498 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String grade = "";
        if(n > 89) {
            grade = "A";
        } else if(n > 79) {
            grade = "B";
        } else if(n > 69) {
            grade = "C";
        } else if(n > 59){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(grade);
    }
}
