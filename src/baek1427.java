import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class baek1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
        int[] arr = new int[str.length()];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1)); //배열에 넣기
        }

        for(int i=0 ; i<arr.length-1 ; i++){
            int max = arr[i];
            int maxIdx = i;
            for(int j=arr.length-1 ; j>i ; j--){
                if(arr[j]>max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            if(arr[i] != max){ //swap
                int temp = arr[i];
                arr[i] = arr[maxIdx];
                arr[maxIdx] = temp;
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }


    }
}
