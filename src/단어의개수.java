import java.util.Scanner;
public class 단어의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.print(0);
        }else{
            String[] words = str.split(" ");
            System.out.println(words.length);
        }

    }
}
