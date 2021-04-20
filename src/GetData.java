import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class GetData {
    public void csvConverter(String path) throws FileNotFoundException {

        path = "C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv";
        String line = "";
        try {

            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println(values[1]);
            }
                    } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error csv not found");
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error csv not found");
        }

}}
