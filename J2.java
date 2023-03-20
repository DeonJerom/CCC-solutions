import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* Author: Deon Jerom
*
*/

public class Main {
	/*
	 * The input will be two lines. The first line will contain V (1 ≤ V ≤ 15), the total number of
	votes. The second line of input will be a sequence of V characters, each of which will be A or B,
	representing the votes for a particular singer.

	 */
 public static void main(String[] args)throws IOException{
	
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	 int aCount = 0;
	 int bCount = 0;
	 
	 Integer.parseInt(input.readLine());
	 
	 char[] arr = input.readLine().toCharArray();
	 
	 for(int i=0;i<arr.length;i++) {
		 
		 if(arr[i]== 'A' ) {
			 aCount++;
		 }else {
			 bCount++;
		 }
		 
	 }
	 
	 if(aCount == bCount) {
		 System.out.println("Tie");
	 }else {
		 if(aCount > bCount) {
			System.out.println("A");
		 }else {
			 System.out.println("B");
		 }
	 }
	 
	 
 }
}
