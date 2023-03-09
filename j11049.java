import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class j11049 {
    static int[][] dp;
    static int[][] matrix;
    static int n;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        matrix = new int[n + 1][2];
        dp = new int[n + 1][n + 1];

        // 행열 만들기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        // 행열 곱 저장
        for (int i = 0; i < n; i++)
            dp[i][i + 1] = matrix[i][0] * matrix[i][1] * matrix[i + 1][1];

        for( int i = 2; i < n+1; i++){
            for(int j = 0; i+j < n+1; j++){
                int k = i + j;
                dp[j][k] = Integer.MAX_VALUE;
                for(int l = j; l < k; l++)
                    dp[j][k] = Math.min(dp[j][k], dp[j][l] + dp[l+1][k] + (matrix[j][0] * matrix[l][1] * matrix[k][1]));
            }
        }
        System.out.println(dp[0][n-1]);
    }
}
