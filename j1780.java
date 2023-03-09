import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1780 {
    static int n;
    static int[][] map;
    static int cnt1, cnt2, cnt3;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for(int i = 0; i < n;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<n;j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        sub_map(0,0,n);
        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
    }

    // 처음에는 색깔과 탐색을 동시에 하려 했으나 함수 하나에 너무 복잡하게 들어가서 그냥 분리시켰다.

    public static boolean color(int x, int y, int rc) {
        int point = map[x][y];
        for (int i = x; i < x + rc; i++) {
            for (int j = y; j < y + rc; j++) {
                if (map[i][j] != point)
                    return false;
            }
        }
        return true;
    }

    public static void sub_map(int x, int y, int rc){
        if(color(x,y,rc)){
            if(map[x][y] == -1)
                cnt1++;
            else if(map[x][y] == 0)
                cnt2++;
            else
                cnt3++;
            return;
        }

        int rc3 = rc/3;

        sub_map(x,y,rc3);
        sub_map(x,y+rc3,rc3);
        sub_map(x,y+rc3*2,rc3);
        sub_map(x+rc3,y,rc3);
        sub_map(x+rc3,y+rc3,rc3);
        sub_map(x+rc3, y+rc3*2,rc3);
        sub_map(x+rc3*2,y,rc3);
        sub_map(x+rc3*2,y+rc3,rc3);
        sub_map(x+rc3*2,y+rc3*2,rc3);
    }
}

