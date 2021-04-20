import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GetData data = new GetData();
        Average average = new Average(data.clouds);
        HighLow highLow = new HighLow(data.clouds);

        data.csvConverter("C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv"); //generate list with Cloud objekts where data is stored in
        System.out.println(average.getAverage());// get average temp
        System.out.println(highLow.getHighestTemp().getTemprature());
        System.out.println(highLow.getLowestTemp().getTemprature());
    }
}
