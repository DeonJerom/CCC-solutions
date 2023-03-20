import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

 public static void main(String[] args)throws IOException{
	
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	 int friends ;
	 int rounds = 0;
	 int count = 0;
	 
	 friends = Integer.parseInt(input.readLine());
	 
	 //int[] slot = new int[friends];
	 
	 ArrayList<Integer> slot = new ArrayList<>();
	 
	 for(int i = 1;i<= friends;i++) {
		 slot.add(i) ;
	 }
	 
	 rounds = Integer.parseInt(input.readLine());
	 
	 for(int i=0;i<rounds;i++) {
		 
		 int removal = Integer.parseInt(input.readLine());
		 
		 for(int x = 0;x<slot.size();x++) {		 
			 count += 1;
			 if(count == removal) {
				 slot.set(x, 0);
				 count = 0;
			 }
		 }
		 for(int x = 0;x<slot.size();x++) {		 
			 if(slot.get(x) == 0) {
				 slot.remove(x);
			 }
		 }
		 
	
	 }

	 Collections.sort(slot);

	 for(int i=0;i<slot.size();i++) {
		 System.out.println(slot.get(i));
	 }
		 
 }
 
}
