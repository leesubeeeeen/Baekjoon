import java.util.Scanner;
import java.util.Stack;

public class baek1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수열의 개수 n
        int[] arr = new int[n];
        StringBuffer bf = new StringBuffer();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt(); //값 채우기
        }
        Stack<Integer> stack = new Stack<>(); //스택 객체 생성
        int num = 1; //자연수
        boolean flag = false;
        for(int i=0 ; i<n ; i++){ //n번 반복
            if(arr[i] >= num){
                while(arr[i] >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop(); //원하는 수까지 왔으니 pop
                bf.append("-\n");
            }else{ //현재 수열보다 num이 더 크면
                int p = stack.pop();
                if(p!=arr[i]){
                    System.out.println("NO");
                    flag = true;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(!flag){
            System.out.println(bf);
        }

    }
}

//String result = "";
//result = result+"\n";
//이런식으로 해결하면 String은 객체기 때문에 추가되는 게 아니라 계속 새로운 객체가 만들어지게 됨
//그래서 많은 수가 들어오면 메모리가 낭비되며 시간도 훨씬 느려짐. -> 백준에선 메모리 초과 발생