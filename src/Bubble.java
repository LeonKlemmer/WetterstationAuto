import java.util.ArrayList;

public class Bubble {

    private ArrayList<Cloud> bubbleClouds = new ArrayList<Cloud>();

    public Bubble(ArrayList<Cloud> bubbleClouds) {
        this.bubbleClouds = bubbleClouds;
    }

    public ArrayList<Cloud> bubblesortLowest() {
        Cloud temp;
        for(int i=1; i<bubbleClouds.size(); i++) {
            for(int j=0; j<bubbleClouds.size()-i; j++) {
                if((int)(Long.parseLong(bubbleClouds.get(j).getTemprature()))>(int)(Long.parseLong(bubbleClouds.get(j+1).getTemprature()))) {
                    temp=bubbleClouds.get(j);
                    bubbleClouds.set(j,bubbleClouds.get(j+1));
                    bubbleClouds.set(j+1,temp);
                }

            }


    }for(int g=0; g<bubbleClouds.size(); g++) {
            System.out.println(g);
            System.out.println("Bubble : "+bubbleClouds.get(g).getTemprature());
        }
        return bubbleClouds;
}//niedrigste zuerst



    public ArrayList<Cloud> bubblesortHighest() {
        Cloud temp;
        for(int i=1; i<bubbleClouds.size(); i++) {
            for(int j=0; j<bubbleClouds.size()-i; j++) {
                if((int)(Long.parseLong(bubbleClouds.get(j).getTemprature()))<(int)(Long.parseLong(bubbleClouds.get(j+1).getTemprature()))) {
                    temp=bubbleClouds.get(j);
                    bubbleClouds.set(j,bubbleClouds.get(j+1));
                    bubbleClouds.set(j+1,temp);
                }

            }


        }for(int g=0; g<bubbleClouds.size(); g++) {
            System.out.println(g);
            System.out.println("Bubble : "+bubbleClouds.get(g).getTemprature());
        }
        return bubbleClouds;
    }//Höchste zuerst

}
