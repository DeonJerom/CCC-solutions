import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int regular_box, small_box, left_over;
        int total_cupcake = 0, students = 28;

        Scanner input = new Scanner(System.in);

        regular_box = input.nextInt();
        small_box = input.nextInt();

        total_cupcake += (regular_box * 8);
        total_cupcake += (small_box * 3);

        if(total_cupcake>students){
            left_over = total_cupcake - students;
        }else {
            left_over = students - total_cupcake;
        }

        System.out.println(left_over);

    }
}
