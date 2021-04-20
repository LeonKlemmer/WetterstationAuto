import java.util.ArrayList;

public class Average {
    public ArrayList<Cloud> x;

    public Average(ArrayList<Cloud> x) {
        this.x = x;
    }

    public int getAverage() {
        ArrayList<Cloud> cloudList = x;
        long allVallues=0;
        int average=0;
        for (int i = 0; i < cloudList.size(); i++) {
            allVallues += Long.parseLong(cloudList.get(i).getTemprature());
        }
        average = (int)(allVallues/cloudList.size());

        return average;
    }
}
