import java.io.*;
import java.util.*;

public class j11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++)
                graph[i][j] = Integer.parseInt(st.nextToken());
        }

        // 플로이드 와샬 알고리즘
        // 모든 정점을 탐색해서 지나가는 정점을 기준으로 다른 정점으로의 경로가 있는지 확인
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(graph[i][k] == 1 && graph[k][j] == 1)
                        graph[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                sb.append(graph[i][j] + " ");
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
