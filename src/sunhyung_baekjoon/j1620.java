package sunhyung_baekjoon;

import java.util.Scanner;

public class j1620 {
	public static void main(String[] args) throws NumberFormatException{
		Scanner sc = new Scanner(System.in);
		String[] PoketMon = new String[100001];
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			PoketMon[i] = sc.nextLine();
		}
		for (int i = 0; i < m; i++) {
			String op = sc.nextLine();
			
			if (((int) op.charAt(0) >= 65 && (int) op.charAt(0) <= 90)
					|| ((int) op.charAt(0) >= 97 && (int) op.charAt(0) <= 122)) {
				for (int j = 1; j <= n; j++) {
					if (PoketMon[j].equals(op))
						System.out.println(j);
				}
			}
				
			else {
				System.out.println(PoketMon[Integer.parseInt(op)]);
			}
		}
	}

}
