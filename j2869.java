import java.io.*;
import java.util.*;

public class j2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int cnt = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0)
            cnt++;
        System.out.println(cnt);
    }
}
