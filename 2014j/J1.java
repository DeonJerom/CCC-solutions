import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/*
	 * If all three angles are 60, output Equilateral.
	? If the three angles add up to 180 and exactly two of the angles are the same, output Isosceles.
	? If the three angles add up to 180 and no two angles are the same, output Scalene.
	? If the three angles do not add up to 180, output Error.

	 */
	
 public static void main(String[] args)throws IOException{
	
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	 
	 int angle1 = 0;
	 int angle2 = 0;
	 int angle3 = 0;
	 int total;
	 
	 angle1 = Integer.parseInt(input.readLine());
	 angle2 = Integer.parseInt(input.readLine());
	 angle3 = Integer.parseInt(input.readLine());
	 
	 total = angle1 + angle2 + angle3;
	 
	 if(total == 180) {
		 
		 if(angle1 == angle2 && angle2 == angle3) {
			 System.out.println("Equilateral");
		 }else if((angle1 == angle2 || angle1 == angle3) || (angle2 == angle3)) {
			 System.out.println("Isosceles");
		 }else {
			 System.out.println("Scalene");
		 }
		 
	 }else{
		System.out.println("Error"); 
	 }
	 
	 
	 
	 
 }
}
