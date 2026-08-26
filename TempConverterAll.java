import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverterAll extends JFrame {
    private JTextField inputField;
    private JComboBox<String> fromScale, toScale;
    private JLabel resultLabel;

    public TempConverterAll() {
        super("Temperature Converter");
        setLayout(new FlowLayout(10, 10, 10));

        add(new JLabel("Value:"));
        inputField = new JTextField(8);
        add(inputField);

        String[] scales = {"Fahrenheit", "Celsius", "Kelvin"};
        fromScale = new JComboBox<>(scales);
        toScale = new JComboBox<>(scales);
        add(new JLabel("From:")); add(fromScale);
        add(new JLabel("To:"));   add(toScale);

        JButton convertBtn = new JButton("Convert");
        add(convertBtn);
        resultLabel = new JLabel("Result: --");
        add(resultLabel);

        convertBtn.addActionListener(e -> convert());
        inputField.addActionListener(e -> convert());

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private double toCelsius(double val, String scale) {
        return switch (scale) {
            case "Fahrenheit" -> (5.0 / 9.0) * (val - 32);
            case "Kelvin"    -> val - 273.15;
            default          -> val;
        };
    }

    private double fromCelsius(double c, String scale) {
        return switch (scale) {
            case "Fahrenheit" -> (9.0 / 5.0) * c + 32;
            case "Kelvin"    -> c + 273.15;
            default          -> c;
        };
    }

    private void convert() {
        try {
            double val = Double.parseDouble(inputField.getText());
            String from = (String) fromScale.getSelectedItem();
            String to   = (String) toScale.getSelectedItem();
            double c = toCelsius(val, from);
            double res = fromCelsius(c, to);
            resultLabel.setText(String.format("Result: %.2f %s", res, to));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TempConverterAll::new);
    }
}