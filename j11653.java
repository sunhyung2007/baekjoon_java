import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j11653 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while(n%i == 0) {
                n /= i;
                System.out.println(i);
            }
        }
        if(n != 1)
            System.out.println(n);
    }
}