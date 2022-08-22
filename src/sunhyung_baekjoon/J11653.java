// 2022-08-04
// 백준 11653문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n을 입력받는다.
		int n = Integer.parseInt(br.readLine());
		// n의 제곱근까지 탐색한다.
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while(n%i == 0) {
				n /= i;
				System.out.println(i);
			}
		}
		
		// 만일 입력값이 소수라면 자기자신 출력
		if(n != 1)
			System.out.println(n);
	}
}
