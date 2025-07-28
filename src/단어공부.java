import java.util.Scanner;
public class 단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase(); //대소문자구분안하기위해

        int[] alpha = new int[26]; //A~Z 카운트용 배열

        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            alpha[ch-'A']++;
        }

        int max = -1;
        char result = '?';

        for(int i=0 ; i<alpha.length ; i++){
            if(max<alpha[i]){
                max = alpha[i];
                result = (char)(i+'A'); //가장 많이나온 알파벳
            }else if(alpha[i] == max){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
