import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class j2740 {

    static int[][] A, B;
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j<m; j++)
                A[i][j] = Integer.parseInt(st.nextToken());
        }
    }
}
