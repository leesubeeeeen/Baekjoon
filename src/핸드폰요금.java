import java.util.Scanner;
public class 핸드폰요금 {
    public static void compare(int y, int m){
        if(y>m){
            System.out.print("M "+m);
        }
        else if(y<m){
            System.out.print("Y "+y);
        }
        else{
            System.out.print("Y M "+y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Mmoney = 0;
        int Ymoney = 0;

        for(int i = 0 ; i<N ; i++){
            int time = sc.nextInt();
            Ymoney += (time/30+1)*10;
            Mmoney += (time/60+1)*15;

        }compare(Ymoney,Mmoney);

    }
}
