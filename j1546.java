import java.io.*;
import java.util.*;

public class j1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double max = -1;
        double sum = 0.0;
        for (double i = 0.0; i < n; i++) {
            double num = Double.parseDouble(st.nextToken());
            if (num > max)
                max = num;
            sum += num;
        }
        System.out.println(((sum / max) * 100.0) / n);
    }
}
