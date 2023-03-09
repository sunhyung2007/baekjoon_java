import java.io.*;

public class j11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 어차피 한번 입력한다. 이후에 n은 사용될 일이 없으므로 쓰지 않는다.
        br.readLine();
        int sum = 0;
        /*for(int i = 0; i < n; i++){
            //num = Integer.parseInt(str.charAt(i));

        }*/
        // getbyte로 문자열을 byte배열로 반환한다.
        // for each문으로 문자 하나하나 읽어드린다.
        // utf-16인코딩이므로 각 문자값을 저장하니 '0' 혹은 48을 빼야한다.
        for(byte value : br.readLine().getBytes())
            sum += (value - '0');
        System.out.println(sum);
    }
}
