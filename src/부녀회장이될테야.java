import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class 부녀회장이될테야 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        //0층의 i호에는 i명이 산다.
        for(int i=0 ; i<test ; i++){ //test번만큼 반복
            int k = Integer.parseInt(br.readLine()); //k층
            int n = Integer.parseInt(br.readLine()); //n호

            int[][] apt = new int[k+1][n+1];

            //0열은 아예 비우기
            for(int j=1 ; j<=n ; j++){
                apt[0][j] = j; //0층 j호에 사는 사람들
            }
            for(int row=1 ; row<=k ; row++){ //행
                apt[row][1] = 1; //무조건 1열은 1명들어감
                int sum = 1;
                for(int col=2 ; col<=n ; col++){ //열
                    sum += apt[row-1][col];
                    apt[row][col] = sum;
                }
            }
            System.out.println(apt[k][n]);
        }

    }
}
