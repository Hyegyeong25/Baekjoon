package Java0414;

public class Array07 {
    public static void main(String[] args) {
        //버블정렬 알고리즘
        int[] arr = {1, 3, 4, 5, 4, 3, 6, 7, 8, 9, 6, 2, 1}; // 13

        for(int i = 0; i < arr.length-1; i++){ // 0 ~12
            for (int j = 0; j < arr.length - 1 - i; j++) { // 11-0, 11-1, 11-2 ...
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
            System.out.println((i+1)+"번째 회전 결과는? : ");
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
        }
    }
}
