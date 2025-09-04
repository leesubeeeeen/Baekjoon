import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class baek1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 666;
        int count = 0;
        while(count<n){
            if(String.valueOf(i).contains("666")) {
                count++;
            }
            if(count == n){
                System.out.print(i);
                return;
            }
            i++;
        }
    }
}
