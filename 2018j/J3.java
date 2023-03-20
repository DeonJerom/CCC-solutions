import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String[] temp = scan.readLine().split(" ");
		
		int[] list = new int[5];

		list[0] = 0;
		
		int distance = 0;
		
		for(int i = 0;i<list.length - 1;i++) {
			list[i + 1] = Integer.parseInt(temp[i]);
		}

		int[] tab = new int[5];
		
		int[] tab2 = new int[5];
		
		for(int i=0;i<tab.length;i++) {
			if(i != 0) {
				tab[i] = tab[i- 1] + list[i];  
			}else {
				tab[i] = tab[i] + list[i];  
			}
		}
		
		for(int i = 0;i<tab.length;i++) {
			System.out.print(tab[i]+ " ");
		}
		System.out.println();
		
		for(int i =1;i<5;i++) {
			tab2[0] = tab[i];
			getDistance(tab, tab2);
		}
		
		

	}
	public static void getDistance(int[] tab, int[] tab2) {
		
		for(int i=0;i<1;i++) {
			for(int x =0;x<tab.length;x++) {
				int x1 =  tab2[i];
				int x2 =  tab[x];
				
				if(x1 >= x2) {
					int diff = x1 - x2;
					tab2[x]  = diff;
				}else {
					int diff = x2 - x1;
					tab2[x]  = diff;
				}
			}
		}
		
		
		for(int i =0;i<tab2.length;i++) {
			System.out.print(tab2[i]+ " ");
		}
		System.out.println();
	}

}
