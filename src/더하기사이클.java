import java.util.Scanner;
public class 더하기사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[2];
        int[] sumArr = new int[2];

        int originNum = n;
        int cycle = 1;

        if(n<10){
            num[0] = 0;
            num[1] = n;
        }else{
            num[0] = n/10;
            num[1] = n%10;
        }
        while(true){
            int sum = num[0]+num[1];
            if(sum>=10){
                sumArr[0] = sum/10;
                sumArr[1] = sum%10;
            }else{
                sumArr[0] = 0;
                sumArr[1] = sum;
            }
            num[0] =  num[1];
            //새로운 수 만들기
            num[1] = sumArr[1];

            if(originNum>=10){
                int numHead = originNum/10;
                int numTail = originNum%10;
                if(numHead == num[0] && numTail == num[1]) break;
            }else{
                if(num[0] == 0){
                    if(originNum == num[1]) break; //발견
                }
            }


            cycle++;

        }
        System.out.print(cycle);
    }
}
