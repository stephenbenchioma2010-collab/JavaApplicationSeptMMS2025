import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessGame extends JFrame {
    private int target;
    private int lastDiff = Integer.MAX_VALUE;
    private JTextField input;
    private JLabel hint;
    private final Random rand = new Random();

    public GuessGame() {
        super("Guess the Number");
        setLayout(new BorderLayout(10, 10));
        initGame();

        JLabel prompt = new JLabel(
            "<html>I have a number between 1 and 1000.<br>First guess:</html>");
        prompt.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(prompt, BorderLayout.NORTH);

        input = new JTextField(20);
        input.addActionListener(new GuessHandler());
        add(input, BorderLayout.CENTER);

        hint = new JLabel("Enter your guess above", SwingConstants.CENTER);
        add(hint, BorderLayout.SOUTH);

        JButton again = new JButton("Play Again");
        again.addActionListener(e -> {
            initGame();
            input.setEditable(true);
            input.setText("");
            hint.setText("Enter your guess above");
        });
        add(again, BorderLayout.EAST);

        setSize(450, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initGame() {
        target = rand.nextInt(1000) + 1;
        lastDiff = Integer.MAX_VALUE;
        getContentPane().setBackground(Color.WHITE);
    }

    private class GuessHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int guess = Integer.parseInt(input.getText());
                int diff = Math.abs(guess - target);

                // warmer/colder background
                if (lastDiff != Integer.MAX_VALUE) {
                    getContentPane().setBackground(diff < lastDiff ? Color.RED : Color.BLUE);
                }
                lastDiff = diff;

                if (guess == target) {
                    hint.setText("✅ Correct!");
                    input.setEditable(false);
                } else if (guess < target) {
                    hint.setText("Too Low");
                } else {
                    hint.setText("Too High");
                }
            } catch (NumberFormatException ex) {
                hint.setText("Enter a valid integer");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GuessGame::new);
    }
}