// 2022-07-27
// 백준 2438문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;

import java.util.*;

public class J2438 {
	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner in = new Scanner(System.in);
		
		// 별의 수
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			// 해당 줄의 수에 맞는 별 찍기
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			// 한 줄 찍고 줄바꿈
			System.out.print("\n");
		}
	}
}