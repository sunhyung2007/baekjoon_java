import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class j1655 {
    static int n;
    static int mid;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        // 우선순위 큐를 선언하면 작은 수가 우선순위 높게 됩니다.
        // 그렇기에 maxheap에는 작은 수와 큰 수를 바꾸도록 하였습니다.
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((o1, o2) -> o2 - o1);


        n = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        mid = 10001;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            // 만약 두 큐의 크기가 같다면 max에 넣어준다.
            if(minheap.size() == maxheap.size())
                maxheap.add(num);
            // 항상 max에 먼저 들어갈 것이기 때문에 else의 경우 min에 들어가면됨
            else
                minheap.add(num);

            if(!minheap.isEmpty() && !maxheap.isEmpty()){

                // min의 부모가 max의 부모보다 값이 작다면 둘의 부모값을 바꿔야 중앙값이 된다.
                if(minheap.peek() < maxheap.peek()){
                    mid = minheap.poll();
                    minheap.add(maxheap.poll());
                    maxheap.add(mid);
                }
            }
            // 중앙값 출력
            sb.append(maxheap.peek() + "\n");
        }
        System.out.println(sb);
    }
}
