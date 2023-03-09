import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        boolean[] map = new boolean[2001];
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            map[num+1000] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < map.length; i++){
            if(map[i])
                sb.append(i-1000).append(" ");
        }
        System.out.println(sb);
    }
}
