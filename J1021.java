import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class J1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        LinkedList<Integer> dequeue = new LinkedList<Integer>();

        int[] num = new int[m];

        for(int i = 1; i <= n; i++)
            dequeue.offer(i);

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++)
            num[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++){
            int index = dequeue.indexOf(num[i]);
            int middle = 0;
            if(dequeue.size() % 2 != 0)
                middle = dequeue.size() / 2;
            else
                middle = dequeue.size() / 2 - 1;

            // 중간보다 앞이라면
            if(index <= middle){
                for(int j = 0; j < index; j++){
                    int temp = dequeue.pollFirst();
                    dequeue.offerLast(temp);
                    cnt++;
                }
            }
            else{
                for(int j = 0; j < dequeue.size() - index; j++){
                    int temp = dequeue.pollLast();
                    dequeue.offerFirst(temp);
                    cnt++;
                }
            }
            dequeue.pollFirst();
        }
        System.out.println(cnt);
    }
}
