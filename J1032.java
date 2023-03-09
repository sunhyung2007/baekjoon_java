import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] seq = new String[n];

        for(int i = 0; i < n; i++){
            seq[i] = br.readLine();
        }

        String temp = seq[0];
        for(int i = 1; i < n; i++){
            StringBuilder sb = new StringBuilder(temp);
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) != seq[i].charAt(j)){
                    sb.setCharAt(j, '?');
                    temp = sb.toString();
                }
            }
        }
        System.out.println(temp);
    }
}
