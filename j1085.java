import java.io.*;
import java.util.*;

public class j1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken()),y = Integer.parseInt(st.nextToken()),w = Integer.parseInt(st.nextToken()),h = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(Math.min(x, w-x), Math.min(y,h-y)));

    }
}
