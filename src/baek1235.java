import java.util.Scanner;
public class baek1235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] studentID = new String[n];
        for(int i=0 ; i<n ; i++){
            studentID[i] = sc.next(); //학생 ID입력 후 저장
        }
        int k = studentID[0].length(); //최댓값이 기본

        char[] tempArr = new char[studentID[0].length()]; //ID길이는 전부 같으니까
        for(int i=0 ; i<studentID[0].length() ; i++) {
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] = studentID[i].charAt(j); //i번째 문자열의 j번째 인덱스 temp[j]에 저장
            }
            for(int j=0 ; j<tempArr.length ; j++){
                if(i+1 < n){ //인덱스 초과하지 않는 경우에만
                    if(isEqual(tempArr[j],studentID[i+1].charAt(j))){ //같은 거 존재하면

                    }
                }
            }

        }

    }
    static boolean isEqual(char a, char b){ //같으면 true, 다르면 false반환
        return a==b;
    }
}
