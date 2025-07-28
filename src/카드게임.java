import java.util.Scanner;
public class 카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int score = 0;
        for(int i = 0 ; i<5 ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i<5 ; i++){
            score += a[i];
        }
        System.out.print(score);
    }
}
