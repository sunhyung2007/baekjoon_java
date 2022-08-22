package sunhyung_baekjoon;

import java.util.Scanner;

public class j1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] num = new boolean[1001];
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(find_han(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	
	public static boolean find_han(int n) {
		if(n < 100)
			return true;
		else if(n >= 100 ) {
			if((n / 100) - ((n % 100) / 10) == ((n % 100) / 10) - (n % 10))
				return true;
			else
				return false;
		}
		return false;
	}

}
