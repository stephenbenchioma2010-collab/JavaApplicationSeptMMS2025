import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverterFC extends JFrame {
    private JTextField ftf;
    private JLabel resultLabel;

    public TempConverterFC() {
        super("Fahrenheit to Celsius");
        setLayout(new FlowLayout());

        add(new JLabel("Enter Fahrenheit:"));
        ftf = new JTextField(10);
        add(ftf);

        resultLabel = new JLabel("Celsius: --");
        add(resultLabel);

        ftf.addActionListener(new ConvHandler());

        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ConvHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double f = Double.parseDouble(ftf.getText());
                double c = (5.0 / 9.0) * (f - 32);
                resultLabel.setText(String.format("Celsius: %.2f", c));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TempConverterFC::new);
    }
}