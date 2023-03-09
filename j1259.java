import java.util.*;
import java.io.*;

public class j1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
                break;
            String num = Integer.toString(n);
            pali(num);
        }
    }
    public static void pali(String num){
        boolean check = true;
        for(int i = 0; i < num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length()-1-i)){
                check = false;
                break;
            }
        }
        if(check)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
