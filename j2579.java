import java.io.*;

public class j2579 {
    static int n;
    static int[] score;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        score = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++)
            score[i] = Integer.parseInt(br.readLine());

        // 음수일리는 없으므로 음수로 초기화
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        dp[0] = score[0];
        dp[1] = score[1];

        // 계단이 두 개 밖에 없는 경우
        if (n >= 2)
            dp[2] = score[1] + score[2];

        System.out.println(dp(n));
    }

    public static int dp(int n) {
        // 연속된 3개의 계단을 못 오르므로 점화식은
        // 두 계단을 건너뛴(n-2) 경우와 지금 계단(n)과 다음 계단(n-1)을 오르고 그 다음 다음(n-3)계단을 오른 경우를 비교한다.
        if (dp[n] == -1)
            dp[n] = Math.max(dp(n - 2), dp(n - 3) + score[n - 1]) + score[n];
        return dp[n];
    }
}
