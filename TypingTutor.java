import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class TypingTutor extends JFrame {
    private static final int KEY_W = 50, KEY_H = 50;
    private JTextArea typedArea;
    private final List<JButton> keyButtons = new ArrayList<>();
    private Color defaultBg;

    public TypingTutor() {
        super("Virtual Keyboard / Typing Tutor");
        setLayout(new BorderLayout(10,10));

        // Text display
        typedArea = new JTextArea(6,40);
        typedArea.setEditable(false);
        typedArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
        add(new JScrollPane(typedArea), BorderLayout.NORTH);

        // Keyboard panel
        JPanel kbPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3,3,3,3);
        gbc.fill = GridBagConstraints.BOTH;

        String[][] keyRows = {
            {"Q","W","E","R","T","Y","U","I","O","P"},
            {"A","S","D","F","G","H","J","K","L"},
            {"Z","X","C","V","B","N","M"}
        };

        for (int row=0; row<keyRows.length; row++) {
            gbc.gridy = row;
            String[] keys = keyRows[row];
            for (int col=0; col<keys.length; col++) {
                gbc.gridx = col + ((row==1)?1:(row==2)?2:0);
                JButton btn = makeKeyButton(keys[col]);
                kbPanel.add(btn, gbc);
            }
        }
        add(kbPanel, BorderLayout.CENTER);

        // Listen to physical keyboard → highlight virtual keys
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
            .addKeyEventDispatcher(new KeyEventDispatcher() {
                @Override
                public boolean dispatchKeyEvent(KeyEvent e) {
                    String ch = String.valueOf(e.getKeyChar()).toUpperCase();
                    if (e.getID() == KeyEvent.KEY_PRESSED) {
                        highlightKey(ch, true);
                    } else if (e.getID() == KeyEvent.KEY_RELEASED) {
                        highlightKey(ch, false);
                    }
                    return false;
                }
            });

        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton makeKeyButton(String label) {
        JButton btn = new JButton(label);
        btn.setPreferredSize(new Dimension(KEY_W, KEY_H));
        btn.setFont(new Font("SansSerif", Font.BOLD, 16));
        defaultBg = btn.getBackground();
        btn.addActionListener(e -> {
            typedArea.append(label);
        });
        keyButtons.add(btn);
        return btn;
    }

    private void highlightKey(String ch, boolean pressed) {
        for (JButton b : keyButtons) {
            if (b.getText().equalsIgnoreCase(ch)) {
                b.setBackground(pressed ? Color.YELLOW : defaultBg);
                b.setOpaque(pressed);
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TypingTutor::new);
    }
}