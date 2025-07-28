import java.util.Scanner;
public class 사파리월드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        if(N>M) System.out.print(N-M);
        else System.out.println(M-N);
    }
}
