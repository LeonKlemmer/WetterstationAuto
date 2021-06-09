import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class ShowParameter {

    public ShowParameter() throws FileNotFoundException, InterruptedException {

        GetData data = new GetData();
        Average average = new Average(data.clouds);
        HighLow highLow = new HighLow(data.clouds);
        GUI gui = new GUI();

        data.csvConverter("C:\\Users\\klemm\\Documents\\GitHub\\WetterstationAuto\\Data\\Wetter.csv");// leon surface
        // data.csvConverter("C:\\Users\\klemm\\IdeaProjects\\WetterstationAuto\\Data\\Wetter.csv");
        // //leon main pc generate list with Cloud objekts where data is stored in
        // data.csvConverter("C:\\Irgendwie\\Development\\WetterstationAuto\\Data\\Wetter.csv");

        System.out.println("Average : " + average.getAverage());// get average temp
        System.out.println("Highest : " + highLow.getHighestTemp().getTemprature());
        System.out.println("Lowest : " + highLow.getLowestTemp().getTemprature());

        /*
         * System.out.println("Bubble sort started Lowest "); bubble.bubblesortLowest();
         * System.out.println("Bubble sort started Highest");
         * bubble.bubblesortHighest();
         */
        for (int i = 0; i <= data.clouds.size(); i++) {
            gui.setGuiText(data.clouds.get(i).getLocation(), data.clouds.get(i).getDate(), data.clouds.get(i).getTime(),
                    data.clouds.get(i).getTemprature());

            TimeUnit.SECONDS.sleep(3);
            // TimeUnit.MINUTES.sleep(30);
        }
    }

}