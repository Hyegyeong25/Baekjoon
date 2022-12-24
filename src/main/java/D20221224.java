public class D20221224 {
    public static void main(String[] args) {
        D20221224 D = new D20221224();
        int[] sides = {199, 72, 222};
        System.out.print(D.solution(sides));

    }
    public int solution(int[] sides) {
        /* 가장 긴 변을 찾고, 나머지 두 값의 합보다 작으면 1, 크거나 같으면 2 */
        int max = 0;
        int hap = sides[0];
        if(sides[0]>sides[1]) {
            hap = sides[1];
        } else {
            max = 1;
        }
        if(sides[max]<sides[2]) {
            hap+=sides[max];
            max=2;
        } else {
            hap+=sides[2];
        }
        if(sides[max] < hap){
            return 1;
        } else {
            return 2;
        }

//
//        int A = sides[0] + sides[1];
//        int B = sides[1] + sides[2];
//        int C = sides[0] + sides[2];
//
//        if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
//        else return 1;
    }

}