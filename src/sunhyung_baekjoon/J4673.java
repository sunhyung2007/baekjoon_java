// 2022-08-16
// 백준 4673문제
// 더존비즈온 채용확정형 3기 교육생 김선형

package sunhyung_baekjoon;

public class J4673 {
	static boolean[] num;

	public static void main(String[] args) {

		num = new boolean[10001];
		num[0] = true;
		for (int i = 0; i < num.length; i++) {
			if (!num[i]) {
				System.out.println(i);
				recursion(i);
			}
		}
	}

	public static void recursion(int n) {
		n += n / 1000 + (n % 1000) / 100 + (n % 100) / 10 + n % 10;
		if (n < 10001) {
			num[n] = true;
			recursion(n);
		} else
			return;
	}
}
