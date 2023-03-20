import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int people = Integer.parseInt(rd.readLine());

        int day_1 = 0;
        int day_2 = 0;
        int day_3 = 0;
        int day_4 = 0;
        int day_5 = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        String day = "";

        for(int  i = 0;i< people;i++){

            String[] temp = rd.readLine().split("");

            for(int x = 0;x<temp.length;x++){
                if(x == 0 && temp[x].equals("Y")){
                    day_1 ++;
                } else if (x == 1 && temp[x].equals("Y")) {
                    day_2++;
                }else if (x == 2 && temp[x].equals("Y")) {
                    day_3++;
                }else if (x == 3 && temp[x].equals("Y")) {
                    day_4++;
                }else if (x == 4 && temp[x].equals("Y")) {
                    day_5++;
                }
            }

        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(day_1);
        list.add(day_2);
        list.add(day_3);
        list.add(day_4);
        list.add(day_5);

        int temp = Collections.max(list);

        for(int i =0;i<list.size();i++){
            if(list.get(i) >= temp){
                day += i + 1 +",";
            }
        }

        if(day.charAt(day.length() - 1) == ','){
            System.out.println(day.substring(0,day.length() - 1));
        }else{
            System.out.println(day);
        }

    }
}
