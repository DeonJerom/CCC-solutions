import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		int[] numb = new int[4];
		
		for(int i=0;i<numb.length;i++) {
			numb[i] = Integer.parseInt(scan.readLine());
		}
        
		if((numb[0] == 8 || numb[0] == 9) && (numb[3] == 8 || numb[3] == 9) && (numb[1] == numb[2])) {
			System.out.println("ignore");
		}else {
			System.out.println("answer");
		}

        
	}

}
