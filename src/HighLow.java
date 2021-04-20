import java.util.ArrayList;

public class HighLow {
    public ArrayList<Cloud> list;

    public HighLow(ArrayList<Cloud> list) {
        this.list = list;
    }
    public Cloud getHighestTemp(){
        Cloud currentHighest=new Cloud("demo","0","0","0");
        for (int i = 0; i < list.size() - 1; i++) {

            if((int)(Long.parseLong(list.get(i).getTemprature()))>=(int)(Long.parseLong(currentHighest.getTemprature()))){
                currentHighest=list.get(i);
            }
        }

        return currentHighest;
    }
    public Cloud getLowestTemp(){
        Cloud currentLowest=new Cloud("demo","0","0","0");
        for (int i = 0; i < list.size() - 1; i++) {

            if((int)(Long.parseLong(list.get(i).getTemprature()))<=(int)(Long.parseLong(currentLowest.getTemprature()))){
                currentLowest=list.get(i);
            }
        }

        return currentLowest;
    }
}
