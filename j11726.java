import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;

public class j11726 {
    static int n;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[n + 3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        if (n > 2) {
            for (int i = 3; i <= n; i++)
                dp[i] = (dp[i - 1] + dp[i - 2])%10007;
        }
        System.out.println(dp[n]);
    }
}
