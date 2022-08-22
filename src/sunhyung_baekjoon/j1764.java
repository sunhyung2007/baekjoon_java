package sunhyung_baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;

		String[] str1 = new String[n];
		String[] str2 = new String[m];
		String str3 = "";

		for (int i = 0; i < n; i++)
			str1[i] = br.readLine();

		for (int j = 0; j < n; j++)
			str2[j] = br.readLine();

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < m; j++) {
				if (str1[i].equals(str2[j])) {
					cnt++;
					flag = true;
				}
			}
			if (flag) {
				str3 = str3 + str1[i] + ",";
			}
		}

	}

}
