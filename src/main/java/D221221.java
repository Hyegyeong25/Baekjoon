
public class D221221 {
    public static void main(String[] args) {
        int n = 24;
        String s = "";
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                s += i+",";
            }
        }
        String[] ans = s.split(",");
        int[] answer = new int[ans.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(ans[i]);
            System.out.println(answer[i]);
        }
    }
}
