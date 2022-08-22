// 유클리드 호제법을 사용한다.

package sunhyung_baekjoon;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class j2981 {
	static int[] num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		num = new int[n];
		for (int i = 0; i < n; i++)
			num[i] = sc.nextInt();
		Arrays.sort(num);
		int co_fa = 1;

		if (num[n - 1] % num[n - 2] == 0)
			co_fa = num[n - 2];
		else
			co_fa = num[n - 1] % num[n - 2];
		
		//for(int i = n-2)
	}

}
