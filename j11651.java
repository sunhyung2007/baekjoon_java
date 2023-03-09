import java.io.*;
import java.util.*;

public class j11651 {
    static int n;
    static int[][] coor;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        coor = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            coor[i][1] = Integer.parseInt(st.nextToken());
            coor[i][0] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coor, (e1, e2) -> {
            if (e1[0] == e2[0])
                return e1[1] - e2[1];
            else
                return e1[0] - e2[0];
        });

        for (int i = 0; i < n; i++)
            sb.append(coor[i][1] + " " + coor[i][0]).append('\n');
        System.out.println(sb);
    }
}
