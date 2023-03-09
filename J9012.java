import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class J9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            Stack<Character> vps = new Stack<>();
            boolean flag = false;
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                // 여는 괄호면 스택에 푸쉬
                if(c == '(')
                    vps.push('(');
                // 닫는 괄호인데 pop할 괄호가 없으면 오류
                else if(vps.isEmpty()){
                    sb.append("NO").append('\n');
                    flag = true;
                    break;
                }
                // 닫는 괄호이고 pop할게 있으면
                else
                    vps.pop();
            }
            // 체크가 안되었을 때
            if(flag == false){
                if(vps.isEmpty()){
                    sb.append("YES").append('\n');
                }
                else
                    sb.append("NO").append('\n');
            }
        }

        System.out.println(sb);
    }
}
