import java.io.*;
import java.util.*;

public class j2108 {
    static int n, num;

    public static void main(String[] args) throws IOException {

        int sum = 0, max = -4001, min = 4001, median = 4001, mode = 4001, cnt = 0, mode_max = 0;
        double avg = 0.0;
        int[] num_list = new int[8001];
        boolean flag = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            num = Integer.parseInt(br.readLine());
            sum += num;
            // 빈도수 증가
            num_list[num + 4000]++;

            if(max < num)
                max = num;
            if(min > num)
                min = num;
        }

        for(int i = min + 4000; i<= max + 4000; i++){
            if(num_list[i] > 0){
                if(cnt < (n+1)/2){
                    cnt += num_list[i];
                    median = i - 4000;
                }
            }

            if(mode_max < num_list[i]){
                mode_max = num_list[i];
                mode = i - 4000;
                flag = true;
            }
            else if(mode_max == num_list[i] && flag == true){
                mode = i - 4000;
                flag = false;
            }
        }

        System.out.println((int)Math.round((double) sum / n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
