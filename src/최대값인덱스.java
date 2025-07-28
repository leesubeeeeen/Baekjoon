class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int max=0, count = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]) max = arr[i];
        }
        int idx = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(max == arr[i]){
                count++;
            }
        }
        answer = new int[count];
        for(int i=0 ; i<arr.length ; i++){
            if(max == arr[i]){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}
public class 최대값인덱스{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 3, 5, 4, 5, 2, 1};
        System.out.print(s.solution(arr));
    }
}