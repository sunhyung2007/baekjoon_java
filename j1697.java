import java.util.*;
import java.io.*;

public class j1697 {
    static int n, k;
    static int[] check = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if(n == k)
            System.out.println(0);
        else
            bfs(n);
    }

    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        check[n] = 1;

        while (!queue.isEmpty()) {
            // 현재 탐색하는 위치
            int idx = queue.poll();

            // 3가지 경우로 bfs탐색
            for (int i = 0; i < 3; i++) {
                int next_idx;
                if (i == 0)
                    next_idx = idx + 1;
                else if (i == 1)
                    next_idx = idx - 1;
                else
                    next_idx = 2 * idx;
                // 찾을시
                if (next_idx == k) {
                    System.out.println(check[idx]);
                    return;
                }

                // 다음 탐색위치가 범위안이고 탐색된적이 없다면
                // 이전 값에 1을 더해서 저장한다.
                if (next_idx >= 0 && next_idx < 100001 && check[next_idx] == 0) {
                    queue.add(next_idx);
                    check[next_idx] = check[idx] + 1;
                }
            }
        }
    }
}
