import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class j2748 {
    static long arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new long[n + 1][2];
            for (int j = 0; j < n + 1; j++) {
                arr[j][0] = -1;
                arr[j][1] = -1;
            }

            arr[0][0] = 1;
            arr[0][1] = 0;
            arr[0][0] = 0;
            arr[0][1] = 1;
            fib(n);
            sb.append(arr[n][0] + " " + arr[n][1]).append('\n');
        }
        System.out.println(sb);
    }

    static long[] fib(int n) {
        if (arr[n][0] == -1 || arr[n][1] == -1) {
            arr[n][0] = fib(n - 2)[0] + fib(n - 1)[0];
            arr[n][1] = fib(n - 2)[1] + fib(n - 1)[1];
        }
        return arr[n];
    }
}