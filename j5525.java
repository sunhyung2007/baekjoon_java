import java.io.*;

public class j5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int cnt = 0;
        int ioi = 0;

        String s = br.readLine();
        String[] seq = s.split("");

        // 그냥 ioi를 부분 탐색시킨다.
        // 대신 Pn의 n개수가 맞으면 cnt를 증가시키면 된다.
        // 만일 찾는 부분에서 ioi가 없다면 연속되지 않으므로 연속된 ioi를 초기화 시킨다.
        for (int i = 1; i < m - 1; i++) {
            String ss = seq[i-1] + seq[i] + seq[i+1];
            if (ss.equals("IOI")) {
                ioi++;
                if (ioi == n) {
                    cnt++;
                    ioi--;
                }
                // 맞으면 두칸 옮겨서 확인
                i++;
            } else
                ioi = 0;
        }
        System.out.println(cnt);






        /* 50점짜리 코드
        // 비교할 문자열 만듬
        for (int i = 0; i < n; i++)
            check += "OI";

        // 부분 문자열과 비교
        for (int i = 0; i < m; i++) {
            String s_s = "";

            // 탐색하고자 하는 부분이 문자열 범위 내부인지
            if (i + n * 2 < m - 1) {
                // 탐색할 부분 문자열 만듬
                for (int j = i; j < n * 2 + 1 + i; j++)
                    s_s += seq[j];
                // 비교
                if (s_s.equals(check))
                    cnt++;
            }
        }
        System.out.println(cnt);
         */


    }
}
