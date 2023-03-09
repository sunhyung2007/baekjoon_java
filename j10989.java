// counting 정렬

import java.io.*;

public class j10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[10001];

        //입력된 수의 배열값에 갯수 추가
        for(int i = 0; i < n; i++)
            num[Integer.parseInt(br.readLine())]++;

        br.close();

        //출력
        for(int i = 1; i <10001; i++){
            while(num[i] > 0){
                sb.append(i).append('\n');
                num[i]--;
            }
        }
        System.out.println(sb);
    }
}
