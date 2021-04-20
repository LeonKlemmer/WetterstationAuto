import java.io.FileNotFoundException;

public class ShowParameter {



    public ShowParameter() throws FileNotFoundException {

        GetData data = new GetData();
        Average average = new Average(data.clouds);
        HighLow highLow = new HighLow(data.clouds);

        //data.csvConverter("C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv"); //generate list with Cloud objekts where data is stored in
        data.csvConverter("C:\\Irgendwie\\Development\\WetterstationAuto\\Data\\Wetter.csv");
        System.out.println("Average : "+average.getAverage());// get average temp
        System.out.println("Highest : "+highLow.getHighestTemp().getTemprature());
        System.out.println("Lowest : "+highLow.getLowestTemp().getTemprature());


        GUI gui = new GUI(data.clouds.get(1).getLocation(), data.clouds.get(1).getDate(), data.clouds.get(1).getTime(), data.clouds.get(1).getTemprature(), "buy full version","buy full version");

    }

}
