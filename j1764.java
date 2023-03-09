import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class j1764 {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> no_heard = new HashSet<String>();
        List<String> no_heard_seen = new ArrayList<String>();

        for(int i = 0; i < n; i++)
            no_heard.add(br.readLine());

        for(int i = 0; i < m; i++){
            String no_seen = br.readLine();
            if(no_heard.contains(no_seen))
                no_heard_seen.add(no_seen);
        }

        Collections.sort(no_heard_seen);
        System.out.println(no_heard_seen.size());
        for(int i = 0; i < no_heard_seen.size(); i++)
            System.out.println(no_heard_seen.get(i));
    }
}
