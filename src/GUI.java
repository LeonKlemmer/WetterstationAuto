import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class GUI implements ActionListener{

    int height = 600;
    int width = 350;

    JLabel textLocation;
    JLabel textDate;
    JLabel textTime;
    JLabel textTemperature;
    JLabel textTemperatureMonth;
    JLabel textTemperatureYear;

    JButton sortHighest;
    JButton sortLowest;
    JTextArea sortedData;

    Average average;
    HighLow highLow;
    GetData data;
    Bubble bubble;


    public GUI() throws FileNotFoundException, InterruptedException {

        data = new GetData();
        average = new Average(data.clouds);
        highLow = new HighLow(data.clouds);
        bubble = new Bubble(data.clouds);
        data.csvConverter("C:\\Irgendwie\\Development\\WetterstationAuto\\Data\\Wetter.csv");


        var jf = new JFrame();
        jf.setSize(width, height);
        jf.setTitle("Wetterstation");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(Color.DARK_GRAY);



        //Standort
        textLocation = new JLabel();
        textLocation.setBounds(50, 25, 250, 30);
        textLocation.setText("Standort: ");
        textLocation.setFont(new Font("Calabri", Font.ITALIC,16));
        textLocation.setForeground(Color.LIGHT_GRAY);
        jf.add(textLocation);

        //Datum
        textDate = new JLabel();
        textDate.setBounds(50, 75, 250, 30);
        textDate.setFont(new Font("Calabri", Font.ITALIC,16));
        textDate.setForeground(Color.LIGHT_GRAY);
        textDate.setText("Datum: ");
        jf.add(textDate);

        //Uhrzeit
        textTime = new JLabel();
        textTime.setBounds(50, 125, 250, 30);
        textTime.setText("Uhrzeit: ");
        textTime.setFont(new Font("Calabri", Font.ITALIC,16));
        textTime.setForeground(Color.LIGHT_GRAY);
        jf.add(textTime);

        //Temperatur
        textTemperature = new JLabel();
        textTemperature.setBounds(50, 175, 250, 30);
        textTemperature.setText("Temperatur: ");
        textTemperature.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperature.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperature);

        //MonatDurchschnitt
        /*textTemperatureMonth = new JLabel();
        textTemperatureMonth.setBounds(50, 185, 250, 30);
        textTemperatureMonth.setText("Monatsdurchschnitt: ");
        textTemperatureMonth.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperatureMonth.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperatureMonth);

        //JahresDurchschnitt
        textTemperatureYear = new JLabel();
        textTemperatureYear.setBounds(50, 300, 250, 30);
        textTemperatureYear.setText("Jahresdurchschnitt: ");
        textTemperatureYear.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperatureYear.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperatureYear);*/





        //sortHighest
        sortHighest = new JButton();
        sortHighest.setBounds(25, 250, 125, 20);
        sortHighest.setText("Größte Werte");
        sortHighest.setBackground(Color.LIGHT_GRAY);
        sortHighest.setForeground(Color.DARK_GRAY);
        sortHighest.addActionListener(this);
        jf.add(sortHighest);



        //sortLowest
        sortLowest = new JButton();
        sortLowest.setBounds(175, 250, 125, 20);
        sortLowest.setText("Kleinste Werte");
        sortLowest.setBackground(Color.LIGHT_GRAY);
        sortLowest.setForeground(Color.DARK_GRAY);
        sortLowest.addActionListener(this);
        jf.add(sortLowest);


        //sortedData Text Area
        sortedData = new JTextArea(1,10);
        sortedData.setBounds(25, 275, 275, 70);
        sortedData.setBackground(Color.LIGHT_GRAY);
        sortedData.setForeground(Color.DARK_GRAY);
        sortedData.setEditable(false);
        sortedData.setFont(new Font("Calabri", Font.BOLD,12));
        sortedData.setText("Hier könnte deine Werbung stehen!");
        sortedData.setLineWrap(true);

        jf.add(sortedData);


        jf.setVisible(true);


    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sortHighest){

            String saveText;

            saveText = bubble.bubblesortHighest().get(0).getTemprature();
            for (int i = 1; i < data.clouds.size(); i++) {

                saveText = saveText + ", " + bubble.bubblesortHighest().get(i).getTemprature();
            }

            sortedData.setText(saveText);
            saveText = null;

        } else if(e.getSource()==sortLowest){

            String saveText;

            saveText = bubble.bubblesortLowest().get(0).getTemprature();
            for (int i = 1; i < data.clouds.size(); i++) {

                saveText = saveText + ", " + bubble.bubblesortLowest().get(i).getTemprature();
            }

            sortedData.setText(saveText);
            saveText = null;
        }
    }



    //überschreibung der werte
    public void setGuiText(String location, String date, String time, String temperature){
        textLocation.setText("Standort: " + location);
        textDate.setText("Datum: " + date);
        textTime.setText("Uhrzeit: " + time);
        textTemperature.setText("Temperatur: " + temperature + "°");
        //textTemperatureMonth.setText("Monatsdurchschnitt: " + temperatureMonth);
        //textTemperatureYear.setText("Jahresdurchschnitt: " + temperaturYear);
    }







}