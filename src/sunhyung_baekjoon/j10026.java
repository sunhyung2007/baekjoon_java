package sunhyung_baekjoon;

import java.io.*;
import java.util.*;

public class j10026 {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static char[][] rgb;
	static boolean[][] map;
	static int n;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		map = new boolean[n][n];
		rgb = new char[n][n];

		int cnt_a = 0, cnt_b = 0;

		// 맵 입력받기
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j = 0; j < n; j++)
				rgb[i][j] = str.charAt(j);
		}

		// 일반인 탐색
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!map[i][j]) {
					cnt_a++;
					dfs(i, j);
				}
			}
		}
		// 적록색약일 경우 r과 g의 구분x
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (rgb[i][j] == 'G')
					rgb[i][j] = 'R';
			}
		}

		map = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!map[i][j]) {
					cnt_b++;
					dfs(i, j);
				}
			}
		}
		System.out.println(cnt_a + " " + cnt_b);

	}

	public static void dfs(int x, int y) {
		map[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int next_x = x + dx[i];
			int next_y = y + dy[i];
			if (next_x < 0 || next_y < 0 || next_x >= n || next_y >= n)
				continue;
			if (!map[next_x][next_y] && rgb[x][y] == rgb[next_x][next_y]) {
				dfs(next_x, next_y);
			}
		}

	}

}
