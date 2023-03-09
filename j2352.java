import java.io.*;
import java.util.*;

public class j2352 {
    static int[] port;
    static int num, max;
    static int[] port_dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // 포트가 연결되는 포트 번호
        port = new int[n+1];
        port[0] = 0;

        // 포트의 연결되는 최장 부분 수열
        port_dp = new int[n+1];
        port_dp[0] = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            num = Integer.parseInt(st.nextToken());
            port[i] = num;
        }

        max = 1;
        port_dp[1] = port[1];
        for(int i = 2; i <= n; i++){
            if(port[i]>port_dp[max])
                port_dp[++max] = port[i];
            else{
                int index = 0;
                for( index = 1; index <= max; index++){
                    if(port[i] <= port_dp[index])
                        break;
                }
                port_dp[index] = port[i];
            }
        }
        System.out.println(max);
    }
}
