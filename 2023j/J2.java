import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int spices = Integer.parseInt(rd.readLine());

        int total_spice = 0;

        String[] spice = new String[spices];

        for(int i = 0;i<spices;i++){
            spice[i]  = rd.readLine();
        }

        for(int i = 0;i<spices;i++){
            if(spice[i].equals("Poblano")){
                total_spice += 1500;
            } else if (spice[i].equals("Mirasol")) {
                total_spice += 6000;
            }else if (spice[i].equals("Serrano")) {
                total_spice += 15500;
            }else if (spice[i].equals("Cayenne")) {
                total_spice += 40000;
            }else if (spice[i].equals("Thai")) {
                total_spice += 75000;
            }else if (spice[i].equals("Habanero")) {
                total_spice += 125000;
            }
        }

        System.out.println(total_spice);

    }
}
