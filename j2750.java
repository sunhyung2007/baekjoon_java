import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j2750 {
    static int n;
    static int key;
    static int[] arr;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for(int i = 0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < n; i++){
            key = arr[i];
            for(int j = i-1; j>=0;j--){
                if(key <= arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = key;
                }
                else
                    break;
            }
        }
        for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
}
