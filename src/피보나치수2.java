import java.util.Scanner;
public class 피보나치수2 {
    public static long fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        long a=0, b=1, result=0;
        for(int i=2 ; i<=n ; i++){
            result = a+b;
            a = b;
            b = result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = fibonacci(n);
        System.out.println(result);
    }
}
