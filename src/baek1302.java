import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class baek1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //팔린 책 개수
        HashMap<String, Integer> map = new HashMap<String, Integer>(); //이름이랑 빈도 저장
        for(int i=0 ; i<n ; i++){ //책 이름 입력받기
            String str = sc.next(); //책 이름 str에 저장
            if(map.containsKey(str)){ //key가지고 있으면
                map.put(str,map.get(str)+1); //빈도 1 증가 후 저장
            }else{ //key 없으면
                map.put(str,1); //빈도 1인 str 저장
            }
        }
        String maxStr = ""; int maxValue = -1; //아직 없음 상태

        for(Map.Entry<String, Integer> entry : map.entrySet()){ //map의 모든 요소들에 대해서
            String key = entry.getKey();
            int value = entry.getValue();

            if(maxValue < value){ //최대 갱신해야 하는 상황이면
                maxValue = value;
                maxStr = key;
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){ //map의 모든 요소들에 대해서
            String key = entry.getKey();
            int value = entry.getValue();

            if(maxValue == value){ //최대값이 같은 요소에 대해서는 사전순으로 가장 앞서는 제목 출력해야함
                if(maxStr.compareTo(key)>0) maxStr = key; //사전순으로 앞서는 key가 정답 후보인 maxStr이 됨
            }
        }
        System.out.print(maxStr);

    }
}
