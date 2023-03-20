import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String[] time = input.readLine().split(":");
		
		DecimalFormat format = new DecimalFormat("00");	
		
		String arrival = "";
	
		int hour = Integer.parseInt(time[0]);

		double minute = Double.parseDouble(time[1]);

		int minutesLeft = 0;


		for(int i = 1;i<=120;i++) {
		    
			if((hour >=7 && hour<= 10) || (hour >=15 && hour<= 19)) {
				minute+=2;	
			}else {
				minute++;
			}
			
			if(minute>=60) {
				hour++;
				minute = 0;
			}
			
			if(hour == 10 || hour == 19) {
				minutesLeft = 120-i;
				break;
			}
	
		}
		
		minute += minutesLeft;

		while(minute>=60) {
			hour +=1;
			minute -=60;
		}
		
		if(hour > 24) {
			hour -= 24;
		}
		
		if(hour == 24){
		    hour = 0;
		}
		
		
		
		if(hour == 12 && minute == 01){
		    System.out.println(12+":"+format.format(0));
		}else{
		    if(hour<10) {
			    System.out.println("0"+hour+":"+format.format(Math.round(minute)));
    		}else {
			    System.out.println(hour+":"+format.format(Math.round(minute)));
		    }
		}
		
	}
	
}
