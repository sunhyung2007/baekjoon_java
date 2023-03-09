import java.io.*;
import java.util.*;

public class test_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] periods = {20,23,24};
        int[][] payments = {{100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000},
                {100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000},{
                100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000
        }};
        int estimates[] = {1000000,100000,100000};
        int[] answer = {0,0};
        int n = periods.length;
        for(int i = 0; i < n; i++){
            int sum_pay = 0;
            int sum_next = 0;
            for(int j = 0; j <12; j++) {
                sum_pay += payments[i][j];
                sum_next += payments[i][j];
            }
            sum_next -= payments[i][0];
            sum_next += estimates[i];

            if(periods[i] == 23 && sum_next >= 900000)
                answer[0]++;
            else if(periods[i] >= 24 && periods[i] < 71 && sum_pay >= 600000 && sum_pay < 900000 && sum_next >= 900000)
                answer[0]++;
            else if(periods[i] >= 24 && periods[i] < 71 && sum_pay >= 900000 && sum_next < 900000)
                answer[1]++;
            else if(periods[i] == 71 && sum_pay >= 600000 && sum_pay < 900000 && sum_next >= 600000)
                answer[0]++;
            else if(periods[i] >= 72 && sum_pay >= 600000 && sum_pay < 900000 && sum_next < 600000)
                answer[1]++;
            else if(periods[i] >= 72 && sum_pay >= 400000 && sum_pay < 600000 && sum_next >= 600000)
                answer[0]++;
        }
        for(int i = 0; i < 2; i++){
            System.out.println(answer[i]);
        }
    }
}
