import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int wins = 0;
		char[] results = new char[6];
		
		for(int i=0;i<results.length;i++) {
			results[i] = read.readLine().charAt(0);
			if(results[i] == 'W') {
				wins++;
			}
		}
		
		if(wins == 0) {
			System.out.println(-1);
		}else {
			if(wins>0 && wins <3) {
				System.out.println(3);
			}else if(wins>= 3 && wins < 5) {
				System.out.println(2);
			}else {
				System.out.println(1);
			}
		}
		
	}

}
