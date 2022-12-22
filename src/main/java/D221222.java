public class D221222 {
    public static void main(String[] args) {
        int num = 4;
        int total = -46;
        //num개의 연속된 수를 더하여 total 이 되어야함
        int[] answer = new int[num];
        int chk = total;
        int zero = 0;
        while (true){
            for (int i = zero; i < zero+num; i++) {
                chk -= i;
            }
            if(chk == 0) break;
            else if(chk > 0){
                zero++;
            } else if (chk < 0){
                zero--;
            }
            chk = total;

        }
        for (int i = 0; i < num; i++) {
            answer[i] = zero+i;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(answer[i]);
        }
        
    }
}
