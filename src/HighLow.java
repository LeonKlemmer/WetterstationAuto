import java.util.ArrayList;

public class HighLow {
    public ArrayList<Cloud> list;

    public HighLow(ArrayList<Cloud> list) {
        this.list = list;
    }
    public Cloud getHighestTemp(){
        Cloud currentHighest=new Cloud("demo","0","0","0");
        for (int i = 0; i < list.size(); i++) {

            if((int)(Long.parseLong(list.get(i).getTemprature()))>=(int)(Long.parseLong(currentHighest.getTemprature()))){
                currentHighest=list.get(i);
            }
        }

        return currentHighest;
    }
    public Cloud getLowestTemp(){
        Cloud currentLowest=new Cloud("demo","3","0","0");
        for (int i = 0; i < list.size(); i++) {

            if(((int)(Long.parseLong(currentLowest.getTemprature()))>=(int)Long.parseLong(list.get(i).getTemprature()))){
                currentLowest=list.get(i);
            }
        }

        return currentLowest;
    }
}
