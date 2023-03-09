import java.io.*;
import java.util.*;

public class j11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue <Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            // 만일 0이 입력된 경우
            // QUEUE가 비어있다면 0을 출력, 아니라면 POLL연산을 한다.
            if(num == 0)
                sb.append(queue.size() == 0 ? 0 : queue.poll()).append('\n');
            else
                queue.offer(num);
        }
        System.out.println(sb.toString());
    }
}
