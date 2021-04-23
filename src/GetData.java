import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetData {
    public ArrayList<Cloud> clouds = new ArrayList<Cloud>();

    public void csvConverter(String path) throws FileNotFoundException {

        int counter = 0;
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                System.out.println(values[0] + " " + values[1] + " " + values[2] + " " + values[3]);

                clouds.add(new Cloud(values[0], values[1], values[2], values[3]));
                counter++;
            }
            System.out.println(counter);
        } catch (FileNotFoundException e) {

            System.out.println("Error csv not found");
        } catch (IOException e) {

            System.out.println("Error");
        }

    }
}
