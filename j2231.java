import java.io.*;
import java.util.*;

public class j2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0, len = n;
        boolean find = false;

        // 자릿수 찾기
        while(len!=0){
            len /= 10;
            cnt++;
        }

        // 어떤 자리의 수던 9로만 이루어진 최대값을 생각해본다면 자릿수*9를 뺀 값은 절대 생성자가 될 수 없다.
        for(int i = (n - (cnt * 9)); i < n; i++){
            int num = i;
            int sum = 0;
            // 생성자
            while(num!=0){
                sum += num%10;
                num /= 10;
            }
            // 맞는 생성자인지
            if(sum + i == n){
                System.out.println(i);
                find = true;
                break;
            }
        }
        if(!find)
            System.out.println("0");
    }
}
