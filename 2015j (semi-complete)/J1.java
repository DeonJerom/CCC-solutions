import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException {
	    
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int month = 0;
		int day = 0;
		
		month = Integer.parseInt(rd.readLine());
		day = Integer.parseInt(rd.readLine());
		
		if(month == 2 && day == 18){
		    System.out.println("Special");
		}else{
		    if(month == 2 && day > 18){
		        System.out.println("After");
		    }else if(month == 2 && day < 18){
		        System.out.println("Before");
		    }else if(month < 2){
		        System.out.println("Before");
		    }else{
		        System.out.println("After");
		    }
		}
		
	}
}
