import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 구간합구하기2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); //표의 크기
        int M = Integer.parseInt(stringTokenizer.nextToken()); //합을 구해야 하는 횟수

        int[][]S = new int[N+1][N+1]; //2차원 누적합 배열
        for(int i=1 ; i<=N ; i++){ //row
            stringTokenizer = new StringTokenizer(br.readLine()); //개행
            for(int j=1 ; j<=N ; j++){ //column
                int num = Integer.parseInt(stringTokenizer.nextToken());
                S[i][j] = S[i-1][j]+S[i][j-1]+num-S[i-1][j-1]; //구간합 채우기
            }
        }
        for(int i=0 ; i<M ; i++){ //질의
            stringTokenizer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int sum = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
            System.out.println(sum);
        }

    }
}
