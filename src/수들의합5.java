import java.util.Scanner;
public class 수들의합5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //N입력
        int sum = 1, count = 1;
        int start_idx = 1, end_idx = 1;
        while(end_idx != n){
            if(sum == n){
                count++;
                end_idx++;
                sum+=end_idx;
            }else if(sum>n){
                sum -= start_idx;
                start_idx++;
            }else if(sum<n){
                end_idx++;
                sum += end_idx;
            }
        }
        System.out.print(count);
    }
}
