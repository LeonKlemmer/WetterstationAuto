import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class getData {
    public static void csvToArrayList(String path) throws FileNotFoundException {

        ArrayList<String> weatherData = new ArrayList<String>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

            //br.lines().filter()

                String mail = fields[0].trim();
                String password = fields[1].trim();
                String[] csv = {mail, password};

                //weatherData.add(csv);

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return list;

                    } catch (IOException e) {   // Die geschweifte Klammer vor Catch wird rot unterstrichen

            System.out.println("Error while creating List from csv");


        }     // Und diese ebenfalls

}}
