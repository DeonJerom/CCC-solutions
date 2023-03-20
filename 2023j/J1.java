import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int delivered = Integer.parseInt(rd.readLine());
        int collision = Integer.parseInt(rd.readLine());

        int score = (delivered * 50) - (collision * 10);

        if(delivered > collision){
            System.out.println(score + 500);
        }else{
            System.out.println(score);
        }
    }
}
