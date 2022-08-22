// 2022-07-29
// 백준 1110문제
// 더존비즈온 채용확정형 3기 교육생 김선형 

package sunhyung_baekjoon;
import java.util.Scanner;
public class J1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int real_n = n;
		// n은 99보다 작은 정수이므로 3자리수가 될 수 없다.
		// 또한 n을 분해해서 둘을 더해도 2자리 정수만 될 수 있다.
		//int n_n = n/10;
		//n = n % 10;
		//int new_n = 100;
		
		int cnt = 0;
		
		
		do{
			//new_n = (n_n + n) % 10 + n * 10;
			//n_n = new_n / 10; 
			//n = new_n % 10;
			n = (n % 10) * 10 + ((n / 10) + (n % 10)) % 10;
			cnt++;
		}
		while(n != real_n);
		System.out.println(cnt);
	}

}
