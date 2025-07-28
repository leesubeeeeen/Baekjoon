import java.util.Scanner;
public class 부호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<3 ; i++){
            long sum = 0;
            int N = sc.nextInt();
            for(int j = 0 ; j<N ; j++){
                sum+=sc.nextLong();
            }
            if(sum == 0){
                System.out.println(0);
            }
            else if(sum>0){
                System.out.println("+");
            }
            else{
                System.out.println("-");
            }
        }
    }
}
