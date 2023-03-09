import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class j1520 {
    static int n, m;
    static int[][] map, dp;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    // 처음으로 nnumber포멧을 써보았다.
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        // 지도 그리기
        map = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            // 한 줄 입력받음
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        // dp 그리기 -1로 초기화
        dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                dp[i][j] = -1;
        }

        bw.write(dfs(1,1) + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int dfs(int x, int y) {
        // 끝점에 도착하면
        if (x == m && y == n)
            return 1;

        // 이미 탐색한 경로면 dp값을 넘겨주어 계산
        if (dp[x][y] != -1)
            return dp[x][y];

        // 현 위치에서 끝점까지 도달하는 경로의 개ㅐ수를 0으로 초기화
        dp[x][y] = 0;

        // 4 방향 탐색
        for (int i = 0; i < 4; i++) {
            int next_dx = x + dx[i];
            int next_dy = y + dy[i];

            // 맵을 벗어나면
            if (next_dx < 1 || next_dy < 1 || next_dx > m || next_dy > n)
                continue;

            // 현재보다 다음 위치가 더 낮다면 다음 위치부터 끝점까지의 경로를 탐색하여 더한다.
            if (map[x][y] > map[next_dx][next_dy])
                dp[x][y] += dfs(next_dx, next_dy);
        }

        return dp[x][y];
    }
}
