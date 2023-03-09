import java.io.*;

public class j15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // long인 이유 : 31의 제곱값들이 int의 범위를 넘어갈 수 있어서.
        long answer = 0;
        long pow = 1;
        for(int i = 0; i < l; i++){
            // 입력받은 문자열을 첫 부분부터 a아스키코드값-1을 빼고 pow값을 곱해준다.
            // pow값은 계속 31을 제곱해준다.
            answer += ((str.charAt(i) - 96) * pow);
            pow = (pow * 31) %1234567891;
        }
        System.out.println(answer % 1234567891);
    }
}
