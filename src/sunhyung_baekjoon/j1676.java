package sunhyung_baekjoon;

import java.util.Scanner;

public class j1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int two = 0;
		int five = 0;

		for (int i = 1; i <= n; i++) {
			int temp = i;
			while (temp % 2 == 0) {
				if(temp == 0)
					break;
				two++;
				temp /= 2;
			}
			temp = i;
			while (temp % 5 == 0) {
				if(temp == 0)
					break;
				five++;
				temp /= 5;
			}
			
		}
//		System.out.println(two);
//		System.out.println(five);
		System.out.println((two > five) ? five : two );
	}

}
