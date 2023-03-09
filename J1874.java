import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class J1874 {
    static int n;
    static int[] stack;
    static int num, iwc, top;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        stack = new int[n];
        iwc = 0;
        top = 0;

        while (n != 0) {
            num = Integer.parseInt(br.readLine());
            if (num > iwc) {
                for (int i = iwc + 1; i <= num; i++)
                    push(i);
                iwc = num;
            } else if (stack[top - 1] != num) {
                System.out.println("NO");
                return;
            }
            pop();
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        stack[top++] = x;
        sb.append('+').append('\n');
    }

    public static void pop() {
        top--;
        n--;
        sb.append('-').append('\n');
    }
}
