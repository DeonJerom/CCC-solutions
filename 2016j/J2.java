import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numb;
        Scanner scan = new Scanner(System.in);
        int point = 0, point2 = 0, point3 = 0, point4 = 0;

        int[][] square = new int[4][4];

        String[] pseudo = new String[4];

        for(int i=0;i<square.length;i++){
            pseudo = scan.nextLine().split(" ");
            for(int x=0;x<pseudo.length;x++) {
                square[i][x] = Integer.parseInt(pseudo[x]);
            }
        }


        for(int i=0;i<square.length;i++) {
            point += square[i][0];
            point2 += square[0][i];
            point3 += square[i][3];
            point4 += square[3][i];
        }

        if(point==point2 && point == point3 && point == point4) {
        	System.out.println("magic");
        }else {
        	System.out.println("not magic");
        }
        	
    }

}
