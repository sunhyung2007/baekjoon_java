// 2022-07-27
// 정올 537문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;
import java.util.Scanner;
public class jo537 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 1;
		if(n % 2 != 0)
			sum = n/2+1;
		while(cnt < n) {
			sum += n + cnt;
			cnt++;
			n--;
		}
		System.out.println(sum);
	}
		
	
}
