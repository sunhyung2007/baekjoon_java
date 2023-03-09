import java.io.*;
import java.util.*;

public class j18258 {
    static int size=0, front=0, back=0;
    static int[] queue = new int[2000000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {

                case "push": {
                    queue[back] = Integer.parseInt(st.nextToken());
                    back++;
                    size++;

                    break;
                }

                case "pop": {
                    if (size == 0)
                        sb.append(-1).append('\n');
                    else {
                        sb.append(queue[front]).append('\n');
                        size--;
                        front++;
                    }
                    break;
                }

                case "size": {
                    sb.append(size).append('\n');
                    break;
                }

                case "empty": {
                    if (size == 0)
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                }

                case "front": {
                    if (size == 0)
                        sb.append(-1).append('\n');
                    else
                        sb.append(queue[front]).append('\n');
                    break;
                }

                case "back": {
                    if (size == 0)
                        sb.append(-1).append('\n');
                    else
                        sb.append(queue[back-1]).append('\n');
                    break;
                }

            }
        }
        System.out.println(sb);
        br.close();
    }
}
