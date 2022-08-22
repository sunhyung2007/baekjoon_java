package sunhyung_baekjoon;

import java.util.Scanner;

public class J1978 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		boolean flag = true;
//		int cnt = 0;
//		int n = sc.nextInt();
//		int[] arr = new int[n];

		// 전부 탐색 : 시간복잡도 = O(n^2)
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//            flag = true;
//            if(arr[i] == 1)
//            	flag = false;
//            for(int j = 2; j < arr[i]; j++){
//                if(arr[i] % j == 0)
//                    flag = false;
//            }
//            if(flag)
//                cnt++;
//        }

		//  제곱근까지만 계산해주면 됨
		//  시간복잡도 = O(n루트n)
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//			flag = true;
//			if (arr[i] == 1)
//				flag = false;
//			for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
//				if (arr[i] % j == 0)
//					flag = false;
//			}
//			if (flag)
//				cnt++;
//		}
		
		// 에라토스테네스의 체
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		
		boolean[] num_list = new boolean[1001];
		num_list[0] = true;
		num_list[1] = true;
		
		// 에라토스테네스의 체
		// 1000개의 boolean배열에서 소수외의 수 전부 true
		for(int i = 0; i < num_list.length; i++) {
			if(!num_list[i]) {
				for(int j = i * i; j < num_list.length; j += i)
					num_list[j] = true; 
			}
		}

		//int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			 
			if(!num_list[num])
				cnt++;
		}
		System.out.println(cnt);
	}
}