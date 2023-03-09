import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class j12015 {
    static int n;
    static int[] arr;
    static int left;
    static int right;
    static int mid;
    static int temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        list.add(0);
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            temp = arr[i];
            if(temp > list.get(list.size()-1))
                list.add(temp);
            else{
                left = 0;
                right = list.size()-1;
                while(left < right){
                   mid = (left + right) / 2;
                   if(temp <= list.get(mid))
                       right = mid;
                   else
                       left = mid + 1;
                }
                list.set(right, temp);
            }
        }
        System.out.println(list.size()-1);
    }
}
