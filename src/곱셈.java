import java.util.Scanner;
public class 곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int[] arr = new int[3];
        arr[2] = second/100;
        arr[1] = (second/10)%10;
        arr[0] = second%10;

        int[] blankResult = new int[4];

        for(int i=0 ; i<3 ; i++){
            int blank = multifly(first,arr[i]);
            blankResult[i] = blank;
        }
        int result = blankResult[2]*100 + blankResult[1]*10 + blankResult[0];
        blankResult[3] = result;

        for(int i=0 ; i<4 ; i++){
            System.out.println(blankResult[i]);
        }
    }
    public static int multifly(int first, int eachSecond){
        int result = first * eachSecond;
        return result;
    }
}
