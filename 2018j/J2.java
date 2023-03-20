import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int occupied = 0;
		
		int size = Integer.parseInt(scan.readLine());
		
		char[] yesterday = new char[size];
		
		char[] today = new char[size];
		
		yesterday = scan.readLine().toCharArray();
		today = scan.readLine().toCharArray();

		for(int i=0;i<yesterday.length;i++) {
			if(yesterday[i] == 'C' && today[i] == 'C' ) {
				occupied++;
			}
		}
		
        System.out.println(occupied);
	}

}
