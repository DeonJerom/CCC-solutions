import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	/*
	 * Method to receive groups and check the groups checkBad
	 */
	public static boolean checkGood(String[] good, String[][] groups) {
		
		for(int i=0;i<groups.length;i++) {
			
			if(groups[i][0].equals(good[0])) {
				if(good[1].equals(groups[i][1]) || good[1].equals(groups[i][2])) {
					return true;
				}
			}else if (groups[i][1].equals(good[0])) {
				if(good[1].equals(groups[i][0]) || good[1].equals(groups[i][2])) {
					return true;
				}
			}else if (groups[i][2].equals(good[0])) {
				if(good[1].equals(groups[i][1]) || good[1].equals(groups[i][0])) {
					return true;
				}
			}
			
		}
		
		
		return false;
		
	}
	
	/*
	 * Method to receive groups and check the bad groups
	 */
	public static boolean checkBad(String[] good, String[][] groups) {
		
		for(int i=0;i<groups.length;i++) {
			
			if(groups[i][0].equals(good[0])) {
				if(good[1].equals(groups[i][1]) || good[1].equals(groups[i][2])) {
					return true;
				}
			}else if (groups[i][1].equals(good[0])) {
				if(good[1].equals(groups[i][0]) || good[1].equals(groups[i][2])) {
					return true;
				}
			}else if (groups[i][2].equals(good[0])) {
				if(good[1].equals(groups[i][1]) || good[1].equals(groups[i][0])) {
					return true;
				}
			}
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String names;
        int numb_groups = 0, constraints = 0;
		Scanner scan = new Scanner(System.in);
		
        /*
            People that must be in the same group
         */
        numb_groups = Integer.parseInt(scan.nextLine());
        String[][] same_groups = new String[numb_groups][2];
        for(int i=0;i<same_groups.length;i++){
            names = scan.nextLine();
            same_groups[i] = names.split(" "); 
        }
        
        /*
         People that are not allowed to be grouped
         */
        
        numb_groups = Integer.parseInt(scan.nextLine());
        String[][] bad_groups = new String[numb_groups][2];
        for(int i=0;i<bad_groups.length;i++){
            names = scan.nextLine();
            bad_groups[i] = names.split(" "); 
        }
        
        
        /*
            Enters the three names per group
         */
        
        numb_groups = Integer.parseInt(scan.nextLine());
        String[][] groups = new String[numb_groups][2];
        for(int i=0;i<groups.length;i++){
            names = scan.nextLine();
            groups[i] = names.split(" "); 
        }
		
        
   
        
        // First checking the good groups
        for(int i=0;i<same_groups.length;i++) {
        	if(!checkGood(same_groups[i], groups)) {
        		constraints++;
        	}
        }
        
        // checking the bad groups
        for(int i=0;i<bad_groups.length;i++) {
        	if(checkBad(bad_groups[i], groups)) {
        		constraints++;
        	}
        }
        
        System.out.println(constraints);
        
        
	}
	
}
