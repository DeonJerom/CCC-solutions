import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException {
	    
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int happy  = 0;
		int sad = 0;

		String text = rd.readLine().replaceAll(" ", "");
		
		for(int i =0;i<text.length();i++) {
			if(text.charAt(i) == ':') {
				if(text.charAt(i+1) == '-') {
					if(text.charAt(i+2) == ')') {
						happy++;
					}else if (text.charAt(i+2) == '(') {
						sad++;
					}
				}
			}
		}
		
		if(happy > 0 || sad > 0) {
			if(happy == sad) {
				System.out.println("unsure");
			}else {
				if(happy > sad) {
					System.out.println("happy");
				}else {
					System.out.println("sad");
				}
			}
			
		}else {
			System.out.println("none");
		}
	}
}
