import java.io.*;

public class D221215 {
    static void InsertionSort(int[] arr, int n) {
        int temp=0;

        for(int i=2; i<=n; i++) {	// [2]값부터 기준으로 잡음
            temp=arr[i];
            arr[0]=temp;	// [0]에 현재 기준 값 임시 저장

            int j=i-1;	// j는 기준 값의 앞 부분을 가리킴
            while(arr[j] > temp) {	// 기준 값이 들어갈 위치를 찾음
                arr[j+1] = arr[j];	// 현재 값을 다음 자리에 밀어넣음
                j--;	// 한 칸 왼쪽 값을 가리킴
            }
            arr[j+1] = temp;	// 기준 값이 들어갈 위치를 찾았으므로 다음 자리에 기준 값 넣음
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 6;	// 값의 수
        int[] arr = new int[n+1];	// [0]을 비워둬야 하므로 크기는 n+1

        for(int i=1; i<arr.length; i++)
            arr[i] = Integer.parseInt(br.readLine());	// [1]에서부터 값 저장

        InsertionSort(arr, n);	// 삽입정렬 수행

        for(int i=1; i<arr.length; i++)
            bw.write(arr[i]+" ");	// 정렬된 값 출력
        bw.flush();
        bw.close();
    }
}