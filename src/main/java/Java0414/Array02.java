package Java0414;

public class Array02 {
    public static void main(String[] args) {
        // 배열을 복사하는 방법
        int[] arr = new int[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        int[] copy = new int[arr.length*2];
        System.out.println(copy.length);

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
            System.out.println(copy[i]);
        }

        arr = copy; // 기존 3까지만 있었던 메모리 주소를 6으로 늘려줌

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
