import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class 나머지합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N]; //합배열
        long[] C = new long[M]; //나머지 인덱스 카운트 할 배열
        long answer = 0; //마무리 답
        st = new StringTokenizer(br.readLine()); //개행추가

        S[0] = Integer.parseInt(st.nextToken()); //첫번째 원소 저장
        for(int i=1 ; i<N ; i++){ //합배열 저장
            S[i] = S[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0 ; i<N ; i++){
            long remainder = S[i]%M;
            if(remainder == 0){ //합배열에서 M나눈 나머지가 0이면 답 개수 하나 증가(구간 하나 찾음)
                answer++;
            }
            C[(int)remainder]++; //인덱스값 하나 증가
        }
        for(int i=0 ; i<M ; i++){
            answer += C[i]*(C[i]-1)/2;
        }

        System.out.println(answer);
    }
}
