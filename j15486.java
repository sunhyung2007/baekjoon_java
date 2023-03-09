import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class j15486 {
    static int[] dp;
    static int[][] table;
    static int n, t, p, pay, time;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 입력한 근무일수를 1부터 시작하고 근무가 끝난 다음날 급여를 지급받으므로 n+2 크기로 테이블을 짜준다.

        table = new int[n + 2][2];
        dp = new int[n + 2];

        // table 입력
        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            table[i][0] = t;
            table[i][1] = p;
        }
        pay = -1;
        for(int i = 1; i<=n+1; i++){
            // 현재 받을 수 있는 최대급여와 dp[i]에 계산되어있는 급여와 비교
            if(pay<dp[i])
                pay = dp[i];
            // 날짜를 현재 날짜와 현재 상담의 수행시간을 합친다.
            time = i + table[i][0];
            // 계산된 날짜의 시간이 급여를 받는 날짜를 넘지 않는다면 (즉 수행이 가능한 상담이라면)
            if(time < n+2){
                // dp에 저장되는 값은 dp에 저장되어 있는 급여와 현재 받을 수 있는 최대 급여와
                // 현재 상담을 수행한 후 받는 급여를 합친 값을 비교하여 최종적으로 dp에 저장한다.
                dp[time] = Math.max(dp[time], pay + table[i][1]);
            }
        }
        System.out.println(dp[n+1]);
    }
}
