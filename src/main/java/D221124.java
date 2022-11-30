
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D221124{
    static int[] road;
    static int[] oilPrice;
    static int[] checkPoint;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        road= new int[n-1];
        oilPrice = new int[n];
        checkPoint = new int[n];

        for(int i=0; i<n-1; i++){
            road[i]=Integer.parseInt(st.nextToken());
        }

        st= new StringTokenizer(br.readLine(), " ");
        int min = 9999; int idx =0;
        for(int i=0; i<n; i++){
            oilPrice[i]=Integer.parseInt(st.nextToken());
            if(min>oilPrice[i]){
                min=oilPrice[i];
                checkPoint[idx++]=i;
            }
        }
        checkPoint[idx]= road.length;

        int totalPrice = 0;
        for(int i=0; i<idx; i++){
            for(int j=checkPoint[i]; j<checkPoint[i+1]; j++){
                totalPrice+= road[j]*oilPrice[checkPoint[i]];
            }
        }

        System.out.println(totalPrice);


    }

}