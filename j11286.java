import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class j11286 {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));

        for(int i = 0; i < n; i++){
            int val = Integer.parseInt(br.readLine());
            if(val == 0){
                if(queue.isEmpty())
                    System.out.println(0);
                else
                    //큐의 첫변째 원소 출력 후 삭제
                    System.out.println(queue.poll());
            }
            else
                queue.add(val);
        }
    }
}
