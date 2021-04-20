import javax.swing.*;

public class GUI {

    int height = 600;
    int width = 350;

    JTextField textLocation;
    JTextField textDate;
    JTextField textTime;
    JTextField textTemperature;
    JTextField textTemperatureMonth;
    JTextField textTemperatureYear;

    public GUI() {

        var jf = new JFrame();
        jf.setSize(width, height);
        jf.setTitle("Wetterstation");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);



        //Standort
        textLocation = new JTextField();
        textLocation.setBounds(50, 25, 250, 30);
        textLocation.setEditable(false);
        textLocation.setText("Standort: ");
        jf.add(textLocation);

        //Datum
        textDate = new JTextField();
        textDate.setBounds(50, 65, 250, 30);
        textDate.setEditable(false);
        textDate.setText("Datum: ");
        jf.add(textDate);

        //Uhrzeit
        textTime = new JTextField();
        textTime.setBounds(50, 105, 250, 30);
        textTime.setEditable(false);
        textTime.setText("Uhrzeit: ");
        jf.add(textTime);

        //Temperatur
        textTemperature = new JTextField();
        textTemperature.setBounds(50, 145, 250, 30);
        textTemperature.setEditable(false);
        textTemperature.setText("Temperatur: ");
        jf.add(textTemperature);

        //MonatDurchschnitt
        textTemperatureMonth = new JTextField();
        textTemperatureMonth.setBounds(50, 185, 250, 30);
        textTemperatureMonth.setEditable(false);
        textTemperatureMonth.setText("MonatsDurchschnitt: ");
        jf.add(textTemperatureMonth);

        //JahresDurchschnitt
        textTemperatureYear = new JTextField();
        textTemperatureYear.setBounds(50, 185, 250, 30);
        textTemperatureYear.setEditable(false);
        textTemperatureYear.setText("MonatsDurchschnitt: ");
        jf.add(textTemperatureYear);

        jf.setVisible(true);

    }



}
