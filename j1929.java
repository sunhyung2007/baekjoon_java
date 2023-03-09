import java.io.*;
import java.util.*;

public class j1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] num = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (num[i])
                continue;
            if (i >= m)
                sb.append(i).append('\n');
            for (int j = i + i; j <= n; j += i)
                num[j] = true;

        }
        System.out.println(sb);
    }
}
