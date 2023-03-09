import java.io.*;
import java.util.*;

public class j2606 {
    static boolean[] check;
    static int[][] graph;
    static int cnt = 0, computer, edge;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        computer = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        graph = new int[computer+1][computer+1];
        check = new boolean[computer+1];

        for(int i = 0; i < edge; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph[node1][node2] = graph[node2][node1] = 1;
        }

        dfs(1);
        System.out.println(cnt-1);
    }

    public static void dfs(int idx){
        check[idx] = true;
        cnt++;
        for(int i = 0; i <= computer; i++){
            if(graph[idx][i] == 1 && !check[i])
                dfs(i);
        }
    }
}
