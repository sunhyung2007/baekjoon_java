import java.io.*;
import java.util.*;

public class j1389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a, b;
        int[][] map = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = 999999999;

                if (i == j) {
                    map[i][j] = 0;
                }
            }
        }

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println('\n');
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            // 그래프의 간선이 양방향이어야 함으로
            map[a][b] = map[b][a] = 1;
        }

        System.out.println("next" + "\n");

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println('\n');
        }

        // 백준 11403 문제의 플로이드 와샬 알고리즘을 사용한다.
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // 최단경로 초기화
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        System.out.println("next" + "\n");

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println('\n');
        }

        int min = 999999999;
        int kevin = n+1;
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= n; j++)
                temp += map[i][j];
            if (min > temp) {
                min = temp;
                kevin = i;
            }
        }

        System.out.println(kevin);
    }
}
