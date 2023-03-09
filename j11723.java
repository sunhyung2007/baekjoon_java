import java.util.*;
import java.io.*;

public class j11723 {
    static int[] set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        set = new int[21];

        for (int i = 0; i < 21; i++)
            set[i] = 0;

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String cal = st.nextToken();
            int x = 0;

            // token이 남아있으면 추가 입력
            if (st.hasMoreTokens())
                x = Integer.parseInt(st.nextToken());

            switch (cal) {
                case "add":
                    set[x] = 1;
                    break;
                case "remove":
                    set[x] = 0;
                    break;
                case "check":
                    bw.write(set[x] + "\n");
                    break;
                case "toggle":
                    // set 1이면 0 아니면 1
                    set[x] = set[x] == 1 ? 0 : 1;
                    break;
                case "all":
                    Arrays.fill(set, 1);
                    break;
                case "empty":
                    Arrays.fill(set, 0);
                    break;
            }
        }
        bw.flush();
    }
}
