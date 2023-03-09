
// 퀵소트 시간 초과
/*import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j2751 {

    public static void Swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void QuickSort(int[] arr,int left,int right) {
        if(left >= right) return;
        int pivot = arr[right];
        int l = left;
        int r = right-1;

        while(l <= r) {    // 교차하기 전까지 진행
            while(l<=r && arr[l]<=pivot) l++;
            while(l<=r && arr[r]>=pivot) r--;
            if(l<r) Swap(arr,l,r);
        }
        Swap(arr,l,right);
        QuickSort(arr,left,l-1);
        QuickSort(arr,l+1,right);
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(br.readLine().trim());

        QuickSort(arr,0,N-1);

        for(int i=0;i<N;i++)
            sb.append(arr[i]+"\n");

        System.out.println(sb);
    }
}
*/

// 합병정렬
import java.io.*;
import java.util.*;
public class j2751 {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        for(int i : list)
            sb.append(i).append('\n');
        System.out.println(sb);
    }
}