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
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jf.setLayout(null);
        jf.setResizable(false);

        jf.setLocationRelativeTo(null);


        textfield = new JTextField();
        textfield.setBounds(50, 25, 250, 30);
        textfield.setEditable(false);
        textfield.setText("Standort: ");
        jf.add(textfield);


        jf.setVisible(true);

    }



}
