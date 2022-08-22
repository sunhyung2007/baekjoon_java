package sunhyung_baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j11866 {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//int n = sc.nextInt();
		//int k = sc.nextInt();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		for (int i = 1; i <= n; i++)
			q.add(i);
		sb.append('<');

		// queue가 빌때까지 반복
		while (q.size() > 1) {
			for (int i = 0; i < k - 1; i++) {
				// 넣고 빼고 반복
				int people = q.poll();
				q.offer(people);
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append('>');
		System.out.println(sb);
	}
}
