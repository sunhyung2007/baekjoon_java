import java.util.*;
import java.io.*;

public class j1461 {
    static List<Integer> greedy_p,greedy_m;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0, answer = 0;
        boolean cnt = false;

        greedy_p = new ArrayList<Integer>();
        greedy_m = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());

        // 배열에 넣기
        for(int i = 0; i<n; i++){
            int book = Integer.parseInt(st.nextToken());
            if(max < Math.abs(book))
                max = Math.abs(book);
            if(book < 0)
                greedy_m.add(Math.abs(book));
            else
                greedy_p.add(book);
        }

        Collections.sort(greedy_m, Collections.reverseOrder());
        Collections.sort(greedy_p, Collections.reverseOrder());

        // 양수 배열과 최댓값 비교 및 이동거리 갱신
        for(int i = 0; i < greedy_p.size(); i++){
            if(i % m == 0 && greedy_p.get(i) == max && cnt == false){
                answer += max;
                cnt = true;
            }
            else if(i % m == 0)
                answer += (greedy_p.get(i) * 2); 
        }

        // 음수 배열과 최댓값 비교 및 이동거리 갱신
        for(int i = 0; i < greedy_m.size(); i++){
            if(i % m == 0 && greedy_m.get(i) == max && cnt == false)
                answer += max;
            else if(i % m == 0)
                answer += (greedy_m.get(i) * 2);
        }
        
        System.out.println(answer);
    }
}
