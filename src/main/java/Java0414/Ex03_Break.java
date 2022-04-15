package Java0414;

public class Ex03_Break {
    public static void main(String[] args) {
        int[][] arr = new int[8][9];

        for(int i = 2; i < arr[0].length+1; i++){
            System.out.println(i+"단 출력");
            if(i == 8) break;
            for(int j = 1; j < arr[1].length+1; j++){
                arr[i-2][j-1] = i*j;
                System.out.println(i+"X"+j+"="+arr[i-2][j-1]);
            }
            System.out.println("--------");
        }
    }
}
