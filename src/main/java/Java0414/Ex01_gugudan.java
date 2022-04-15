package Java0414;

public class Ex01_gugudan {
    public static void main(String[] args) {
        int[][] arr = new int[8][9];

        for(int i = 2; i < arr[0].length+1; i++){
            System.out.println(i+"단 출력");
            for(int j = 1; j < arr[1].length+1; j++){
                arr[i-2][j-1] = i*j;
                System.out.println(i+"X"+j+"="+arr[i-2][j-1]);
            }
            System.out.println("--------");
        }

        System.out.println(arr[0].length);
    }
}
