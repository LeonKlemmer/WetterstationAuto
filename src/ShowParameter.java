import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class ShowParameter {

    GUI gui;

    public ShowParameter() throws FileNotFoundException, InterruptedException {

        GetData data = new GetData();
        Average average = new Average(data.clouds);
        HighLow highLow = new HighLow(data.clouds);

        //data.csvConverter("C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv"); //generate list with Cloud objekts where data is stored in
        data.csvConverter("C:\\Irgendwie\\Development\\WetterstationAuto\\Data\\Wetter.csv");
        System.out.println("Average : "+average.getAverage());// get average temp
        System.out.println("Highest : "+highLow.getHighestTemp().getTemprature());
        System.out.println("Lowest : "+highLow.getLowestTemp().getTemprature());


        for(int i = 0; i <= data.clouds.size(); i++){
            new GUI(data.clouds.get(i).getLocation(), data.clouds.get(i).getDate(), data.clouds.get(i).getTime(), data.clouds.get(i).getTemprature(), "buy full version", "buy full version");

            TimeUnit.SECONDS.sleep(3);
        }
    }

}
