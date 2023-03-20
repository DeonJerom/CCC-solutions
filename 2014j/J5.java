import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 public static void main(String[] args)throws IOException{
	
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	 int students = 0;
	 int error = 0;
	 
	 students = Integer.parseInt(input.readLine());
	 
	 String[] group1 = input.readLine().split(" ");
	 
	 String[] group2 = input.readLine().split(" ");
	 
	 
	 for(int i =0;i<group1.length;i++) {
		 
		 String name1 = group1[i];
		 String name2 = group2[i];
		 
		 int index = getIndex(group1, name2);
		 
		 if(!name1.equals(group2[index]) || name1.equals(name2)) {
			 error++;
		 }

	 }
	 
	 if(error > 0) {
		 System.out.println("bad");
	 }else {
		 System.out.println("good");
	 }
		 
 }
 public static int getIndex(String[] group1, String regex) {
	 for(int i=0;i<group1.length;i++){
		 if(group1[i].equals(regex)) {
			 return i;
		 }
	 }
	return 0;
		 
 }
 
 /*
  * Rich Graeme Jacob
	Ron Vlado Jacob
  */
 
}
