import java.io.*;
import java.util.*;

public class j1012 {
    static int n, m, k;
    static boolean[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            map = new boolean[n][m];
            int cnt = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = true;
            }
            for (int p = 0; p < n; p++) {
                for (int q = 0; q < m; q++) {
                    if (map[p][q]) {
                        cnt++;
                        map[p][q] = false;
                        dfs(p, q);
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                continue;
            if (map[nx][ny]) {
                map[nx][ny] = false;
                dfs(nx, ny);
            }
        }
    }
}
