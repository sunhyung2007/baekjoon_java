import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1769 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();



        long result = check(n);
        System.out.println(cnt);
        if(result % 3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");




    }
    public static Long check(String n){

        String str = String.valueOf(n);
        if(str.length() == 1)
            return Long.parseLong(n);
        long sum = 0;
        cnt++;
        for(int i = 0; i < str.length(); i++)
            sum += str.charAt(i) - '0';

        if(sum >= 10)
            return check(Long.toString(sum));
        else
            return sum;
    }
}
