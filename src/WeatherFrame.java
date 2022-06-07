import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherFrame extends JFrame {
    private JButton btnCityAccept;
    private JLabel imSun;
    private JTextField tfCity;
    private JLabel lbCity;
    private JLabel imWindy;
    private JPanel mainPanel;
    private JLabel imRainy;
    private JLabel imPoland;
    private JLabel imCloudy;
    private JLabel lbSunny;
    private JLabel lbWindy;
    private JLabel lbRainy;
    private JLabel lbCloudy;
    private JButton btnClear;

    public WeatherFrame() {
        setContentPane(mainPanel);
        setTitle("WeatherApp by MG & JS");
        setSize(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btnCityAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String city = tfCity.getText();
                lbSunny.setText("Słonecznie w mieście: " + city);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbSunny.setText("");
            }
        });
    }


    public static void main(String[] args){
        WeatherFrame myFrame = new WeatherFrame();

    }

    private void createUIComponents(){
        imSun = new JLabel(new ImageIcon("sunny.png"));
        imWindy = new JLabel(new ImageIcon("windy.png"));
        imRainy = new JLabel(new ImageIcon("rain.png"));
        imCloudy= new JLabel(new ImageIcon("cloudy.png"));
        imPoland = new JLabel(new ImageIcon("poland_map.png"));
    }


}
