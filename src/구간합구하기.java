import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //시스템으로부터 들어오는거 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo+1];

        stringTokenizer = new StringTokenizer(br.readLine()); //한 줄 넘기기

        for(int i=1 ; i<=suNo ; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken()); //구간합 구하기
        }
        for(int q=0 ; q<quizNo ; q++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int i=Integer.parseInt(stringTokenizer.nextToken());
            int j=Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }

    }
}
