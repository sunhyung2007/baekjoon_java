import java.io.*;
import java.util.*;

public class j1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[] num = new boolean[10];
        int n = Integer.parseInt(br.readLine());
        int botton = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < botton; i++)
            num[Integer.parseInt(st.nextToken())] = true;

        int answer = Math.abs(100 - n);

        for (int i = 0; i < 999999; i++) {
            String str = String.valueOf(i);
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (num[str.charAt(j) - '0']) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int min = Math.abs(n - i) + str.length();
                answer = Math.min(min, answer);
            }
        }
        System.out.println(answer);
    }
}
