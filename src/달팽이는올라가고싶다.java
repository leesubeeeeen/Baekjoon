import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //낮에 올라갈 수 있는 높이
        int b = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 높이
        int v = Integer.parseInt(st.nextToken()); //높이


        //실패한 코드
        //0.25초 안에 해결해야 하기에 O(1)시간 안에 해결해야해 반복문이 아닌 수학적 방법으로 접근했어야 했다.
        //마지막에 도달하려면 미끄러지지 않고 a만큼 올라간다음 끝남
        //도달하기 직전(day-1)에 높이는 v-a
        //하루에 올라갈 수 있는 높이는 a-b
        /*
        int currentHeight = 0; int day=1;
        while(true){
            //day
            currentHeight += a;
            if(currentHeight>=v){
                break;
            }
            //night
            currentHeight-=b;
            day++;
        }
         */

        int day = (v-a) / (a-b);
        if((v-a)%(a-b)!=0){
            day++;
        }
        day+=1; //마지막 날 도달
        System.out.println(day);


    }
}
