package sunhyung_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j11659 {
	static int n, i, j, m;
	static int[] num;
	static int[] sum;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		num = new int[n+1];
		
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) {
			num[i] = num[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			System.out.println(num[j] - num[i-1]);
		}
	}

}
