import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GetData data = new GetData();
        data.csvConverter("C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv");
    }
}
