import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class baek1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr,(s1,s2)->{
            if(s1.length()!=s2.length()){
                return s1.length()-s2.length();
            }
            return s1.compareTo(s2);
        });
        System.out.println(arr[0]);
        for(int i=1 ; i<n ; i++){
            if(!arr[i-1].equals(arr[i])){
                System.out.println(arr[i]);
            }
        }


    }
}
