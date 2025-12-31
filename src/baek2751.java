import java.io.*;
import java.util.*;
public class baek2751 {
    public static int[] A, tmp;
    public static void main(String[] args) throws IOException {
        //첫번째 줄에 수의 개수 N
        //두번째 줄에 N개의 줄에 숫자가 주어짐
        //수는 중복되지 않으며 1번째 줄부터 N개의 줄에 오름차순 정렬 결과를 1줄에 1개씩 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼드리더
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //버퍼드라이터
        int n = Integer.parseInt(br.readLine());
        A = new int[n+1];
        tmp = new int[n+1];

        for(int i=1 ; i<n+1 ; i++){
            A[i] = Integer.parseInt(br.readLine()); //수 채워서 A에 담기
        }
        mergeSort(1,n); //1번 인덱스부터 n번 인덱스까지 병합정렬 수행
        for(int i=1 ; i<n+1 ; i++){ //정렬결과 출력 for loop
            bw.write(A[i]+"\n"); //출력
        }
        bw.flush(); //출력버퍼 비우고
        br.close(); //입력버퍼 종료
    }
    public static void mergeSort(int start, int end){
        if(end-start<1){ //정렬해야되는 개수가 1개밖에 없으면
            return; //정렬수행 안해도 됨. 바로 다음단계로 넘어가기(병합)
        }
        int m = (end-start)/2; //중간 원소
        mergeSort(start, m); //start부터 m까지 병합정렬 수행
        mergeSort(m+1, end); //m+1부터 end까지 병합정렬 수행
        for(int i=start ; i<=end ; i++){
            tmp[i] = A[i];
        }
        int k = start;
        int index1 = start;
        int index2 = m+1;
        while(index1<=m && index2 <= end){
            if(tmp[index1]>tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2++;
            }else{
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while(index1<=m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2<=end){
            A[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}
