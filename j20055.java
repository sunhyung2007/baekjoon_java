import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j20055 {
    static int n;
    static int k;
    static int step;
    static boolean[] robot;
    static int[] belt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        belt = new int[n * 2];
        robot = new boolean[n];
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++)
            belt[i] = Integer.parseInt(st.nextToken());

        while (k >= 0) {
            int temp = belt[n * 2 - 1];

            // 벨트의 n*2번째 박스부터 내구도를 옮겨준다.
            for (int i = n * 2 - 1; i > 0; i--)
                belt[i] = belt[i - 1];

            // 첫 번째 박스는 마지막 박스의 내구도이다.
            belt[0] = temp;

            // 벨트가 이동하면서 박스 안의 로봇도 같이 이동한다. 단 내리는 위치전까지 이동한다.
            for (int i = n - 1; i > 0; i--)
                robot[i] = robot[i - 1];

            // 내리는 위치에서는 무조건 로봇을 내리기 때문에 항상 false
            robot[n-1] = false;

            robot[0] = false;

            // 바뀐 벨트의 위치에 따라 로봇들이 한칸씩 이동할 수 있게 한다.
            for (int i = n - 1; i > 0; i--) {
                if (robot[i - 1] && !robot[i] && belt[i] > 0) {
                    robot[i - 1] = false;
                    robot[i] = true;
                    belt[i]--;
                    // 이동한 박스의 내구도가 0이면 k를 줄인다.
                    if (belt[i] == 0)
                        k--;
                }
            }

            // 만일 올리는 위치의 박스스의 내구도가 1이상이 robot이 없다면 로봇을 올려준다
            if (belt[0] > 0) {
                belt[0]--;
                robot[0] = true;
                if(belt[0] == 0)
                    k--;
            }
            step++;
        }
        System.out.println(step);
        br.close();
    }
}
