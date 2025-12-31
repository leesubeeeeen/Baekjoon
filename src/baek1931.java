import java.util.Arrays;
import java.util.Scanner;
public class baek1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1; //진행 가능한 회의의 최대개수(결과값)
        int[][] meetings = new int[n][2];
        for(int i=0 ; i<n ; i++){
            meetings[i][0] = sc.nextInt(); //start
            meetings[i][1] = sc.nextInt(); //end
        }
        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        }); //1열(end)에 대해서 비교 후 정렬

        int priEnd = meetings[0][1]; //초기 회의의 끝나는 시간(가장 빠름!)
        for(int i=1 ; i<n ; i++){ //회의 개수만큼 for loop 돌리기
            int currStart = meetings[i][0];
            if(priEnd<=currStart) { //회의 진행 가능한 시간대면
                priEnd = meetings[i][1]; //끝나는시간 업데이트
                result++; //진행 가능한 회의 하나 증가
            }
        }
        System.out.print(result);
    }
}
