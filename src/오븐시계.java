import java.util.Scanner;
public class 오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currHour = sc.nextInt();
        int currMin = sc.nextInt();

        int needMint = sc.nextInt();

        int addMin = currMin+needMint;
        if(addMin>59){
            int min = addMin%60;
            int hour = addMin/60;
            int addHour = currHour+hour;
            if(addHour>23){
                hour = addHour%24;
                System.out.print(hour+" "+min);
            }else{
                System.out.print(addHour+" "+min);
            }
        }else{
            System.out.print(currHour+" "+addMin);
        }
    }
}
