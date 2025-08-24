import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ps = br.readLine();
        String[] strArr = ps.split(" ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr); //정렬
        int temp = 0;
        int result = arr[0];
        for(int i=1 ; i<n ; i++){ //2번째 사람부터
            for(int j=0 ; j<=i ; j++){
                temp += arr[j];
            }
            result += temp;
            temp = 0;
        }
        System.out.println(result);
    }
}
