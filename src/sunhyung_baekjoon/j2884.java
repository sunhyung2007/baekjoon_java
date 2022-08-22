// 2022-07-27
// 백준 2438문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;

import java.util.Scanner;

public class j2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		m -= 45;

		if (m < 0) {
			m += 60;
			h -= 1;
			if (h < 0)
				h = 23;
		}
		System.out.println(h + " " + m);
	}

}
