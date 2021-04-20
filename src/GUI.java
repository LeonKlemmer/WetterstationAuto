import javax.swing.*;
import java.awt.*;
import java.time.temporal.Temporal;
import java.util.Date;

public class GUI {

    int height = 600;
    int width = 350;

    JLabel textLocation;
    JLabel textDate;
    JLabel textTime;
    JLabel textTemperature;
    JLabel textTemperatureMonth;
    JLabel textTemperatureYear;


    public GUI(String location, String date, String time, String temperature, String temperatureMonth, String temperaturYear) {

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
        textLocation.setText("Standort: " + location);
        textLocation.setFont(new Font("Calabri", Font.ITALIC,16));
        textLocation.setForeground(Color.LIGHT_GRAY);
        jf.add(textLocation);

        //Datum
        textDate = new JLabel();
        textDate.setBounds(50, 65, 250, 30);
        textDate.setFont(new Font("Calabri", Font.ITALIC,16));
        textDate.setForeground(Color.LIGHT_GRAY);
        textDate.setText("Datum: " + date);
        jf.add(textDate);

        //Uhrzeit
        textTime = new JLabel();
        textTime.setBounds(50, 105, 250, 30);
        textTime.setText("Uhrzeit: " + time);
        textTime.setFont(new Font("Calabri", Font.ITALIC,16));
        textTime.setForeground(Color.LIGHT_GRAY);
        jf.add(textTime);

        //Temperatur
        textTemperature = new JLabel();
        textTemperature.setBounds(50, 145, 250, 30);
        textTemperature.setText("Temperatur: " + temperature + "°");
        textTemperature.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperature.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperature);

        //MonatDurchschnitt
        textTemperatureMonth = new JLabel();
        textTemperatureMonth.setBounds(50, 185, 250, 30);
        textTemperatureMonth.setText("Monatsdurchschnitt: " + temperatureMonth);
        textTemperatureMonth.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperatureMonth.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperatureMonth);

        //JahresDurchschnitt
        textTemperatureYear = new JLabel();
        textTemperatureYear.setBounds(50, 300, 250, 30);
        textTemperatureYear.setText("Jahresdurchschnitt: " + temperaturYear);
        textTemperatureYear.setFont(new Font("Calabri", Font.ITALIC,16));
        textTemperatureYear.setForeground(Color.LIGHT_GRAY);
        jf.add(textTemperatureYear);

        jf.setVisible(true);

    }

    public void showData(){

    }

}
