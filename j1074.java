import java.util.*;
import java.io.*;

public class j1074 {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int map = (int) Math.pow(2, n);

        divide(map, r, c);
        System.out.println(cnt);
    }

    public static void divide(int map, int r, int c) {
        if (map == 1)
            return;
        // 좌표를 4개로 나눈다. 그리고 탐색
        if (r < map / 2 && c < map / 2)
            divide(map / 2, r, c);
        else if (r < map / 2 && c >= map / 2) {
            cnt += map * map / 4;
            divide(map / 2, r, c - map / 2);
        } else if (r >= map / 2 && c < map / 2) {
            cnt += (map * map / 4) * 2;
            divide(map / 2, r - map / 2, c);
        } else {
            cnt += (map * map / 4) * 3;
            divide(map / 2, r - map / 2, c - map / 2);
        }
    }
}
