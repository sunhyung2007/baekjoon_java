import java.io.*;
import java.util.StringTokenizer;

public class j1359 {
    static int n, m, k;

    public static long combination(int n, int r){
        int p = 1;
        int c = 1;
        while(r>0){
            c*=n--;
            p*=r--;
        }
        return c/p;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        double res = 0.0;
        double p = combination(n,m);
        while(m >= k){
            if(n - m < m - k){
                k++;
                continue;
            }
            double c = combination(m,k) * combination(n-m, m-k);
            res *= c/p;
            k++;
        }
        System.out.println(String.format("%.16f", res));
    }
}
