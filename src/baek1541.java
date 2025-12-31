import java.util.Scanner;
public class baek1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //식
        String[] strArr = str.split("-"); //-단위로 끊어서 저장
        int[] temp = new int[strArr.length]; //합 값을 잠시 저장할 곳
        for(int i=0 ; i<strArr.length ; i++){
            int sum = sum(strArr[i]);
            temp[i] = sum;
        }
        int result = temp[0]; //초기값
        for(int i=1 ; i<temp.length ; i++){
            result -= temp[i];
        }
        System.out.print(result);
    }
    public static int sum(String string){ //string에 존재하는 더하기 식 전부 계산 후 return
        String[] finalArr = string.split("[+]"); //더하기 기호로 나눠서 저장
        int result = 0;
        for(int i=0 ; i<finalArr.length ; i++){
            int num = Integer.parseInt(finalArr[i]);
            result += num; //수 더하기
        }
        return result; //결과 return
    }
}
