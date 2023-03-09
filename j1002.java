import java.io.*;
import java.util.*;

public class j1002 {
    static public void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(turret(x1,y1,r1,x2,y2,r2)).append('\n');
        }
        System.out.println(sb);
    }

    public static int turret(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 두 원이 동일할 때
        if(x1 == x2 && y1 == y2 && r1 == r2)
            return -1;

        // 두 원의 거리가 두 원의 반지름 합보다 길 때
        else if(distance > Math.pow(r1+r2, 2))
            return 0;

        // 원 안에 원이 있는데 내접하지 않을때
        else if(distance < Math.pow(r2-r1, 2))
            return 0;

        // 두 원이 내접할 때
        else if (distance == Math.pow(r2-r1, 2))
            return 1;

        // 두 원이 외접할 때
        else if(distance == Math.pow(r1+r2, 2))
            return 1;

        // 두 원의 교차점이 두 개 일때
        else
            return 2;
    }
}
