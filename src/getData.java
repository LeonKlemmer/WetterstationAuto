import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class getData {
    public static LinkedList csvToList(String path) throws FileNotFoundException {

        LinkedList<String[]> list = new LinkedList<String[]>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

            br.lines().filter(line -> br.getLineNumber() > 1).forEach(line -> {

                String[] fields = path.split(",");

                String mail = fields[0].trim();
                String password = fields[1].trim();
                String[] csv = {mail, password};

                list.add(csv);

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return list;
            });
                    } catch (IOException e) {   // Die geschweifte Klammer vor Catch wird rot unterstrichen



        }     // Und diese ebenfalls

}}
