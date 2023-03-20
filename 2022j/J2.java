import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int player_count, point_scored, foul, player_star = 0;
        Scanner input = new Scanner(System.in);
        player_count = input.nextInt();

        for (int i=0;i<player_count;i++) {
            point_scored = ( input.nextInt() * 5 ) ;
            foul = ( input.nextInt() * 3);
            if ( point_scored - foul > 40 ) {
                player_star++;
            }

        }

        if( player_star==player_count ) {
            System.out.println(player_star+"+");
        }else{
            System.out.println(player_star);
        }

    }
}
