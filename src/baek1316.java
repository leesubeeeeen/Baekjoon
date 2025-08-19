import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class baek1316 {
    public static boolean isGroupWord(String word){
        boolean[] visited = new boolean[26];
        int len = word.length();
        char prev = 0;
        for(int i=0 ; i<len ; i++){
            char curr = word.charAt(i);
            if(prev!=curr){ //문자가 끊겼을때
                if(visited[curr-'a']){
                    return false;
                }
                visited[curr-'a']=true; //방문처리
                prev = curr;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0 ; i<n ; i++){
            String str = br.readLine();
            if(isGroupWord(str)) result++;
        }
        System.out.println(result);


    }
}
