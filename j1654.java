import java.io.*;
import java.util.*;

public class j1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] lan = new int[k];

        long max = 0;

        for (int i = 0; i < k; i++) {
            lan[i] = Integer.parseInt(br.readLine());
            if (max < lan[i])
                max = lan[i];
        }

        // mid값이 0이 되는 경우가 있기 때문에 항상 max+1값까지 탐색을 해야한다.
        max++;

        //이분탐색 upper-bound
        long min = 0;
        long mid = 0;
        while (min < max) {

            mid = (min + max) / 2;

            long cnt = 0;

            // cnt에다가 중간 길이로 랜선 잘라서 몇개 만들 수 있나 저장
            for (int i = 0; i < lan.length; i++)
                cnt += (lan[i] / mid);

            // 해당 길이로 잘랐을 때 목표로 하는 개수가 안나오면
            // 길이를 줄이고
            // 그 외에는 전부 길이를 늘려야 한다.
            if (cnt < n)
                max = mid;
            else
                min = mid + 1;
        }
        //upper bound로 얻은 값이므로 -1을 해야 최대길이이다.
        //upper bound는 찾고자 하는 위치를 초과하는 위치를 찾아주기 때문
        System.out.println(min - 1);
    }
}
