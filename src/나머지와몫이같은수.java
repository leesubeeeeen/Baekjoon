import java.util.Scanner;
public class 나머지와몫이같은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //n=1
        //0 -> 0
        //n=2 -> 2의 배수는 전부 안됨
        //3 -> 1
        //n=3
        //4,8 -> 1,2
        //n=4
        //5,10,15 ->1,2,3

        //몫이 1~n-1이고 각각 해당하는 나머지도 1~n-1인 수를 찾자
        if(n==1){
            System.out.println(0);
            return;
        }
        long result=0;
        for(int i=0 ; i<n ; i++){
            result += (long)i*(n+1);
        }

        System.out.println(result);

    }
}
