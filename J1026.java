import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J1026 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int n = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += a[i] * b[n - 1 - i];

        System.out.println(sum);


    }
}
