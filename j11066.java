import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class j11066 {
    static StringTokenizer st;
    static int t,k;
    static int[][] dp;
    static int[] chapter;
    static int[] file;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());
        for(int c = 0; c < t; c++){
            k = Integer.parseInt(br.readLine());

            chapter = new int[k + 1];
            file = new int[k+1];
            dp = new int[k+1][k+1];

            st = new StringTokenizer(br.readLine());

            for(int i = 1; i <=k; i++){
                // 챕터 값 입력 및 임시파일에 최대 경우의 수 값 저장
                chapter[i] = Integer.parseInt(st.nextToken());
                file[i] = file[i-1] + chapter[i];
            }

            for(int i = 1; i < k; i++){
                for(int j = 1; i + j <= k; j++){

                    int s = i + j;
                    dp[j][s] = Integer.MAX_VALUE;
                    // 탐색의 범위를 예를 들면
                    // a b c d
                    // (a,a), (b,d)
                    // (a,b), (c,d)
                    // (a,c), (d,d)
                    // 이런 식으로 탐색을 할 것이기 때문에 j번쨰부터 i까지 탐색을 해주면 된다.
                    for(int a = j; a < s; a++){
                        dp[j][s] = Math.min(dp[j][s], dp[j][a] + dp[a+1][s] + file[s]-file[j-1]);
                    }
                }
            }
            System.out.println(dp[1][k]);
        }
    }
}
