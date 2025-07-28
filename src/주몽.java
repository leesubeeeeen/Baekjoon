import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int i=0,j=N-1;
        int count = 0;

        while(i<j){
            int sum = A[i]+A[j];
            if(sum>M){
                j--;
            }else if(sum<M){
                i++;
            }else{
                i++;
                j--;
                count++;
            }
        }

        System.out.print(count);
    }
}
