import java.util.Scanner;
public class change16to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num16 = sc.next();
        int length = num16.length();
        char[] arr = new char[length];
        for(int i=0 ; i<length ; i++){
            arr[i] = num16.charAt(i);
        }
        int result = 0;
        int digit = length-1;
        int num;
        for(int i=0 ; i<length ; i++){

            if(arr[i] == 'A'){
                num = 10;
            }else if(arr[i] == 'B'){
                num = 11;
            }else if(arr[i] == 'C'){
                num = 12;
            }else if(arr[i] == 'D'){
                num = 13;
            }else if(arr[i] == 'E'){
                num = 14;
            }else if(arr[i] == 'F'){
                num = 15;
            }else{ //integer
                num = Integer.parseInt(String.valueOf(arr[i]));
            }

            if(digit == 0){
                result += num;
                break;
            }

            for(int j=0 ; j<digit ; j++){
                num *= 16;
            }
            result += num;
            digit--;
        }
        System.out.print(result);
    }

}
