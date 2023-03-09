import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class j1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross = 1, cross_sum = 0;

        while (true) {
            if (X <= cross_sum + cross) {

                if (cross % 2 == 1) {
                    System.out.print((cross - (X - cross_sum - 1)) + "/" + (X - cross_sum));
                    break;
                }

                else {
                    System.out.print((X - cross_sum) + "/" + (cross - (X - cross_sum - 1)));
                    break;
                }

            } else {
                cross_sum += cross;
                cross++;
            }
        }
    }
}