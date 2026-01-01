import java.util.Arrays;
import java.util.Scanner;

public class baek1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수의 개수. 100이하이다.
        int[] num = new int[n];
        for(int i=0 ; i<n ; i++){
            num[i] = sc.nextInt(); //수 받아서 저장. 수는 1000이하의 자연수
        }
        int result = 0;
        for(int i=0 ; i<n ; i++){
            if(isPrime(num[i])) result++; //소수 맞으면 result증가
        }
        System.out.print(result);

    }
    static boolean isPrime(int n){ //소수판별 메서드
        if(n<2) return false; //만약 n이 2보다 작으면(1이나 0이나 음수) 소수 아님
        for(int i=2 ; i*i<=n ; i++){ //2부터 n제곱근까지 탐색(나누는 수가 i)
            //n=a*b라면 둘 중 하나는 반드시 n제곱근 이하이기에 그 이상 검사는 무의미
            if(n%i==0) return false;
        }
        return true; //나머지 경우에는 소수 맞음
    }
}
