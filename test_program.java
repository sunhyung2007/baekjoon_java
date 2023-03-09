import java.io.*;
import java.util.*;

public class test_program {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int[] p = {2,5,3,1,4};
        int n = p.length;

        int[] cnt = new int[n];
        int min = 0;
        for(int i = 0; i < n; i++){
            min++;
            int temp = p[i];
            if(p[i] != min){
                for(int j = i; j < n; j++){
                    if(p[j] == min){
                        p[i] = p[j];
                        p[j] = temp;
                        cnt[i]++;
                        cnt[j]++;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i <n; i++){
            System.out.println(cnt[i]);
        }
    }
}
