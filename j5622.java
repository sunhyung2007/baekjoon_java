import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j5622 {
    static String seq;
    static int time;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        seq = br.readLine();
        for(int i = 0; i < seq.length(); i++){
            int spell = seq.charAt(i);
            if(spell <= 67)
                time += 3;
            else if(spell <= 70)
                time += 4;
            else if(spell <= 73)
                time += 5;
            else if(spell <= 76)
                time += 6;
            else if(spell <= 79)
                time += 7;
            else if(spell <= 83)
                time += 8;
            else if(spell <= 86)
                time += 9;
            else
                time += 10;
        }
        System.out.println(time);
    }
}
