import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class 이차원배열의합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [][] arr = new int[n+1][m+1];
        int [][] sArr = new int[n+1][m+1]; //합배열

        for(int i=1 ; i<=n ; i++){ //배열 값 채우기, 누적합 구하기
            st = new StringTokenizer(br.readLine());
            for(int j=1 ; j<=m ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sArr[i][j] = sArr[i-1][j] + sArr[i][j-1] - sArr[i-1][j-1]+arr[i][j];
            }
        }
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        for(int p = 0 ; p<k ; p++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int result = sArr[x][y]-sArr[i-1][y]-sArr[x][j-1]+sArr[i-1][j-1];
            System.out.println(result);
        }
    }
}
