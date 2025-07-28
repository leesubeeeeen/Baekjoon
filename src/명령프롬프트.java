import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 명령프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];

        // 파일 이름을 먼저 문자열 배열에 저장하면서 길이를 측정
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
        }

        int len = inputs[0].length();
        char[][] fileName = new char[N][len];  // 행: 파일 수, 열: 파일명 길이

        // fileName[row][col] 구조로 저장
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < len; j++) {
                fileName[i][j] = inputs[i].charAt(j);
            }
        }

        char[] answer = new char[len];

        // 열(column) 기준으로 탐색 (세로 줄 비교)
        for (int col = 0; col < len; col++) {
            boolean same = true;
            char base = fileName[0][col];

            for (int row = 1; row < N; row++) {
                if (fileName[row][col] != base) {
                    same = false;
                    break;
                }
            }

            if (same) {
                answer[col] = base;
            } else {
                answer[col] = '?';
            }
        }

        // 결과 출력
        for (int i = 0; i < len; i++) {
            System.out.print(answer[i]);
        }
    }
}
