// 2022-08-03
// 백준 10870문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;

import java.util.Scanner;

public class J10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
		
	}
	public static int fibonacci(int num) {
		if(num == 0 || num == 1)
			return num;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
