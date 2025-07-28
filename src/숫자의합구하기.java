import java.util.Scanner;
public class 숫자의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //숫자의 개수 주어짐
        String str = sc.next(); //숫자 N개가 공백없이 주어짐
        char[] charArray = str.toCharArray(); //char배열로 하나씩 숫자 쪼개기
        int sum = 0;
        for(int i=0 ; i<N ; i++){
            sum+= charArray[i] - '0'; //정수형 변환 후 arr에 저장
        }
        System.out.print(sum);
    }
}
