import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 public static void main(String[] args)throws IOException{
	
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	 int antonia = 100;
	 int david  = 100;
	 
	 int rounds;
	 
	 rounds = Integer.parseInt(input.readLine());
	 
	 for(int i=0;i<rounds;i++) {
		 String[] points = input.readLine().split(" ");
		 
		 int ant = Integer.parseInt(points[0]);
		 int dave = Integer.parseInt(points[1]);
		 
		 if(ant > dave) {
			 david -= ant;
		 }else if (dave > ant) {
			antonia -= dave;
		}
 
	 }

	 System.out.println(antonia);
	 System.out.println(david);
	 
 }
}
