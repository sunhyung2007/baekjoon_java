package sunhyung_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//  상근이의 두 개 수 입력
		String Sanggeun1, Sanggeun2;
		Sanggeun1 = st.nextToken();
		Sanggeun2 = st.nextToken();
		
		// 입력받은 각 3자리의 수를 int로 바꿔줌
		// string을 char로, 거기에 '0'만큼의 아스키코드값을 빼주면 숫자값이 됨
		int n1 = (Sanggeun1.charAt(0) - '0') + (Sanggeun1.charAt(1) - '0') * 10 + (Sanggeun1.charAt(2) - '0') * 100;
		int n2 = (Sanggeun2.charAt(0) - '0') + (Sanggeun2.charAt(1) - '0') * 10 + (Sanggeun2.charAt(2) - '0') * 100;

		System.out.println((n1 > n2) ? n1 : n2);
		
	}

}
