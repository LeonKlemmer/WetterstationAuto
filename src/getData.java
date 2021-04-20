import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class getData {
    public void csvConverter(String path) throws FileNotFoundException {

        path = "C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv";
        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

                    } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error while creating List from csv");


        }     // Und diese ebenfalls

}}
