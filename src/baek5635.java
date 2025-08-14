import java.util.*;

public class baek5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] day = new int[n];
        int[] month = new int[n];
        int[] year = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            day[i] = sc.nextInt();
            month[i] = sc.nextInt();
            year[i] = sc.nextInt();
        }

        int oldestIdx = 0; // 가장 나이 많은 사람
        int youngestIdx = 0; // 가장 나이 적은 사람

        for (int i = 1; i < n; i++) {
            // 나이 많은 사람 찾기 (생일이 빠른 사람)
            if (year[i] < year[oldestIdx] ||
                    (year[i] == year[oldestIdx] && month[i] < month[oldestIdx]) ||
                    (year[i] == year[oldestIdx] && month[i] == month[oldestIdx] && day[i] < day[oldestIdx])) {
                oldestIdx = i;
            }

            // 나이 적은 사람 찾기 (생일이 늦은 사람)
            if (year[i] > year[youngestIdx] ||
                    (year[i] == year[youngestIdx] && month[i] > month[youngestIdx]) ||
                    (year[i] == year[youngestIdx] && month[i] == month[youngestIdx] && day[i] > day[youngestIdx])) {
                youngestIdx = i;
            }
        }

        System.out.println(name[youngestIdx]);
        System.out.println(name[oldestIdx]);
    }
}
