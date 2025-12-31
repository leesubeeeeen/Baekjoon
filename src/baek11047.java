import java.util.Scanner;
public class baek11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가지고 있는 동전의 종류의 개수
        int k = sc.nextInt(); //동전을 사용해 만들어야 하는 돈 k원
        int count = 0; //동전 개수 저장용 변수
        int[] value = new int[n]; //동전의 액면가 저장(오름차순)
        for(int i=0 ; i<n ; i++){ //동전의 액면가를 value에 저장
            value[i] = sc.nextInt();
        }
        for(int i=n-1 ; i>=0 ; i--){ //액면가 높은 순부터
            while(value[i]<=k){ //동전 액면가보다 k가 더 크면(거스를 돈 남아있다면)
                k-=value[i]; //value[i]만큼 거스르고 남은 돈
                count++; //동전 개수 하나 증가
            }
        }
        System.out.print(count);

    }
}
