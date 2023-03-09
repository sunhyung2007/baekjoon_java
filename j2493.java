import java.io.*;
import java.util.*;

public class j2493 {
    static int n;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> tower = new Stack<>();

        for (int i = 1; i <= n; i++) {

            int top = Integer.parseInt(st.nextToken());
            while(!tower.isEmpty()){
                if(tower.peek()[1] >= top){
                    System.out.print(tower.peek()[0] + " ");
                    break;
                }
                tower.pop();
            }
            if(tower.isEmpty())
                System.out.print("0 ");
            tower.push(new int[] {i, top});
        }
    }
}
