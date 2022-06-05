public class Ex4673 {
    //셀프넘버 판별
    public static int d(int n){
        int result = n; //자기 자신을 더함

        while(n!=0){
            result += (n%10);
            n = n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        boolean[] selfChk = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);
            if(n < 10001) selfChk[n] = true;
        }
        //false 출력
        for (int i = 1; i < 10001; i++) {
            if(!selfChk[i]) System.out.println(i);
        }
    }
}
