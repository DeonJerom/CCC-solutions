import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.IllegalFormatCodePointException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));


        String[] tunes = scan.readLine().split("");
        
        scan.close();

        
        for(int i=0;i<tunes.length;i++) {
        	
        	if(tunes[i].equals("+")) {
        		tunes[i] = " tighten ";
        	}else if(tunes[i].equals("-") ){
        		tunes[i] = " loosen ";
        	}
        	
        	
        }
        
        for(int i =0;i<tunes.length - 1;i++) {
        	
        	
        	char temp = tunes[i].charAt(0);
        	
        	char temp1 = tunes[i + 1].charAt(0);
        	
        	System.out.print(tunes[i]);
        	
        	if(Character.isDigit(temp) && Character.isAlphabetic(temp1)) {
        		System.out.println();
        	}
        	
        	
        }
        
        System.out.println(tunes[tunes.length - 1]);
 
	}

}
