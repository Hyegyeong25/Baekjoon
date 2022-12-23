public class D20221223 {
    public static void main(String[] args) {
        /*
        * 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
        * 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
        * */
        D20221223 D = new D20221223();
        System.out.print(D.solution(1082));

    }
    public int solution(int chicken) {
        //1081마리를 주문하면 쿠폰이 1081장 발급되므로
        int answer = chicken/10; // 서비스 치킨 수
        int modcoupon = chicken%10; //나머지 쿠폰
        int servicecoupon = answer; // 서비스 치킨 시켜서 발급한 쿠폰

        while (servicecoupon > 0){
            // 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를 주문할 수 있습니다. 그리고 쿠폰이 8장 남습니다.
            answer += (servicecoupon / 10);
            modcoupon += servicecoupon % 10;
            servicecoupon = servicecoupon / 10;
            if( modcoupon / 10 > 0 ){
                answer += (modcoupon / 10);
                servicecoupon += (modcoupon / 10);
                modcoupon %= 10;
            }
        }
        return answer;
    }

}